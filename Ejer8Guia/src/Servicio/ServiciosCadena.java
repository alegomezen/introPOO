
package Servicio;
import Entidad.Cadena;
import java.util.Scanner; 

public class ServiciosCadena {
        Scanner leer = new Scanner(System.in);
                public void mostrarVocales(Cadena frase){ 
                    int contador = 0;
                    for (int i = 0; i < frase.getLongitud(); i++) {
                      if (frase.getLongitud(i)=="a"||frase.getLongitud(i)=="e" || frase.getLongitud(i)=="i"||frase.getLongitud(i)=="o"||frase.getLongitud(i)=="u"){
                      contador=contador+1;
                      } 
                }
                    System.out.println("La cantidad de vocales en la frase es de: "+contador+".");

        }
