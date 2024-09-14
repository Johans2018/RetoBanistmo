package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ManageBusinessFinancesView {

    public static final Target ARROW_RIGHT_BUTTON = Target.the("Arrow right").located(By
            .xpath("//i[contains(., 'arrow2-right')]"));

    public static final Target MANAGE_BUSINESS_FINANCES_CARD = Target.the("Manage busines finances card")
            .located(By.xpath("//a[contains(., 'Gestionar las finanzas de mi negocio')]"));
}
