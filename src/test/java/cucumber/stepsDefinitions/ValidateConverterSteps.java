package cucumber.stepsDefinitions;

import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.ValidateValueResultQuestions;
import tasks.EnterValueInterestPeriodicityCapitalization;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class ValidateConverterSteps {

    @Then("^se evidencia el resultado del convertidor$")
    public void resultConverterEvident() {
        String result = "9.54%";
        OnStage.theActorInTheSpotlight().attemptsTo(
                new EnterValueInterestPeriodicityCapitalization()
        );
        OnStage.theActorInTheSpotlight().should(seeThat("Value result", ValidateValueResultQuestions.valueResult()
                , equalTo(result)));
    }

}
