
package Servicio;
import Entidad.CuentaBancaria;
import static java.lang.Math.random;
import java.util.Scanner;


public class Servicios {
    public CuentaBancaria crearCuenta(){
        Scanner leer = new Scanner(System.in);
        CuentaBancaria cuenta1 = new cuentaBancaria();
        System.out.println("Bienvenido al home banking.");
        System.out.println("Ingrese su nombre: ");
        cuenta1.setNombre(leer.next());
        System.out.println("Ingrese su numero de cuenta: ");
        cuenta1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese su numero de DNI: ");
        cuenta1.setDNI(leer.nextInt());
        cuenta1.setSaldo(random()*100);
        System.out.println("Su saldo es de: "+cuenta1.getSaldo()+" $.");
        return cuenta1;
    }
    public double Ingresar(CuentaBancaria cuenta1){
        Scanner leer = new Scanner(System.in);
        double ingreso;
        double nuevoSaldo = cuenta1.getSaldo();
        System.out.println("Su saldo actual es de: "+cuenta1.getSaldo()+" $");
        System.out.println("Ingrese el monto a ingresar: ");
        ingreso = leer.nextDouble();
        nuevoSaldo=nuevoSaldo+ingreso;
        System.out.println("Su nuevo saldo es de: "+nuevoSaldo+" $.");
        return nuevoSaldo;
    }
    public double Retirar(CuentaBancaria cuenta1){
        Scanner leer = new Scanner(System.in);
        double retiro; 
        double nuevoSaldo=cuenta1.getSaldo();
        System.out.println("Su saldo actual es de: "+cuenta1.getSaldo()+" $.");
        System.out.println("Ingrese el monto a retirar: ");
        retiro = leer.nextDouble();
        if (retiro>cuenta1.getSaldo()){
            nuevoSaldo=0;
        }
        nuevoSaldo=nuevoSaldo-retiro;
        System.out.println("Su nuevo saldo es de: "+nuevoSaldo+" $.");
        return nuevoSaldo;      
    }
    public double extraccionRapida(CuentaBancaria cuenta1){
       Scanner leer = new Scanner(System.in);
       double extracR;
       double nuevoSaldo; 
       double saldo;
       double porcentaje; 
       saldo=cuenta1.getSaldo();
       porcentaje = saldo*0.20;  
       System.out.println("Ingrese el monto a retirar: ");
       extracR= leer.nextDouble();
       if (extracR>porcentaje){
           System.out.println("El monto sobrepasa el maximo posible para esta transaccion.");
       }
       nuevoSaldo=saldo - extracR;
        System.out.println("Su nuevo saldo es de: "+nuevoSaldo+" $.");
       return nuevoSaldo;     
    }
    public double mostrarSaldo(CuentaBancaria cuenta1){
        double saldo;
        saldo=cuenta1.getSaldo();
        System.out.println("Su saldo es de: "+saldo+" $.");
        return saldo;
    }
    public void consultarDatos(CuentaBancaria cuenta1){
        System.out.print("Sus datos son: ");
        System.out.print("Nombre: "+cuenta1.getNombre());
        System.out.print("DNI: "+cuenta1.getDNI());
        System.out.print("Numero de cuenta: "+cuenta1.getNumeroCuenta());
        System.out.print("Saldo: "+cuenta1.getSaldo());
    }
}
