package compra_flores.com.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SeleccionProductos {
    public static final Target SEL_PRODUCTO1 = Target.the("Selecciona el primer producto (riviera)")
            .located(By.xpath("/html[1]/body[1]/div[2]/main[1]/article[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]/img[1]"));
    public static final Target SEL_PRODUCTO2 = Target.the("Selecciona el segundo producto (amor, amor)")
            .located(By.xpath("/html[1]/body[1]/div[2]/main[1]/article[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[7]/a[2]/img[1]"));
    public static final Target TXT_CANT2 = Target.the("Permite modificar las unidades del segundo producto")
            .located(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]"));
    public static final Target BTN_CARRITO2 = Target.the("Permite añadir al carrito el segundo producto")
            .located(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/button[1]"));
    public static final Target SEL_PRODUCTO3 = Target.the("Selecciona el tercer producto (universo encantado)")
            .located(By.xpath("/html[1]/body[1]/div[2]/main[1]/article[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[11]/a[2]/img[1]"));
    public static final Target TXT_CANT = Target.the("Permite modificar las unidades del primer y segundo producto")
            .located(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/form[1]/input[1]"));
    public static final Target BTN_CARRITO = Target.the("Permite añadir al carrito el primer y segundo producto")
            .located(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/form[1]/button[1]"));
    public static final Target BTN_INICIO = Target.the("Inicio de la pagina")
            .located(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[2]/div[1]/a[1]/img[1]"));
    public static final Target BTN_COMPRAS = Target.the("Perrmite ver las compras ya seleccionadas")
            .located(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[2]/nav[2]/ul[1]/li[2]/a[1]/i[1]"));
    public static final Target LBL_TOTAL = Target.the("Perrmite ver el precio total de la compra")
            .located(By.xpath("/html[1]/body[1]/div[2]/main[1]/article[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[3]/div[2]/table[1]/tfoot[1]/tr[2]/td[1]/strong[1]/span[1]/bdi[1]"));

}
