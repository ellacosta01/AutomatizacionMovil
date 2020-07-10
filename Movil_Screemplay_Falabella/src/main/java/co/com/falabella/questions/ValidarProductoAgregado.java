package co.com.falabella.questions;

import co.com.falabella.userinterfaces.BolsaDeCompraPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarProductoAgregado implements Question <String> {

    public static ValidarProductoAgregado aLaBolsa() {
        return new ValidarProductoAgregado();

    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(BolsaDeCompraPage.LBL_TELEVISOR).viewedBy(actor).asString();
    }
}
