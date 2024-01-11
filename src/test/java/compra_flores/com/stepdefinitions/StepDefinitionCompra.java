package compra_flores.com.stepdefinitions;

import compra_flores.com.enums.Validacion;
import compra_flores.com.models.DatosCompra;
import compra_flores.com.questions.FinalizarCompra;
import compra_flores.com.tasks.Compra;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;

import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class StepDefinitionCompra {
    @Before
    public void prepararEscenario() {
        setTheStage(new OnlineCast());
        theActorCalled("Felipe Rincon");
    }
    @Given("El usuario ingresa a la pagina SANANGEL")
    public void elUsuarioIngresaALaPaginaSANANGEL() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://sanangel.com.co/"));
    }
    @When("Realiza la seleccion de los productos")
    public void realizaLaSeleccionDeLosProductos(DatosCompra datos) {
        theActorInTheSpotlight().attemptsTo(Compra.elFormulario(datos));
    }
    @Then("Se realiza la question de validacion")
    public void seRealizaLaQuestionDeValidacion() {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(FinalizarCompra.value(), equalTo(Validacion.TXT_TEXTO.getMesaje()))
        );
    }
    @DataTableType
    public DatosCompra datosCompra(@Transpose Map<String, String> entry){
        return new DatosCompra(
                entry.get("strcant1"),
                entry.get("strcant2"),
                entry.get("strcant3")
        );
    }
}
