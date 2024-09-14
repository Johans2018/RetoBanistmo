package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.ValueInterestPeriodicityCapitalizationView;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class EnterValueInterestPeriodicityCapitalization implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(ValueInterestPeriodicityCapitalizationView.VALUE_INTEREST_FIELD, isPresent())
                .forNoMoreThan(20).seconds());
        actor.attemptsTo(Enter.theValue("20").into(ValueInterestPeriodicityCapitalizationView.VALUE_INTEREST_FIELD));
        actor.attemptsTo(Click.on(ValueInterestPeriodicityCapitalizationView.PERIODICITY_SELECT));
        actor.attemptsTo(Click.on(ValueInterestPeriodicityCapitalizationView.BIANNUAL_SELECT));
        actor.attemptsTo(Click.on(ValueInterestPeriodicityCapitalizationView.CAPITALIZATION_SELECT));
        actor.attemptsTo(Click.on(ValueInterestPeriodicityCapitalizationView.ANNUAL_SELECT));
    }
}
