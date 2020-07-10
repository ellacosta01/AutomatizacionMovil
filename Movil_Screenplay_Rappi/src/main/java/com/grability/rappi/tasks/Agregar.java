package com.grability.rappi.tasks;
import com.grability.rappi.interactions.Deslizar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.grability.rappi.userinterfaces.ComidaSeleccionadaPage.ADICION_DE_COMIDA;
import static com.grability.rappi.userinterfaces.ComidaSeleccionadaPage.RADIO_BUTTON_OPCION_SI;

public class Agregar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RADIO_BUTTON_OPCION_SI),
                Deslizar.haciaElTexto("Comentarios o instrucciones"),
                Click.on(ADICION_DE_COMIDA("Guacamole en Molcajete")),
                Click.on(ADICION_DE_COMIDA("Coca-Cola Sabor Original 300 ml"))
        );
    }

    public static Agregar insumosDelPedido(){
        return Tasks.instrumented(Agregar.class);

    }


}
