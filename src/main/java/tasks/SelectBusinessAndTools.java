package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.BusinessAndToolsView;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

/**
 * Tarea para seleccionar opciones en la vista de negocios y herramientas.
 *
 */
public class SelectBusinessAndTools implements Task {

    /**
     * Realiza la tarea de seleccionar opciones en la vista de negocios y herramientas.
     *
     * @param actor el actor que realiza la tarea.
     */
    @Override
    public <T extends Actor> void performAs(T actor) {
        //Espera a que el botón de negocios sea visible durante un máximo de 20 segundos.
        actor.attemptsTo(WaitUntil.the(BusinessAndToolsView.BUSINESS_BUTTON, isVisible()).forNoMoreThan(20)
                .seconds());
        // Hace clic en el botón de negocios.
        actor.attemptsTo(Click.on(BusinessAndToolsView.BUSINESS_BUTTON));
        // Espera a que la sección de soluciones no financieras sea visible durante un máximo de 20 segundos.
        actor.attemptsTo(WaitUntil.the(BusinessAndToolsView.NON_FINANCIAL_SOLUTIONS, isVisible()).forNoMoreThan(20)
                .seconds());
        // Hace clic en la sección de soluciones no financieras.
        actor.attemptsTo(Click.on(BusinessAndToolsView.NON_FINANCIAL_SOLUTIONS));
        // Espera a que el campo de herramientas sea visible durante un máximo de 20 segundos.
        actor.attemptsTo(WaitUntil.the(BusinessAndToolsView.TOOLS_FIELD, isVisible()).forNoMoreThan(20)
                .seconds());
        //Hace clic en el campo de herramientas.
        actor.attemptsTo(Click.on(BusinessAndToolsView.TOOLS_FIELD));
    }
}
