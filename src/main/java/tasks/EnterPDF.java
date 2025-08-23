package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.LocatorsView;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

/**
 * Task que permite al actor interactuar con el enlace del PDF de Prohibiciones.
 *
 * @author Jonathan Ballesteros
 * @version 1.0
 */
public class EnterPDF implements Task {

    /**
     * Ejecuta la acción de interactuar con el enlace del PDF.
     *
     * @param actor el Actor que realiza la tarea
     * @param <T> tipo de Actor
     */
    @Override
    public <T extends Actor> void performAs(T actor) {
        // Espera hasta que el PDF esté presente en el DOM (máximo 20 segundos)
        actor.attemptsTo(WaitUntil.the(LocatorsView.PDF_PROHIBITIONS, isPresent()).forNoMoreThan(20)
                .seconds());
        // Desplaza la pantalla hasta que el PDF sea visible
        actor.attemptsTo(Scroll.to(LocatorsView.PDF_PROHIBITIONS));
        // Hace clic sobre el enlace del PDF
        actor.attemptsTo(Click.on(LocatorsView.PDF_PROHIBITIONS));
    }
}
