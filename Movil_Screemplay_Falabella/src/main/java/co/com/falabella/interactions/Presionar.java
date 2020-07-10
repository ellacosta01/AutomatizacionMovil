package co.com.falabella.interactions;

import co.com.falabella.utils.AccionesDeEditor;
import com.google.common.collect.ImmutableMap;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.webdriver.WebDriverFacade;

public class Presionar implements Interaction {

    String operacion="";

    public Presionar(String operacion){
        this.operacion=operacion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //casteo
        ((WebDriverFacade) BrowseTheWeb.as(actor).getDriver())
                .executeScript("mobile: performEditorAction", ImmutableMap.of("action", operacion));
    }

    public static Presionar laAccionDeEditor(AccionesDeEditor accionesDeEditor){
        return Tasks.instrumented(Presionar.class,accionesDeEditor.name());
    }

}
