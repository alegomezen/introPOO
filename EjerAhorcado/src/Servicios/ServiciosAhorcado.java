
package Servicios;
import Entidad.Ahorcado;
import java.util.Scanner;

public class ServiciosAhorcado {
    public Ahorcado crearJuego(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
        int longitud;
        int intentosMax;
        System.out.println("Ingrese la longitud de la palabra deseada: ");
        longitud=(leer.nextInt());
  
        System.out.println("Ingrese, letra por letra, la palabra deseada: ");
        String [] palabra = new String [longitud];
        String [] palabraEncontrada = new String [longitud];
        for (int i = 0; i < longitud; i++) {
            palabra[i]=leer.next();            
            palabraEncontrada[i]="-";   
        }       
              
        //System.out.println("La longitud de la palabra es: "+juegox.getLongitud()+".");
        System.out.println("Ingrese la cantidad de jugadas maximas para el usuario: ");
        intentosMax=leer.nextInt();
        System.out.println("El usuario tendrá "+intentosMax+" jugadas en total.");
        
        Ahorcado juegox = new Ahorcado(longitud, intentosMax);
        juegox.setPalabra(palabra);
        return juegox;
    }
    public void longitud(Ahorcado juegox){
        System.out.println("La longitud de la palabra es: "+juegox.getLongitud()+".");
    }
    public boolean letra(Ahorcado juegox, String letra){
        String [] palabra2= new String[juegox.getLongitud()];
        String [] palabra3= new String[juegox.getLongitud()];
        boolean contador=true;
        int contadorAciertos=juegox.getAciertos();
        int intentosMax=juegox.getIntentosMax();
        palabra2=juegox.getPalabra();
        for (int i = 0; i < juegox.getLongitud(); i++) {
            if(palabra2[i].equals(letra)){
                System.out.println("La letra ingresada pertenece a la palabra.");
                contadorAciertos=contadorAciertos+1; 
                juegox.setAciertos(contadorAciertos);
                palabra2[i]="-";
                palabra3[i]=letra;
                System.out.println("La letra se encontró en la posición "+(i+1)+" .");
                System.out.println("Usted lleva "+juegox.getAciertos()+" aciertos.");
            }else{
                System.out.println("La letra ingresada no pertenece a la palabra.");
                
            }
            
        }
        juegox.setIntentosMax(--intentosMax);
        return contador;
    }
    public void palabraEncontrada(Ahorcado juegox){
        for (int i = 0; i < juegox.getPalabraEncontrada().length; i++) {
            // juegox.getPalabraEncontrada()[i];
        }
        
    }
    public void encontradas(Ahorcado juegox, String letra){
        letra(juegox,letra);
             
    }
    public void intentos(Ahorcado juegox){
        System.out.println("A usted le quedan "+juegox.getIntentosMax()+" intentos.");
    }
    public void juego(Ahorcado juegox, String letra){
        longitud(juegox);
        encontradas(juegox, letra);
        intentos(juegox); 
    }
}
    
    

