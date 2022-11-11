
package Servicios;
import Entidad.Persona;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

    public class ServicioPersona {
        Scanner leer = new Scanner(System.in);
        public Persona crearPersona(){
            Persona pers1 = new Persona();
            System.out.println("Ingrese su nombre: ");
            pers1.setNombre(leer.next());
            System.out.println("Ahora ingrese su fecha de nacimiento, en el orden: año, mes,dia.");
            LocalDate fecha1 = LocalDate.of(leer.nextInt(), Month.of(leer.nextInt()),leer.nextInt());
            LocalDate fechaActual = LocalDate.of(2022, Month.JUNE,13);
            pers1.setFechaNacimiento(fecha1);
            System.out.println("Bienvenido "+pers1.getNombre()+" ,usted declara que su fecha de nacimiento es: "+pers1.getFechaNacimiento()+".");
            System.out.println("Su edad es: "+ChronoUnit.YEARS.between(fecha1, fechaActual)+" años.");
            return pers1;
        }
            public void menorQue(Persona pers1, int edad){
                LocalDate fechaNac;
                LocalDate fechaActual;
                fechaNac = pers1.getFechaNacimiento();
                System.out.println("Ingrese una edad en el formato año, mes, dia: ");
                LocalDate fecha1 = LocalDate.of(leer.nextInt(), Month.of(leer.nextInt()),leer.nextInt());
                if (fechaNac.isAfter(fecha1)){
                    System.out.println("Su edad es menor a la ingresada.");
                } else {
                    if(fechaNac.isBefore(fecha1)){
                        System.out.println("Su edad es mayor a la ingresada.");
                    } else {
                        if(fechaNac.isEqual(fecha1)){
                            System.out.println("Su edad es igual a la ingresada.");
                        }                                                        
                    }
                }
            }
        }
