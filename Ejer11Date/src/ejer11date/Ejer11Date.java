
package ejer11date;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

        public class Ejer11Date {


                public static void main(String[] args) {
                   Scanner leer = new Scanner(System.in);
                    System.out.println("Ingrese un mes: ");
                   LocalDate fecha1 = LocalDate.of(1999, Month.of(leer.nextInt()),19);
                   LocalDate fechaActual = LocalDate.of(2022, Month.JUNE,7);
                   //ChronoUnit.YEARS.between(fecha1, fechaActual);
                    System.out.println(ChronoUnit.YEARS.between(fecha1, fechaActual));
                  // int dia;
                  // int mes;
                  // int anio;
                  // int dia2;
                  // int mes2;
                  // int anio2;
                  // Date diferencia = new Date();
                  //  System.out.println("Ingrese una fecha en el orden año, mes, dia: ");
                  //  anio = leer.nextInt();
                  //  mes = leer.nextInt();
                  //  dia = leer.nextInt();
                   // Date fecha = new Date(anio-1900,mes-1,dia);
                    //System.out.println("Ingrese la fecha actual: ");
                    //anio2 = leer.nextInt();
                   // mes2 = leer.nextInt();
                    //dia2 = leer.nextInt();
                    //Date fechaActual =  Date(anio2-1900,mes2-1,dia2);
                   // System.out.println("La fecha ingresada es: "+fecha+".");
                    //System.out.println("La fecha actual es: "+fechaActual+".");
                    //System.out.println("Los años transcurridos desde la fecha ingresada y la actual son: ");
                    
                }
        
        

    }
