package tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;

import java.io.InputStream;
import java.net.URL;

/**
 * Task que permite al actor validar que un PDF abierto en una pestaña del navegador
 * contiene un texto específico.
 *
 * @author Jonathan Ballesteros
 * @version 1.0
 */
public class ValidatePDFTabContent implements Task {
    private final String expectedText; // Texto esperado

    /**
     * Constructor que inicializa el texto esperado para la validación del PDF.
     *
     * @param expectedText texto que se espera encontrar en el PDF
     */
    public ValidatePDFTabContent(String expectedText) {
        this.expectedText = expectedText;
    }

    /**
     * Método estático para instanciar el Task de manera legible en los scripts de Screenplay.
     *
     * @param expectedText texto que se espera encontrar en el PDF
     * @return una instancia instrumentada del Task
     */
    public static ValidatePDFTabContent containsText(String expectedText) {
        return Tasks.instrumented(ValidatePDFTabContent.class, expectedText);
    }

    /**
     * Ejecuta la validación del PDF abierto en la pestaña del navegador.
     *
     * @param actor el Actor que realiza la tarea
     * @param <T> tipo de Actor
     */
    @Override
    @Step("{0} valida el contenido del PDF abierto en la pestaña")
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        String originalWindow = driver.getWindowHandle();

        // Cambiar a la nueva pestaña (asumiendo que es la última abierta)
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        try {
            // Leer el PDF desde la URL de la pestaña
            String pdfUrl = driver.getCurrentUrl();
            try (InputStream in = new URL(pdfUrl).openStream()) {
                PDDocument document = PDDocument.load(in);
                PDFTextStripper pdfStripper = new PDFTextStripper();
                String pdfText = pdfStripper.getText(document);
                document.close();

                // Validar que el PDF contiene el texto esperado
                if (!pdfText.contains(expectedText)) {
                    throw new AssertionError(
                            "El PDF no contiene el texto esperado. Esperado: " + expectedText
                    );
                }
            }

        } catch (Exception e) {
            throw new IllegalArgumentException("Error leyendo el PDF: " + e.getMessage(), e);
        }

        // Cerrar la pestaña del PDF y regresar a la original
        driver.close();
        driver.switchTo().window(originalWindow);
    }
}
