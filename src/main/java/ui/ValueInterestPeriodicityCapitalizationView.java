package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValueInterestPeriodicityCapitalizationView {

    public static final Target VALUE_INTEREST_FIELD = Target.the("Value interest field").located(By
            .xpath("//input[@id='interes']"));

    public static final Target PERIODICITY_SELECT = Target.the("Periodicity select").located(By
            .xpath("//select[@id='periodicidad-deseada']"));

    public static final Target BIANNUAL_SELECT = Target.the("biannual select").located(By
            .xpath("//select[@id='periodicidad-deseada']//option[@value='2']"));

    public static final Target CAPITALIZATION_SELECT = Target.the("Capitalization select").located(By
            .xpath("//select[@id='capitalizacion']"));

    public static final Target ANNUAL_SELECT = Target.the("Annual select").located(By
            .xpath("//select[@id='capitalizacion']//option[@value='1']"));

    public static final Target RESULT_FIELD = Target.the("Result field").located(By
            .xpath("//h3[@id='respuesta']"));
}
