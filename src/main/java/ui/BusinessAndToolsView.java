package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * Contiene los elementos de la vista de negocios y herramientas en la interfaz de usuario.
 * Esta clase define los elementos de la interfaz que se utilizan para interactuar con la vista de negocios y herramientas,
 * a través de la localización de los elementos en la página web.
 */
public class BusinessAndToolsView {

    public static final Target BUSINESS_BUTTON = Target.the("Business button").located(By
            .xpath("//a[@id='header-pymes']"));

    public static final Target NON_FINANCIAL_SOLUTIONS =Target.the("Non-financial solutions").located(By
            .xpath("//li[@id='menu-productos-finan']"));

    public static final Target TOOLS_FIELD = Target.the("Tools field").located(By
            .xpath("//a[@id='linkherramientas']"));
}
