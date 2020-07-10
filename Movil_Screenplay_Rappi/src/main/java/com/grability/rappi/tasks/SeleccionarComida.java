package com.grability.rappi.tasks;
import com.grability.rappi.interactions.Deslizar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static com.grability.rappi.userinterfaces.ComidaSeleccionadaPage.*;

public class SeleccionarComida implements Task {

    String comidaAEscoger;

    public SeleccionarComida(String comidaAEscoger) {
        this.comidaAEscoger = comidaAEscoger;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Deslizar.haciaElTexto("Arroz de Mariscos"),
                Click.on(BTN_SELECCIONAR_COMIDA)
        );
    }


    public static SeleccionarComida delMenu(String comidaAEscoger){
        return Tasks.instrumented(SeleccionarComida.class,comidaAEscoger );
    }
}
