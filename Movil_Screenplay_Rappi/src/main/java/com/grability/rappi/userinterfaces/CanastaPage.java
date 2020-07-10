package com.grability.rappi.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CanastaPage {

    public static final Target BTN_CANASTA = Target.the("Canasta").located(By.xpath("//*[contains(@text,'Ver canasta')]"));

}
