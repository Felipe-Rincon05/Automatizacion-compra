package compra_flores.com.tasks;

import compra_flores.com.models.DatosCompra;
import compra_flores.com.userinterface.SeleccionProductos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Compra implements Task {
    private DatosCompra datos;

    public Compra(DatosCompra datos) {
        this.datos = datos;
    }
    public static Compra elFormulario(DatosCompra datos) {
        return Tasks.instrumented(Compra.class, datos);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SeleccionProductos.SEL_PRODUCTO1),
                Click.on(SeleccionProductos.TXT_CANT),
                Enter.theValue(datos.getStrcant1()).into(SeleccionProductos.TXT_CANT),
                Click.on(SeleccionProductos.BTN_CARRITO),
                Click.on(SeleccionProductos.BTN_INICIO),
                Click.on(SeleccionProductos.SEL_PRODUCTO2),
                Click.on(SeleccionProductos.TXT_CANT2),
                Enter.theValue(datos.getStrcant2()).into(SeleccionProductos.TXT_CANT2),
                Click.on(SeleccionProductos.BTN_CARRITO2),
                Click.on(SeleccionProductos.BTN_INICIO),
                Click.on(SeleccionProductos.SEL_PRODUCTO3),
                Click.on(SeleccionProductos.TXT_CANT),
                Enter.theValue(datos.getStrcant3()).into(SeleccionProductos.TXT_CANT),
                Click.on(SeleccionProductos.BTN_CARRITO),
                Click.on(SeleccionProductos.BTN_COMPRAS)
        );
    }
}
