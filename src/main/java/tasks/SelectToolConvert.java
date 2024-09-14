package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.ToolConvertView;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class SelectToolConvert implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(ToolConvertView.CONVERT_CARD, isPresent()).forNoMoreThan(20).seconds());
        actor.attemptsTo(Click.on(ToolConvertView.CONVERT_CARD));
    }
}
