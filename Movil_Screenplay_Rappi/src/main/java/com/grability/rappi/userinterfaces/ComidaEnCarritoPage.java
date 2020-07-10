package com.grability.rappi.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ComidaEnCarritoPage {

    public static final Target TXT_COMIDA_A_COMPRAR = Target.the("Comida a comprar").located(By.xpath("//*[contains(@text,'Arroz de Mariscos')]"));


}
