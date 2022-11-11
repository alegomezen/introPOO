
package Servicios;
import Entidad.Cancion;
import java.util.Scanner;
public class ServiciosCancion {
    public Cancion altaCancion(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cancion cancion1 = new Cancion();
        System.out.println("Ingrese el titulo de la canción: ");
        cancion1.setTitulo(leer.next());
        System.out.println("Ahora, ingrese el autor de la canción: ");
        cancion1.setAutor(leer.next()); 
        System.out.println("La nueva canción del autor "+cancion1.getAutor()+" se titula "+cancion1.getTitulo()+" .");
        return cancion1;
    }
}
