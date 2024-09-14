package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.NominalEffectiveRateView;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class SelectNominalEffectiveRate implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(NominalEffectiveRateView.NOMINAL_EFFECTIVE_RATE_CARD, isPresent())
                .forNoMoreThan(20).seconds());
        actor.attemptsTo(Scroll.to(NominalEffectiveRateView.NOMINAL_EFFECTIVE_RATE_CARD));
        actor.attemptsTo(Click.on(NominalEffectiveRateView.NOMINAL_EFFECTIVE_RATE_CARD));
    }
}
