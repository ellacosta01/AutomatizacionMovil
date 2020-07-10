package com.grability.rappi.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BuscarComidasPage {
    public static final Target BTN_BUSCAR_COMIDA = Target.the("Buscar comida").located(By.xpath("//*[contains(@text,'Buscar')]"));
    public static final Target TXT_COMIDA = Target.the("Buscar comida").located(By.xpath("//*[contains(@text,'Busca tiendas o productos')]"));


}
