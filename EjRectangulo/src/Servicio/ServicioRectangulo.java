
package Servicio;
import Entidad.Rectangulo;
import java.util.Scanner;
public class ServicioRectangulo {
    public Rectangulo crearRectangulo(){
        Scanner leer= new Scanner(System.in);
        Rectangulo rect1 = new Rectangulo();
        System.out.println("Ingrese la base del rectangulo: ");
        rect1.setBase(leer.nextInt());
        System.out.println("Ahora ingrese la altura del rectangulo: ");
        rect1.setAltura(leer.nextInt());
        System.out.println("El rectangulo tiene "+rect1.getBase()+" unidades de base y "+rect1.getAltura()+" de altura.");
     return rect1;    
    }
    public int calcularSuperficie(Rectangulo rect1){
     int superficie;
     superficie=rect1.getAltura()*rect1.getBase();
        System.out.println("El rectangulo tiene "+superficie+" unidades de superficie.");
     return superficie;   
    }
    public int calcularPerimetro(Rectangulo rect1){
        int perimetro;
        perimetro=(rect1.getAltura()+rect1.getBase())*2;
        System.out.println("El rectangulo tiene "+perimetro+" unidades de perimetro.");
    return perimetro; 
    }
    public void dibujarCuadradito(Rectangulo rect1){
        int base = rect1.getBase();
        int altura = rect1.getAltura();
        
        for (int i = 0; i < base; i++){
            if (i == 0 || i == (base-1)) {
                for (int j = 0; j < altura; j++){
                    System.out.print("*");
                    //j = j+1;
                }
                
            }else {
                for (int j = 0; j < altura; j++){
                    if (j == 0 || j == (altura-1)){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                    //j = j+1;
                    
                }
            
            }
            //j = 0;
            //i = i + 1;
            System.out.println("");
        }
    }    
}
