package cucumber.stepsDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.SelectBusinessAndTools;
import tasks.SelectManageBusinessFinances;


/**
 * Definiciones de pasos para la interacción con la página de Bancolombia en el contexto de pruebas.
 * Esta clase contiene las definiciones de los pasos utilizados en los escenarios de Cucumber para interactuar
 * con la página de Bancolombia, específicamente en el área de negocios y finanzas. Se encarga de configurar el entorno
 * de pruebas y de definir las acciones realizadas por los actores en los escenarios.
 */
public class EnterPageWebBancolombiaSteps {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        WebDriverManager.chromedriver().setup();
    }

    @Given("^(.*) ingresa a la pagina Bancolombia en negocios$")
    public void onTheBancolombiaHomePage(String jonathan) {
        OnStage.theActorCalled(jonathan).attemptsTo(Open.browserOn().thePageNamed("pages.urlGrupoBancolombia"));
        OnStage.theActorInTheSpotlight().attemptsTo(
                new SelectBusinessAndTools()
        );
        OnStage.theActorInTheSpotlight().attemptsTo(
                new SelectManageBusinessFinances()
        );
    }

}
