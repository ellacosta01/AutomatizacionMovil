package co.com.falabella.userinterfaces;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;



public class HomePage extends PageObject {
    public static final Target BTN_BUSCAR = Target.the("BOTON BUSCAR").located(By.xpath("//*[contains(@text,'Buscar')]"));
    public static final Target LBL_SELECCIONAR_TV = Target.the("BOTON SEARCH").located(By.xpath("//*[contains(@text,'Televisor LG 49 pulgadas LED 4K Ultra HD Smart TV')]"));



}
