
package Servicios;
import Entidad.Puntos;
import java.util.Scanner;
import java.lang.Math; 
public class ServiciosPuntos {
    public Puntos crearPuntos(){
        Scanner leer = new Scanner(System.in);
        Puntos coordenadas = new Puntos ();
        System.out.println("Ingrese las coordenadas de los puntos: ");
        coordenadas.setX1(leer.nextDouble());
        coordenadas.setX2(leer.nextDouble());
        coordenadas.setY1(leer.nextDouble());
        coordenadas.setY2(leer.nextDouble());       
        return coordenadas;       
    }
    public double calcularDistancia(Puntos coordenadas){
        double distancia;
        double x = (coordenadas.getX2()-coordenadas.getX1());
        double y = (coordenadas.getY2()-coordenadas.getY1());
       // System.out.println("");
        distancia = Math.sqrt((x*x)-(y*y));
        System.out.println("La distancia entre los puntos es: "+distancia+".");
        return distancia; 
    }
}
