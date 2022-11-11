
package ejerahorcado;
import Entidad.Ahorcado;
import Servicios.ServiciosAhorcado;
import java.util.Scanner;
public class EjerAhorcado {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServiciosAhorcado serv1 = new ServiciosAhorcado();
        Ahorcado juego1 = serv1.crearJuego();
        do{
            System.out.println("Ingrese una letra: ");
                String letra = leer.next();
                serv1.juego(juego1,letra);
               // System.out.println("La palabra encontrada hasta el momento es: "+serv1.palabraEncontrada(juego1)+".");
                //serv1.palabraEncontrada(juego1);
        } while(juego1.getIntentosMax()>0 && juego1.getLongitud()!=juego1.getAciertos());
        if(juego1.getIntentosMax()==0){
            System.out.println("Terminó sus intentos.");
        }
        if(juego1.getAciertos()==juego1.getLongitud()){
            System.out.println("Felicidades! Encontró la palabra.");
        }
    }
    
}
