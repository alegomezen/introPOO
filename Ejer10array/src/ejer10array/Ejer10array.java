
package ejer10array;
import Entidad.Arreglo;
import Servicios.ServiciosArreglos;

public class Ejer10array {

  
    public static void main(String[] args) {
        ServiciosArreglos serv1 = new ServiciosArreglos();
        Arreglo vectorA = serv1.crearArregloA();
        Arreglo vectorB = new Arreglo();
        serv1.crearArregloB(vectorB);
        
        
    }
    
}
