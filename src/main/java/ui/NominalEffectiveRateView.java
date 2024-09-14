package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NominalEffectiveRateView {

    public static final Target NOMINAL_EFFECTIVE_RATE_CARD = Target.the("Nominal effective rate card")
            .located(By.xpath("//div[@id='btntoolUno']/a"));
}
