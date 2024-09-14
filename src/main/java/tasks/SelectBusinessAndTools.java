package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.BusinessAndToolsView;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectBusinessAndTools implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BusinessAndToolsView.BUSINESS_BUTTON, isVisible()).forNoMoreThan(20)
                .seconds());
        actor.attemptsTo(Click.on(BusinessAndToolsView.BUSINESS_BUTTON));
        actor.attemptsTo(WaitUntil.the(BusinessAndToolsView.NON_FINANCIAL_SOLUTIONS, isVisible()).forNoMoreThan(20)
                .seconds());
        actor.attemptsTo(Click.on(BusinessAndToolsView.NON_FINANCIAL_SOLUTIONS));
        actor.attemptsTo(WaitUntil.the(BusinessAndToolsView.TOOLS_FIELD, isVisible()).forNoMoreThan(20)
                .seconds());
        actor.attemptsTo(Click.on(BusinessAndToolsView.TOOLS_FIELD));
    }
}
