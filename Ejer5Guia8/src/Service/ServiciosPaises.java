
package Service;
import Entidad.Paises;
import java.util.HashSet;
import java.util.Scanner;
import Comparators.Comparators;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ServiciosPaises {
    Scanner leer = new Scanner(System.in);
    HashSet<Paises> listaPaises = new HashSet();
    public Paises agregarPaises(){
        Paises pais1 = new Paises();
        System.out.println("Ingrese el nombre del país: ");
        pais1.setPais(leer.next());
        return pais1;
    }
    public void opcion(){
        int opcion;
        do{
            System.out.println("Desea ingresar un país? Para hacerlo presione '1', para salir, presione '2'.");
            opcion=leer.nextInt();
            if(opcion==1){
                listaPaises.add(agregarPaises());
            }
        }while(opcion!=2);
        
    }
    public void mostrarOrdenado(){
        ArrayList<Paises> listaConvertida = new ArrayList(listaPaises);
        Collections.sort(listaConvertida, Comparators.ordenarAlfab);   
        for (Paises aux : listaConvertida) {
            System.out.println(aux);
        }
    }
    public void eliminarPais(){
        String pais;
        Iterator<Paises> it = listaPaises.iterator();
        System.out.println("Ingrese un pais a eliminar: ");
        pais = leer.next();
        while(it.hasNext()){
            if(it.next().getPais().equals(pais)){
               it.remove(); 
            }          
        }
        for (Paises aux : listaPaises) {
                    System.out.println(aux);
                }
    }
}

