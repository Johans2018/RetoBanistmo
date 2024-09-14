package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.ManageBusinessFinancesView;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

/**
 * Tarea para seleccionar la tarjeta de gestión de finanzas empresariales.
 *
 */
public class SelectManageBusinessFinances implements Task {

    /**
     * Realiza la tarea de seleccionar la tarjeta de gestión de finanzas empresariales en la interfaz de usuario.
     *
     * @param actor el actor que realiza la tarea.
     */
    @Override
    public <T extends Actor> void performAs(T actor) {
        // Espera a que el botón de flecha derecha sea visible durante un máximo de 20 segundos.
        actor.attemptsTo(WaitUntil.the(ManageBusinessFinancesView.ARROW_RIGHT_BUTTON, isVisible()).forNoMoreThan(20)
                .seconds());
        // Hace clic en el botón de flecha derecha.
        actor.attemptsTo(Click.on(ManageBusinessFinancesView.ARROW_RIGHT_BUTTON));
        // Espera a que la tarjeta de gestión de finanzas empresariales esté presente durante un máximo de 20 segundos.
        actor.attemptsTo(WaitUntil.the(ManageBusinessFinancesView.MANAGE_BUSINESS_FINANCES_CARD, isPresent())
                .forNoMoreThan(20).seconds());
        // Hace clic en la tarjeta de gestión de finanzas empresariales.
        actor.attemptsTo(Click.on(ManageBusinessFinancesView.MANAGE_BUSINESS_FINANCES_CARD));
    }
}
