package cucumber.stepsDefinitions;

import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import tasks.EnterPDF;
import tasks.ValidatePDFTabContent;

/**
 * Clase que contiene los Step Definitions de Cucumber para la validación
 * de PDFs en la plataforma Banistmo.
 *
 * @author Jonathan Ballesteros
 * @version 1.0
 */
public class ValidatePDFSteps {

    /**
     * Step que permite al actor validar el contenido de un PDF específico.
     *
     * @param title texto esperado que debe contener el PDF
     */
    @Then("^valido el PDF de (.*)")
    public void validatePDF(String title) {
        // El actor hace clic en el enlace del PDF y valida su contenido
        OnStage.theActorInTheSpotlight().attemptsTo(
                new EnterPDF(),
                ValidatePDFTabContent.containsText(title)
        );
    }
}
