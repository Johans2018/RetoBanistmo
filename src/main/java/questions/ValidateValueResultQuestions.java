package questions;

import net.serenitybdd.screenplay.Question;
import ui.ValueInterestPeriodicityCapitalizationView;

/**
 * Clase que contiene preguntas para validar el resultado de valores en la interfaz de usuario.
 */
public class ValidateValueResultQuestions {

    /**
     * Devuelve una pregunta que recupera el texto del campo de resultado en la vista de interés y periodicidad de capitalización.
     *
     * <p>Esta pregunta se utiliza para obtener el texto mostrado en el campo de resultado en la interfaz de usuario.
     * Se resuelve mediante el uso del actor que interactúa con la vista {@link ValueInterestPeriodicityCapitalizationView}.
     *
     * @return una instancia de {@link Question} que devuelve el texto del campo de resultado.
     */
    public static Question<String> valueResult() {
        return actor -> ValueInterestPeriodicityCapitalizationView.RESULT_FIELD.resolveFor(actor).getText();
    }
}
