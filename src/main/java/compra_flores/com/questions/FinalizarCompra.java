package compra_flores.com.questions;

import compra_flores.com.userinterface.SeleccionProductos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class FinalizarCompra implements Question {
    @Override
    public String answeredBy(Actor actor) {
        return SeleccionProductos.LBL_TOTAL.resolveFor(actor).getText();
    }
    public static Question<String> value() {return new FinalizarCompra();}
}
