package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.NominalEffectiveRateView;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

/**
 * Tarea para seleccionar la tarjeta de tasa nominal efectiva en la interfaz de usuario.
 *
 */
public class SelectNominalEffectiveRate implements Task {

    /**
     * Realiza la tarea de seleccionar la tarjeta de tasa nominal efectiva en la interfaz de usuario.
     *
     * @param actor el actor que realiza la tarea.
     */
    @Override
    public <T extends Actor> void performAs(T actor) {
        // Espera a que la tarjeta de tasa nominal efectiva sea visible durante un máximo de 20 segundos.
        actor.attemptsTo(WaitUntil.the(NominalEffectiveRateView.NOMINAL_EFFECTIVE_RATE_CARD, isVisible())
                .forNoMoreThan(20).seconds());
        // Desplaza la vista hasta la tarjeta de tasa nominal efectiva.
        actor.attemptsTo(Scroll.to(NominalEffectiveRateView.NOMINAL_EFFECTIVE_RATE_CARD));
        // Hace clic en la tarjeta de tasa nominal efectiva.
        actor.attemptsTo(Click.on(NominalEffectiveRateView.NOMINAL_EFFECTIVE_RATE_CARD));
    }
}
