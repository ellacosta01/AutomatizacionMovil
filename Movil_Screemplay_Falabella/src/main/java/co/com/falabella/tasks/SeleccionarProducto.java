package co.com.falabella.tasks;

import co.com.falabella.interactions.Deslizar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.falabella.userinterfaces.HomePage.LBL_SELECCIONAR_TV;

public class SeleccionarProducto implements Task {


    private String productoAComprar;

    public SeleccionarProducto(String productoAComprar) {
        this.productoAComprar = productoAComprar;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Deslizar.haciaElTexto(productoAComprar),
                Click.on(LBL_SELECCIONAR_TV)


        );
    }

    public static SeleccionarProducto aComprar(String productoAComprar) {
        return Tasks.instrumented(SeleccionarProducto.class, productoAComprar);
    }
}