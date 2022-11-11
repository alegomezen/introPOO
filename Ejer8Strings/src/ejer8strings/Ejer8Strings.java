
package ejer8strings;
import Entidad.Cadena;
import Servicios.ServiciosCadena;
import java.util.Scanner;
public class Ejer8Strings {

    
    public static void main(String[] args) {
        ServiciosCadena serv1 = new ServiciosCadena();
        Cadena frase1 = new Cadena();
        Scanner leer = new Scanner(System.in);
        int longitud;
        String letra;
        String frase2;
        String frase3;
        String c1;
        
        System.out.println("Ingrese una palabra o una frase: ");
        frase1.setFrase(leer.next());
        frase1.setLongitud(frase1.getFrase().length());
        System.out.println("La frase es: "+frase1.getFrase()+" y su longitud es "+frase1.getLongitud()+" caracteres.");
        serv1.invertirFrase(frase1);
        serv1.mostrarVocales(frase1);
        System.out.println("Ingrese una letra: ");
        letra = leer.next();
        serv1.vecesRepetido(letra, frase1);
        System.out.println("Ingrese una nueva frase: ");
        frase2=leer.next();
        serv1.compararLongitud(frase2, frase1);
        System.out.println("Ingrese una nueva frase para añadir a la anterior: ");
        frase3=leer.next();
        serv1.unirFases(frase3, frase1);
        System.out.println("Ingrese un caracter para reemplazar la letra 'a': ");
        c1 = leer.next(); 
        serv1.reemplazar(c1, frase1);
        System.out.println("Ingrese una letra para buscar en la frase: ");
        String letraNueva = leer.next(); 
        serv1.contiene(letraNueva, frase1); 
        
    } 
    
}
