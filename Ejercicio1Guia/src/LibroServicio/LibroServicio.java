
package LibroServicio;
import Entidad.Libro;
import java.util.Scanner;


public class LibroServicio {
    public Libro AltaLibro(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Libro libro1 = new Libro();
        System.out.println("Ingrese el ISBN del libro: ");
        libro1.setISBN(leer.nextInt());
        System.out.println("Ingrese el título del libro: ");
        libro1.setTitulo(leer.next());
        System.out.println("Ingrese el nombre del autor del libro: ");
        libro1.setAutor(leer.next());
        System.out.println("Ingrese el numero de paginas del libro: ");
        libro1.setNumPags(leer.nextInt());
        return libro1;  
        
    
}
  public void MostrarLibro(Libro libro1){
      System.out.print("El ISBN del libro "+libro1.getTitulo()+" es: "+libro1.getISBN());
      System.out.print("su autor es "+libro1.getAutor()+"y tiene "+libro1.getNumPags()+"paginas.");
  }
    
        

}
