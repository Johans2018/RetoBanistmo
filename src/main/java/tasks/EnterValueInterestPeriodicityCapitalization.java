package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.ValueInterestPeriodicityCapitalizationView;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

/**
 * Tarea para ingresar y seleccionar valores en el formulario de interés, periodicidad y capitalización.
 *
 */
public class EnterValueInterestPeriodicityCapitalization implements Task {

    /**
     * Realiza la tarea de ingresar y seleccionar valores en la interfaz de usuario.
     *
     * @param actor el actor que realiza la tarea.
     */
    @Override
    public <T extends Actor> void performAs(T actor) {
        // Espera a que el campo de valor de interés sea visible, durante un máximo de 20 segundos.
        actor.attemptsTo(WaitUntil.the(ValueInterestPeriodicityCapitalizationView.VALUE_INTEREST_FIELD, isVisible())
                .forNoMoreThan(20).seconds());
        // Ingresa el valor "20" en el campo de valor de interés.
        actor.attemptsTo(Enter.theValue("20").into(ValueInterestPeriodicityCapitalizationView.VALUE_INTEREST_FIELD));
        // Hace clic en el selector de periodicidad y elige la opción semestral.
        actor.attemptsTo(Click.on(ValueInterestPeriodicityCapitalizationView.PERIODICITY_SELECT));
        actor.attemptsTo(Click.on(ValueInterestPeriodicityCapitalizationView.BIANNUAL_SELECT));
        actor.attemptsTo(Click.on(ValueInterestPeriodicityCapitalizationView.CAPITALIZATION_SELECT));
        // Hace clic en el selector de capitalización y elige la opción anual.
        actor.attemptsTo(Click.on(ValueInterestPeriodicityCapitalizationView.ANNUAL_SELECT));
    }
}
