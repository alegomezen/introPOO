
package Service;
import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import Comparadores.Comparadores;
public class ServiciosPelicula {
     ArrayList<Pelicula> lista = new ArrayList();
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
     public Pelicula altaPelicula(){       
         System.out.println("Ingrese el titulo de la pelicula: ");
         String titulo = leer.next();         
         System.out.println("Ingrese el director de la pelicula: ");
         String director = leer.next();
         System.out.println("Ingrese la duracion de la pelicula (en horas): ");
         Double duracion = leer.nextDouble();
         Pelicula pelicula1= new Pelicula(titulo,director,duracion);
             
         
         return pelicula1;
     }
     public ArrayList añadirPelicula(){
         int opcion;
         do{
             System.out.println("Desea agregar otra pelicula? Seleccione '1'/'2' segun corresponda: ");
             opcion = leer.nextInt();
             if(opcion==1){
             lista.add(altaPelicula());    
             }           
         }while(opcion!=2);
         return lista;
     } 
     public void mostrar(){
         lista.forEach((aux) -> {
             System.out.println(aux.toString());
         });
     } 
     
     public void mostrarDuracionMas1Hora(){
         Iterator<Pelicula> it = lista.iterator();
         while(it.hasNext()){
             if(it.next().getDuracion()>1){
                 System.out.println(it.next());  //Se imprime it next. 
             }
         }
     }

     public void ordenarPorDuracionDescend(){
         Collections.sort(lista, Comparadores.ordenarPorDuracionDescend);
         for (Pelicula aux : lista) {
             System.out.println(aux);
            
        }
    }
     public void ordenarPorDuracionAscend(){
         Collections.sort(lista, Comparadores.ordenarPorDuracionAscend);
         for (Pelicula aux : lista) {
             System.out.println(aux);           
        }
     }
     public void ordenarPorTitulo(){
         Collections.sort(lista, Comparadores.ordenarAlfabPorTitulo);
         for (Pelicula aux : lista) {
             System.out.println(aux);           
        }
     }
     public void ordenarPorDirector(){
         Collections.sort(lista, Comparadores.ordenarAlfabPorDirector);
         for (Pelicula aux : lista) {
             System.out.println(aux);           
        }
     }
}


