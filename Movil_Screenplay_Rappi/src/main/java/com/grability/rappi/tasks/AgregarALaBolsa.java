package com.grability.rappi.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.grability.rappi.userinterfaces.CanastaPage.BTN_CANASTA;
import static com.grability.rappi.userinterfaces.ComidaSeleccionadaPage.BTN_AGREGAR_A_LA_BOLSA;

public class AgregarALaBolsa implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
actor.attemptsTo(
        Click.on(BTN_AGREGAR_A_LA_BOLSA),
        Click.on(BTN_CANASTA)
);
    }




public static AgregarALaBolsa elPedido(){
        return Tasks.instrumented(AgregarALaBolsa.class);
}

}
