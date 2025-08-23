package cucumber.stepsDefinitions;

import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import tasks.SelectRatesAndFees;
import tasks.SelectLoans;

/**
 * Clase que contiene los Step Definitions de Cucumber relacionados con
 * la navegación a la sección de préstamos de autos en la plataforma Banistmo.
 *
 * @author Jonathan Ballesteros
 * @version 1.0
 */
public class LoansSteps {

    /**
     * Step que permite al actor ingresar a la sección de préstamos de autos
     * y consultar las tarifas y comisiones correspondientes.
     */
    @When("^ingreso a prestamos de auto$")
    public void EnterLoans() {
        // El actor en el foco de atención realiza las Tasks para seleccionar préstamos y tarifas
        OnStage.theActorInTheSpotlight().attemptsTo(
                new SelectLoans(),
                new SelectRatesAndFees()
        );
    }
}
