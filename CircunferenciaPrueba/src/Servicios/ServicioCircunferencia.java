
package Servicios;
import Entidad.Circunferencia;
import java.util.Scanner;

public class ServicioCircunferencia {
    public Circunferencia crearCircunferencia(){
        Circunferencia circ1 = new Circunferencia();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un radio: ");
        circ1.setRadio(leer.nextDouble());
        
        
        return circ1; ///Retorno el objeto creado del mismo tipo que el public. 
    }
    public double area(Circunferencia circ1){
        double area; ///para retornar
        area=Math.PI*(circ1.getRadio()*circ1.getRadio());
        System.out.println("El area es: "+area+".");
        return area; 
    } 
    public double perimetro(Circunferencia circ1){
        double perimetro;
        perimetro = 2*Math.PI*circ1.getRadio();
        System.out.println("El perimetro es: "+perimetro+".");
        return perimetro;
    }
    
}
