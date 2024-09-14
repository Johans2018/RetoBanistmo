package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.ManageBusinessFinancesView;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class SelectManageBusinessFinances implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(ManageBusinessFinancesView.ARROW_RIGHT_BUTTON, isPresent()).forNoMoreThan(20)
                .seconds());
        actor.attemptsTo(Click.on(ManageBusinessFinancesView.ARROW_RIGHT_BUTTON));
        actor.attemptsTo(WaitUntil.the(ManageBusinessFinancesView.MANAGE_BUSINESS_FINANCES_CARD, isPresent())
                .forNoMoreThan(20).seconds());
        actor.attemptsTo(Click.on(ManageBusinessFinancesView.MANAGE_BUSINESS_FINANCES_CARD));
    }
}
