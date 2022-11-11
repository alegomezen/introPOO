
package Service;
import Entidad.Productos;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ServiceProductos {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Double> listaProductos = new HashMap<String, Double>();
    public Productos agregarProductos(){
        Productos producto1 = new Productos();
        System.out.println("Introduzca el nombre del producto y luego su precio: ");
        producto1.setTipo(leer.next());
        producto1.setPrecio(leer.nextDouble());
        listaProductos.put(producto1.getTipo(), producto1.getPrecio());       
        return producto1;
    } 
    
    public void mostrarMapa(){
        for (Map.Entry<String, Double> aux : listaProductos.entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();
            System.out.println("key: "+key+" value: "+value+".");
        }
    }
    
    public void eliminarProducto(){
        System.out.println("Introduzca el nombre del producto a elimiar:");
        listaProductos.remove(leer.next());
    }
    public void menu(){
        int opcion;
        System.out.println("------Bienvenido------");
        System.out.println("Si desea agregar un producto, presione 1.");
        System.out.println("Si desea visualizar la lista de productos presione 2.");
        System.out.println("Si desea cambiar el precio de un producto presione 3.");
        System.out.println("Si desea eliminar un producto presione 4.");
        System.out.println("Si desea salir, presione 5.");
        opcion=leer.nextInt();
        if (opcion>=1 && opcion<=5) {
            switch (opcion) {
                case 1:
                    agregarProductos();
                case 2:
                    mostrarMapa();          
                case 3:
                    ///Falta cambiar el precio.
                case 4:
                    eliminarProducto();            
                case 5:
                    break;
            } 
    }
    }
    
}
