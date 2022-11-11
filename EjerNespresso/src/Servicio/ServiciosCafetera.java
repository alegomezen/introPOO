
package Servicio;
import Entidad.Cafetera; 
import java.util.Scanner;

public class ServiciosCafetera {
    Scanner leer = new Scanner(System.in);
    public Cafetera llenarCafetera(){
        Cafetera Nespresso = new Cafetera(); 
        double capMax;  
        double rellenar;
        double relleno;
        relleno = 0;
        capMax=1800;
        System.out.println("Ingrese la cantidad de liquido que contiene la cafetera: ");
        Nespresso.setCapacidadActual(leer.nextDouble());
        rellenar=capMax-Nespresso.getCapacidadActual(); 
        if (Nespresso.getCapacidadActual()< capMax){
           relleno = Nespresso.getCapacidadActual()+rellenar;
           if (relleno>=1800){
               relleno=capMax;
           }
        }
        System.out.println("El nuevo contenido de la cafetera es: "+relleno+"."); 
        return Nespresso;
    }
    
    public void vaciarCafetera(Cafetera Nespresso){
        int vacio = 0;
        Nespresso.setCapacidadActual(vacio);
        System.out.println("La cafetera se ha vaciado.");
        System.out.println("La cantidad actual de cafe es: "+Nespresso.getCapacidadActual());
          
    }
    public void agregarCafe(Cafetera Nespresso){
        double agregarCafe;
        double cantidadNueva;
        cantidadNueva=0;
        System.out.println("Ingrese la cantidad de cafe a ingresar en la cafetera: ");
        agregarCafe=leer.nextDouble();
        cantidadNueva=cantidadNueva+agregarCafe;
        System.out.println("El nuevo contenido de la cafetera es: "+cantidadNueva+".");
        Nespresso.setCapacidadActual(cantidadNueva);
        
    }
    public void servirTaza(Cafetera Nespresso){
        double capTaza;
        double capActual=Nespresso.getCapacidadActual();
        System.out.println("Ingrese la capacidad de la taza (en cc): ");
        capTaza=leer.nextDouble();
        if (capTaza > capActual){
            capTaza=capActual;
            System.out.println("La taza se llenó con "+capActual+" de café.");
        }else{           
            System.out.println("La taza se llenó por completo.");
        }
        
    }
}
