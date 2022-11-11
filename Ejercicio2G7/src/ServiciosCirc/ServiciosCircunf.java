
package ServiciosCirc;
import Entidades.Circunferencia;
import java.util.Scanner;


public class ServiciosCircunf {
    /*
    public Circunferencia crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia: ");
        double radio = leer.nextDouble();
        return new Circunferencia(radio);        
    }
    */
    public Circunferencia crearCircunferencia(){
        Circunferencia circ1 = new Circunferencia();
        
    }
    public double area(Circunferencia a){
        double radio;
        radio = a.setRadio(); 
        double area = 3.14*(radio*radio);
        return area; 
    } 
    public double perimetro(Circunferencia a){
        double radio; 
        radio = a.getRadio();
        double perimetro;
        perimetro = 2*3.14*radio;
        return perimetro; 
    }

}
