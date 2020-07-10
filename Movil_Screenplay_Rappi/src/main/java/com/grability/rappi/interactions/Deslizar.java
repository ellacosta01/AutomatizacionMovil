package com.grability.rappi.interactions;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.webdriver.WebDriverFacade;

public class Deslizar implements Interaction {

    String texto = "";
    public Deslizar(String texto) {
        this.texto = texto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        ((WebDriverFacade) BrowseTheWeb.as(actor).getDriver()).findElement(MobileBy.AndroidUIAutomator
                ("new UiScrollable(new UiSelector().scrollable(true).instance(0))."+
                        "scrollIntoView(new UiSelector().textMatches(\""+texto+"\").instance(0))"));
    }

    public static Deslizar haciaElTexto( String texto) {
        return Tasks.instrumented(Deslizar.class,texto);
    }
}