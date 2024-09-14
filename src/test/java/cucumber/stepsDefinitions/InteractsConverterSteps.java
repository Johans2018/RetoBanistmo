package cucumber.stepsDefinitions;

import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import tasks.SelectNominalEffectiveRate;
import tasks.SelectToolConvert;

/**
 * Definiciones de pasos para interactuar con el convertidor en la página.
 * Esta clase contiene las definiciones de los pasos utilizados en los escenarios de Cucumber para interactuar
 * con el convertidor de tasas. Incluye los pasos necesarios para seleccionar el convertidor y la tasa nominal efectiva.
 */
public class InteractsConverterSteps {

    @When("^interactua con el convertidor$")
    public void interactsConverter() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                new SelectToolConvert(),
                new SelectNominalEffectiveRate()
        );
    }
}
