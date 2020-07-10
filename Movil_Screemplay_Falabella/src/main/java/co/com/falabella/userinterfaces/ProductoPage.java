package co.com.falabella.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ProductoPage {
    public static final Target BTN_AGREGAR_A_LA_BOLSA= Target.the("BOTON AGREGAR A LA BOLSA").located(By.xpath("//*[contains(@text,'AGREGAR A LA BOLSA >')]"));
    public static final Target BTN_BOLSA = Target.the("BOTON BOLSA").located(By.xpath("//*[contains(@resource-id,'com.falabella.falabellaApp:id/imageView_cart')]"));

}
