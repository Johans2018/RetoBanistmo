package cucumber.stepsDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.SelectBusinessAndTools;
import tasks.SelectManageBusinessFinances;

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
