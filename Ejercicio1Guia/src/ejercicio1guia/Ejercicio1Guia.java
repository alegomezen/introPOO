
package ejercicio1guia;
import Entidad.Libro;
import LibroServicio.LibroServicio;


public class Ejercicio1Guia {

    
    public static void main(String[] args) {
        LibroServicio l1 = new LibroServicio();
        Libro libro1= l1.AltaLibro();       
        l1.MostrarLibro(libro1); 
        
        
    }
    
}
