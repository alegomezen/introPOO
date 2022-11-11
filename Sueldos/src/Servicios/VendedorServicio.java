
package Servicios;
import Entidad.Vendedor;
import java.util.Date;
import java.util.Scanner;

public class VendedorServicio {
    public Vendedor altaVendedor(){
         
        //Instanciamos un objeto de tipo Vendedor. 
        Vendedor v1 = new Vendedor();
        //La parte de Vendedor() es porque uso el constructor sin parametros
        //podria usarse el que los tiene y los ponemos entre los parentesis. 
        //Lleno los atributos usando el scanner
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del vendedor: ");
        v1.setNombre(leer.next());
        System.out.println("Ingrese el DNI del vendedor: ");
        v1.setDni(leer.nextInt());       
        System.out.println("Ingrese el sueldo basico del vendedor: ");
        v1.setSueldoBasico(leer.nextDouble());
        System.out.println("Ingrese el dia de inicio de trabajo: ");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes en el que comenzó a trabajar: ");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año en el que comenzó a trabajar: ");
        int anio = leer.nextInt();
        Date fechaInicio = new Date(anio-1900,mes-1,dia);
        v1.setFechaInicio(fechaInicio);
        ///Una vez incializados todos los valores de los atributos, lo que nos quedaría es que la funcion
        ///retorne una variable con todos ellos dentro.
        return v1;
     
    }
    //Creamos un metodo para calcular las comisiones a pagar 
    public void SueldoMensual(Vendedor v1){
        Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese el total de ventas del vendedor: ");
         Double ventas = leer.nextDouble();
         v1.setComisiones(ventas*0.15);
         v1.setSueldoMensual(v1.getSueldoBasico()+v1.getComisiones());
         System.out.println("El sueldo mensual del vendedor "+v1.getNombre()+" es de: $"+v1.getSueldoMensual()+".");
         
    }
    //Metodo para calcular los dias de vacaciones. 
    public void Vacaciones(Vendedor v1){
        Date hoy = new Date(); //Para calcular vamos a necesitar el dia de la fecha.
        int antiguedad = hoy.getYear()-v1.getFechaInicio().getYear(); 
        //Ahora lo analizamos con condicionales para ver cuantos corresponden. 
        if (antiguedad<5){
            System.out.println("Le corresponden 14 dias de vacaciones.");
        } else if (antiguedad<10){
            System.out.println("Le corresponden 21 dias de vacaciones.");
        } else if (antiguedad<20){
            System.out.println("Le corresponden 28 dias de vacaciones.");
        } else if (antiguedad>20){
            System.out.println("Le corresponden 35 dias de vacaciones.");
        }else{
            System.out.println("El empleado tiene vacaciones proporcionales.");
        }
        ///Una vez creados los constructores, los getters & setters, y los servicios que consideremos
        ///pertinentes nos dirigimos al main donde los vamos a utilizar. 
        
    }
            
}   
