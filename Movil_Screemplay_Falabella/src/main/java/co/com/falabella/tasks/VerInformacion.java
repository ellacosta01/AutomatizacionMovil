package co.com.falabella.tasks;

import co.com.falabella.interactions.Deslizar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class VerInformacion implements Task {


       @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Deslizar.haciaElTexto("AGREGAR A LA BOLSA >")


        );
    }

    public static VerInformacion delProductoSeleccionado( ) {

        return instrumented(VerInformacion.class);

    }
}