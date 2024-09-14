package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * Contiene los elementos de la vista de gestión de finanzas empresariales en la interfaz de usuario.
 * Esta clase define los elementos de la interfaz que se utilizan para interactuar con la vista de gestión de finanzas empresariales,
 * a través de la localización de los elementos en la página web.
 */
public class ManageBusinessFinancesView {

    public static final Target ARROW_RIGHT_BUTTON = Target.the("Arrow right").located(By
            .xpath("//i[contains(., 'arrow2-right')]"));

    public static final Target MANAGE_BUSINESS_FINANCES_CARD = Target.the("Manage busines finances card")
            .located(By.xpath("//a[contains(., 'Gestionar las finanzas de mi negocio')]"));
}
