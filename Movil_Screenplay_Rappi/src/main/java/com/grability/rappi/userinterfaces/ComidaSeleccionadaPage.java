package com.grability.rappi.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ComidaSeleccionadaPage {

    public static final Target BTN_SELECCIONAR_COMIDA = Target.the("Seleccionar Comida").located(By.xpath("//*[contains(@text,'Arroz de Mariscos')]"));
    public static final Target RADIO_BUTTON_OPCION_SI = Target.the("Escoger cubiertos").located(By.xpath("//*[contains(@text,'Si')]"));
    public static Target ADICION_DE_COMIDA(String mapeo) {
        return Target.the(mapeo).located(By.xpath("//android.widget.TextView[@text='" + mapeo + "']/following-sibling::android.widget.LinearLayout"));
    }
    public static final Target BTN_AGREGAR_A_LA_BOLSA = Target.the("Agregar a la bolsa").located(By.xpath("//*[contains(@text,'Agregar')]"));

}
