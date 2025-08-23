package cucumber.stepsDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;
import tasks.SelectProductsAndServices;

/**
 * Clase que contiene los Step Definitions de Cucumber para la entrada
 * al sitio web de Banistmo Personas y la selección de "Productos y Servicios".
 *
 * @author Jonathan Ballesteros
 * @version 1.0
 */
public class EnterPageWebBanistmoSteps {

    /**
     * Configura el Stage de Screenplay y el driver de Chrome antes de cada escenario.
     */
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        WebDriverManager.chromedriver().setup();
    }

    /**
     * Step que permite a un actor ingresar al sitio web de Banistmo Personas
     * y seleccionar la sección de "Productos y Servicios".
     *
     * @param jonathan nombre del actor que realizará la acción
     */
    @Given("^(.*) ingresa al sitio web Banistmo personas$")
    public void onTheBanistmoHomePage(String jonathan) {
        // Crea o recupera el actor y abre la página principal
        OnStage.theActorCalled(jonathan).attemptsTo(Open.browserOn().thePageNamed("pages.urlGrupoBancolombia"));
        // Maximizar la ventana explícitamente
        WebDriver driver = BrowseTheWeb.as(OnStage.theActorInTheSpotlight()).getDriver();
        driver.manage().window().maximize();
        // El actor selecciona la sección "Productos y Servicios"
        OnStage.theActorInTheSpotlight().attemptsTo(
                new SelectProductsAndServices()
        );
    }
}
