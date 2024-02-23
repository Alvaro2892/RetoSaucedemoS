package co.com.certificacion.RetoSaucedemoS.stepdefinitions;

import co.com.certificacion.RetoSaucedemoS.model.ConstructorVar;
import co.com.certificacion.RetoSaucedemoS.questions.Verificar;
import co.com.certificacion.RetoSaucedemoS.tasks.TaskAbrirPagina;
import co.com.certificacion.RetoSaucedemoS.tasks.TaskComprarArticulos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepCompraSaucedemo
{
    @Given("el usuario entra a la pagina de Saucedemo")
    public void elUsuarioEntraALaPaginaDeSaucedemo()
    {
        theActorCalled("Alvaro").wasAbleTo(TaskAbrirPagina.Saucedemo());
    }
    @When("escoge el articulo y luego se dirige al carrito de compra y realiza la compra")
    public void escogeElArticuloYLuegoSeDirigeAlCarritoDeCompraYRealizaLaCompra(List<ConstructorVar> constructorVars)
    {
        theActorInTheSpotlight().attemptsTo(TaskComprarArticulos.articulosSwagLabs(constructorVars));
    }
    @Then("el usuario deberia ver el siguiente mensaje de compra exitosa {string}")
    public void elUsuarioDeberiaVerElSiguienteMensajeDeCompraExitosa(String VerificarMensajePagina)
    {
        theActorInTheSpotlight().should(seeThat(Verificar.mensajeSitioWeb(VerificarMensajePagina)));
    }

}
