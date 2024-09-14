package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * Contiene los elementos de la vista de conversión de herramientas en la interfaz de usuario.
 * Esta clase define los elementos de la interfaz que se utilizan para interactuar con la vista de conversión de herramientas,
 * a través de la localización de los elementos en la página web.
 */
public class ToolConvertView {

    public static final Target CONVERT_CARD = Target.the("Convert card").located(By
            .xpath("(//a[@href='/negocios/herramientas/convertidor-de-tasas'])[2]"));
}
