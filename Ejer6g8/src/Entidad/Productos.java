
package Entidad;
import java.util.HashMap;


public class Productos {
    private String tipo;
    private Double precio;
    private HashMap<String, Double> mapaProductos = new HashMap<String, Double>();

    public Productos() {
    }

    public Productos(String tipo, Double precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public HashMap<String, Double> getMapaProductos() {
        return mapaProductos;
    }

    public void setMapaProductos(HashMap<String, Double> mapaProductos) {
        this.mapaProductos = mapaProductos;
    }

    @Override
    public String toString() {
        return "Productos{" + "tipo=" + tipo + ", precio=" + precio + ", mapaProductos=" + mapaProductos + '}';
    }
    
}
