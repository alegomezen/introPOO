
package Entidad;


public class Paises {
    private String pais;

    public Paises() {
    }

    public Paises(String pais) {
        this.pais = pais;
    }
    
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Paises{" + "pais=" + pais + '}';
    }
    
}