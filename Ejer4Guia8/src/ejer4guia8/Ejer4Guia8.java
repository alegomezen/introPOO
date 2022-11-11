
package ejer4guia8;
import Entidad.Pelicula;
import Service.ServiciosPelicula;

public class Ejer4Guia8 {

    
    public static void main(String[] args) {
        ServiciosPelicula serv1 = new ServiciosPelicula();
        serv1.añadirPelicula();
        serv1.mostrar();
        serv1.mostrarDuracionMas1Hora();
        serv1.ordenarPorDuracionAscend();
        serv1.ordenarPorDuracionDescend();
        serv1.ordenarPorTitulo();
        serv1.ordenarPorDirector();
        
    }
    
}
