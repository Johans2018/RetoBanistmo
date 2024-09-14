package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * Contiene los elementos de la vista de tasa efectiva nominal en la interfaz de usuario.
 * Esta clase define los elementos de la interfaz que se utilizan para interactuar con la vista de tasa efectiva nominal,
 * a través de la localización de los elementos en la página web.
 */
public class NominalEffectiveRateView {

    public static final Target NOMINAL_EFFECTIVE_RATE_CARD = Target.the("Nominal effective rate card")
            .located(By.xpath("//div[@id='btntoolUno']/a"));
}
