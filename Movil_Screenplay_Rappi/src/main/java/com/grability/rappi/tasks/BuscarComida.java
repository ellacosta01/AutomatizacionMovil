package com.grability.rappi.tasks;
import com.grability.rappi.interactions.Presionar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static com.grability.rappi.userinterfaces.BuscarComidasPage.*;
import static com.grability.rappi.utils.AccionesDeEditor.SEARCH;

public class BuscarComida implements Task {

    String comida;

    public BuscarComida(String comida) {
        this.comida = comida;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_BUSCAR_COMIDA),
                Enter.theValue(comida).into(TXT_COMIDA),
                Presionar.laAccionDeEditor(SEARCH)
        );
    }


    public static BuscarComida enElHomeRappi(String comida){
    return Tasks.instrumented(BuscarComida.class, comida);


    }
}
