package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.LocatorsView;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

/**
 * Task que permite al actor interactuar con la sección de "Productos y Servicios" en la plataforma.
 *
 * @author Jonathan Ballesteros
 * @version 1.0
 */
public class SelectProductsAndServices implements Task {

    /**
     * Ejecuta la acción de seleccionar la sección de "Productos y Servicios".
     *
     * @param actor el Actor que realiza la tarea
     * @param <T> tipo de Actor
     */
    @Override
    public <T extends Actor> void performAs(T actor) {
        // Espera hasta que el enlace de "Productos y Servicios" esté presente en el DOM (máximo 20 segundos)
        actor.attemptsTo(WaitUntil.the(LocatorsView.PRODUCTS_AND_SERVICES, isPresent()).forNoMoreThan(20)
                .seconds());
        // Verifica si el aviso de privacidad está visible
        if(LocatorsView.PRIVACY_NOTICE.resolveFor(actor).isVisible()){
            // Hace clic en el botón "Entendido" si el aviso de privacidad se muestra
            actor.attemptsTo(Click.on(LocatorsView.UNDERSTOOD_BUTTON));
        }
        // Hace clic en el enlace de "Productos y Servicios" para acceder a la sección
        actor.attemptsTo(Click.on(LocatorsView.PRODUCTS_AND_SERVICES));
    }
}
