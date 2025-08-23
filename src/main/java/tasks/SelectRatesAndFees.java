package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.LocatorsView;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

/**
 * Task que permite al actor interactuar con la sección de "Tarifas y Comisiones" en la plataforma.
 *
 * @author Jonathan Ballesteros
 * @version 1.0
 */
public class SelectRatesAndFees implements Task {

    /**
     * Ejecuta la acción de seleccionar la sección de "Tarifas y Comisiones".
     *
     * @param actor el Actor que realiza la tarea
     * @param <T> tipo de Actor
     */
    @Override
    public <T extends Actor> void performAs(T actor) {
        // Espera hasta que el enlace de "Tarifas y Comisiones" esté presente en el DOM (máximo 20 segundos)
        actor.attemptsTo(WaitUntil.the(LocatorsView.RATES_AND_FEES, isPresent()).forNoMoreThan(20).seconds());
        // Desplaza la pantalla hasta que el enlace sea visible
        actor.attemptsTo(Scroll.to(LocatorsView.RATES_AND_FEES));
        // Hace clic en el enlace para acceder a la sección de "Tarifas y Comisiones"
        actor.attemptsTo(Click.on(LocatorsView.RATES_AND_FEES));
    }
}
