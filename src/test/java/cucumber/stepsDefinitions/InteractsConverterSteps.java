package cucumber.stepsDefinitions;

import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import tasks.SelectNominalEffectiveRate;
import tasks.SelectToolConvert;

public class InteractsConverterSteps {

    @When("^interactua con el convertidor$")
    public void interactsConverter() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                new SelectToolConvert(),
                new SelectNominalEffectiveRate()
        );
    }
}
