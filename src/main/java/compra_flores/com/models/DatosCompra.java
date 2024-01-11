package compra_flores.com.models;

public class DatosCompra {
    public String strcant1;
    public String strcant2;
    public String strcant3;

    public DatosCompra(String strcant1, String strcant2, String strcant3) {
        this.strcant1 = strcant1;
        this.strcant2 = strcant2;
        this.strcant3 = strcant3;
    }

    public String getStrcant1() {
        return strcant1;
    }

    public void setStrcant1(String strcant1) {
        this.strcant1 = strcant1;
    }

    public String getStrcant2() {
        return strcant2;
    }

    public void setStrcant2(String strcant2) {
        this.strcant2 = strcant2;
    }

    public String getStrcant3() {
        return strcant3;
    }

    public void setStrcant3(String strcant3) {
        this.strcant3 = strcant3;
    }
}
