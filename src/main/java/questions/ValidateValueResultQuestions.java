package questions;

import net.serenitybdd.screenplay.Question;
import ui.ValueInterestPeriodicityCapitalizationView;

public class ValidateValueResultQuestions {

    public static Question<String> valueResult() {
        return actor -> ValueInterestPeriodicityCapitalizationView.RESULT_FIELD.resolveFor(actor).getText();
    }
}
