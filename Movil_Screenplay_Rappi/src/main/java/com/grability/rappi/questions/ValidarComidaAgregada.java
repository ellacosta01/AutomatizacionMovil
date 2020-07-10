package com.grability.rappi.questions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.grability.rappi.userinterfaces.ComidaEnCarritoPage.TXT_COMIDA_A_COMPRAR;

public class ValidarComidaAgregada implements Question<String> {

    public static ValidarComidaAgregada aLaBolsa() {
        return new ValidarComidaAgregada();

    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(TXT_COMIDA_A_COMPRAR).viewedBy(actor).asString();
    }
}
