package com.grability.rappi.stepdefinitions;

import com.grability.rappi.questions.ValidarComidaAgregada;
import com.grability.rappi.tasks.Agregar;
import com.grability.rappi.tasks.AgregarALaBolsa;
import com.grability.rappi.tasks.BuscarComida;
import com.grability.rappi.tasks.SeleccionarComida;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BuscarYComprarComidaStepdefinitions {

    @Before
    public void before() {
        OnStage.setTheStage(new OnlineCast());

    }
    @When("^busco la siguiente palabra:$")
    public void buscoLaSiguientePalabra(List<String> listaBuscarComida) {
        theActorCalled("Ella").attemptsTo(BuscarComida.enElHomeRappi(listaBuscarComida.get(0)));
    }

    @When("^selecciono la siguiente comida:$")
    public void seleccionoLaSiguienteComida(List<String> listaSeleccionarComida) {
theActorInTheSpotlight().attemptsTo(SeleccionarComida.delMenu(listaSeleccionarComida.get(0)));
    }

    @When("^hago scroll para escoger la comida de interes y agregar los insumos del pedido$")
    public void hagoScrollParaEscogerLaComidaDeInteresYAgregarLosInsumosDelPedido() {
theActorInTheSpotlight().attemptsTo(Agregar.insumosDelPedido());
    }

    @When("^lo agrego a la bolsa$")
    public void loAgregoALaBolsa() {
theActorInTheSpotlight().attemptsTo(AgregarALaBolsa.elPedido());
    }

    @Then("^valido en la canasta que aparezca la comida seleccionada$")
    public void validoEnLaCanastaQueAparezcaLaComidaSeleccionada(List <String> listaComidaSeleccionada) {
theActorInTheSpotlight().should(seeThat(ValidarComidaAgregada.aLaBolsa(), Matchers.equalTo(listaComidaSeleccionada.get(0))));
    }
}
