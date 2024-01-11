package compra_flores.com.enums;

public enum Validacion {
    TXT_TEXTO("$3.459.000");
    private final String mensaje;
    Validacion(String mensaje){
        this.mensaje = mensaje;
    }
    public String getMesaje (){return mensaje;}
}
