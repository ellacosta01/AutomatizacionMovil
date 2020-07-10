package co.com.falabella.stepdefinitions;
import co.com.falabella.questions.ValidarProductoAgregado;
import co.com.falabella.tasks.VerInformacion;
import co.com.falabella.tasks.BuscarProducto;
import co.com.falabella.tasks.SeleccionarProducto;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import java.util.List;
import static co.com.falabella.userinterfaces.ProductoPage.BTN_AGREGAR_A_LA_BOLSA;
import static co.com.falabella.userinterfaces.ProductoPage.BTN_BOLSA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BuscarProductoStepdefinitions {

    @Before
    public void before() {
        OnStage.setTheStage(new OnlineCast());

    }

    @When("^busco la siguiente palabra:$")
    public void buscoLaSiguientePalabra(List <String> listaBuscarProducto) {
theActorCalled("Ella").attemptsTo(BuscarProducto.enLaAppFalabella(listaBuscarProducto.get(0)));

    }

    @When("^selecciono el siguiente producto:$")
    public void seleccionoElSiguienteProducto( List <String> listaSeleccionarProducto) {
theActorInTheSpotlight().attemptsTo(SeleccionarProducto.aComprar(listaSeleccionarProducto.get(0)));

    }

    @When("^hago scroll para observar mas informacion y habilitar el boton de agregar a la bolsa$")
    public void hagoScrollParaObservarMasInformacionYHabilitarElBotonDeAgregarALaBolsa() {
theActorInTheSpotlight().attemptsTo(VerInformacion.delProductoSeleccionado());
    }

    @When("^lo agrego a la bolsa$")
    public void loAgregoALaBolsa() throws InterruptedException {

        BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().getPageSource();
        //System.out.println(BTN_AGREGAR_CARRITO.resolveFor(theActorInTheSpotlight()).isClickable());
        theActorInTheSpotlight().attemptsTo(Click.on(BTN_AGREGAR_A_LA_BOLSA),
                Click.on(BTN_BOLSA));

    }

    @Then("^valido en mi carrito que aparezca el producto seleccionado$")
    public void validoEnMiCarritoQueAparezcaElProductoSeleccionado(List <String> listaProductoSeleccionado) {
        theActorInTheSpotlight().should(seeThat(ValidarProductoAgregado.aLaBolsa(), Matchers.equalTo(listaProductoSeleccionado.get(0))));
    }
}
