
package appmascotas.servicios;
import appmascotas.Entidades.Mascota;
import java.util.Scanner;

public class ServicioMascotas {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n"); ///Lo que va despues del punto
    /// es para asegurar que no se saltee las peticiones de los datos. 
    public Mascota crearMascota() {
        System.out.println("Introducir nombre: ");
        String nombre = leer.next();
        System.out.println("Introducir apodo: ");
        String apodo = leer.next();
        System.out.println("Introducir tipo: ");
        String tipo=leer.next();
        Mascota m = new Mascota(nombre, apodo, tipo);
        ///En realidad no necesitamos que exista una variable m. 
        //return m;
        return new Mascota(nombre,apodo,tipo);
        ///Devuelvo el "nacimiento" de una mascota que va a tener las caracteristicas que introduzco.
        
    }
    
}
