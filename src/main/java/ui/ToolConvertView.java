package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ToolConvertView {

    public static final Target CONVERT_CARD = Target.the("Convert card").located(By
            .xpath("(//a[@href='/negocios/herramientas/convertidor-de-tasas'])[2]"));
}
