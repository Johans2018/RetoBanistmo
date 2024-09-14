package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.ToolConvertView;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

/**
 * Tarea para seleccionar la tarjeta de conversión de herramientas en la interfaz de usuario.
 *
 */
public class SelectToolConvert implements Task {

    /**
     * Realiza la tarea de seleccionar la tarjeta de conversión de herramientas en la interfaz de usuario.
     *
     * @param actor el actor que realiza la tarea.
     */
    @Override
    public <T extends Actor> void performAs(T actor) {
        // Espera a que la tarjeta de conversión de herramientas sea visible durante un máximo de 20 segundos.
        actor.attemptsTo(WaitUntil.the(ToolConvertView.CONVERT_CARD, isVisible()).forNoMoreThan(20).seconds());
        // Hace clic en la tarjeta de conversión de herramientas.
        actor.attemptsTo(Click.on(ToolConvertView.CONVERT_CARD));
    }
}
