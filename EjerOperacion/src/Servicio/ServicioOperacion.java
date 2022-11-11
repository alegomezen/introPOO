
package Servicio;
import Entidad.Operacion;
import java.util.Scanner;
public class ServicioOperacion {
    public Operacion crearOperacion(){
    Operacion opNumerica = new Operacion();
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese dos numeros: ");
    opNumerica.setNumero1(leer.nextInt());
    opNumerica.setNumero2(leer.nextInt());
    
    return opNumerica; 
    }
    public int sumar(Operacion opNumerica){
    int suma;
    suma = opNumerica.getNumero1() + opNumerica.getNumero2();
    System.out.println("La suma de los numeros es: "+suma+".");
    return suma; 
    }
    public int restar(Operacion opNumerica){
    int resta;
    resta = opNumerica.getNumero1() - opNumerica.getNumero2();
    System.out.println("La resta de los numeros es: "+resta+".");
    return resta; 
    }
    public int multiplicar(Operacion opNumerica){
    int multiplicacion;
    multiplicacion = opNumerica.getNumero1()*opNumerica.getNumero2();
    if (opNumerica.getNumero1()==0 || opNumerica.getNumero2()==0){
        System.out.println("El resutlado es 0.");
    }else{
        System.out.println("El producto de los numeros es: "+multiplicacion+".");
    
    }
    return multiplicacion; 
    
    }
    public double dividir(Operacion opNumerica){
    int division; 
    division= opNumerica.getNumero1()/opNumerica.getNumero2();
    if (opNumerica.getNumero1()==0 || opNumerica.getNumero2()==0){
        System.out.println("El resutlado es 0.");
    }else{
        System.out.println("La division de los numeros es: "+division+".");
    
    }
    return division; 
    }
} 
