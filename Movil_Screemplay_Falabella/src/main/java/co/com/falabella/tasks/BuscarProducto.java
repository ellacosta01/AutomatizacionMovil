package co.com.falabella.tasks;

import co.com.falabella.interactions.Presionar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.falabella.userinterfaces.HomePage.BTN_BUSCAR;
import static co.com.falabella.utils.AccionesDeEditor.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarProducto implements Task {

    private String producto;


    public BuscarProducto(String producto) {
        this.producto = producto;

    }

    @Override

    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(BTN_BUSCAR),
                Enter.theValue(producto).into(BTN_BUSCAR),
                Presionar.laAccionDeEditor(SEARCH)

        );

    }

    public static BuscarProducto enLaAppFalabella(String producto) {
        return instrumented(BuscarProducto.class, producto);
    }


    }
