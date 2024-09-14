package cucumber.stepsDefinitions;

import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.ValidateValueResultQuestions;
import tasks.EnterValueInterestPeriodicityCapitalization;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Definiciones de pasos para validar el resultado del convertidor en la página.
 * Esta clase contiene las definiciones de los pasos utilizados en los escenarios de Cucumber para verificar
 * el resultado del convertidor de tasas. Incluye el paso necesario para ingresar los valores y validar que el resultado
 * sea el esperado.
 */
public class ValidateConverterSteps {

    @Then("^se evidencia el resultado del convertidor$")
    public void resultConverterEvident() {
        String result = "9.54 %";
        OnStage.theActorInTheSpotlight().attemptsTo(
                new EnterValueInterestPeriodicityCapitalization()
        );
        OnStage.theActorInTheSpotlight().should(seeThat("Value result", ValidateValueResultQuestions.valueResult()
                , equalTo(result)));
    }

}
