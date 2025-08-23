package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.LocatorsView;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

/**
 * Task que permite al actor navegar y seleccionar opciones de préstamos en la plataforma Banistmo.
 *
 * @author Jonathan Ballesteros
 * @version 1.0
 */
public class SelectLoans implements Task {

    /**
     * Ejecuta la acción de navegar y seleccionar préstamos.
     *
     * @param actor el Actor que realiza la tarea
     * @param <T> tipo de Actor
     */
    @Override
    public <T extends Actor> void performAs(T actor) {
        // Espera hasta que el menú de préstamos esté presente (máximo 20 segundos)
        actor.attemptsTo(WaitUntil.the(LocatorsView.LOANS, isPresent()).forNoMoreThan(20).seconds());
        // Hace clic en el menú de préstamos
        actor.attemptsTo(Click.on(LocatorsView.LOANS));
        // Espera hasta que el título principal de Banistmo esté presente
        actor.attemptsTo(WaitUntil.the(LocatorsView.TITLE_BANISTMO, isPresent()).forNoMoreThan(20).seconds());
        // Desplaza la pantalla hasta el título principal
        actor.attemptsTo(Scroll.to(LocatorsView.TITLE_BANISTMO));
        // Selecciona la opción de préstamos de autos
        actor.attemptsTo(Click.on(LocatorsView.LOANS_AUTOS));
        // Espera hasta que el título de préstamos esté presente
        actor.attemptsTo(WaitUntil.the(LocatorsView.TITLE_LOANS, isPresent()).forNoMoreThan(20).seconds());
        // Desplaza la pantalla hasta el título de préstamos
        actor.attemptsTo(Scroll.to(LocatorsView.TITLE_LOANS));
        // Hace clic en el título de préstamos para finalizar la selección
        actor.attemptsTo(Click.on(LocatorsView.TITLE_LOANS));
    }
}
