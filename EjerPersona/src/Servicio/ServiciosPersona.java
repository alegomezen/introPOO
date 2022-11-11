
package Servicio;
import Entidad.Persona;
import java.util.Scanner;

public class ServiciosPersona {
        Scanner leer = new Scanner(System.in);
        public Persona crearPersona(){
            Persona pers1 = new Persona(); 
            System.out.print("Bienvenido.");
            System.out.print("Ingrese su nombre: ");
            pers1.setNombre(leer.next());
            System.out.println("Ingrese su genero: ");
            pers1.setSexo(leer.next());
            if (pers1.getSexo().equals("M") || pers1.getSexo().equals("H") || pers1.getSexo().equals("O")){
                pers1.setSexo(pers1.getSexo());
            }
                else {
                        System.out.println("El caracter introducido no es valido. Ingrese nuevamente: ");
                        pers1.setSexo(leer.next());
                        }
            System.out.println("Ingrese su peso: ");
            pers1.setPeso(leer.nextDouble());
            System.out.println("Ingrese su altura: ");
            pers1.setAltura(leer.nextDouble()); 
            System.out.println("Por ultimo, ingrese su edad: ");
            pers1.setEdad(leer.nextInt());

           return pers1;
       }
        ///Tambien se podría hacer que arroje el valor de la funcion y lo retorne con un int o double. 
        public double calcularIMC(Persona pers1){
            double IMC;
            double resultado; 
            resultado = 0; 
            IMC=(pers1.getPeso()/(pers1.getAltura()*pers1.getAltura()));
            if (IMC<20){
                resultado=-1;
                System.out.println("Usted se encuentra por debajo de su peso ideal.");
            } else {
                if (IMC>20 && IMC<=25){
                    resultado=0;
                    System.out.println("Usted se encuentra en su peso ideal.");
                } else {
                    if (IMC>25){
                        resultado=1;
                        System.out.println("Usted se encuentra por encima de su peso ideal.");
                    }
                }
            }
            return resultado; 
    } 
        public boolean mayorDeEdad(Persona pers1){
            boolean mayoriaEdad;
            mayoriaEdad=false;
            if (pers1.getEdad()>18) {
                System.out.println("Usted cumple con la mayoria de edad.");
                mayoriaEdad=true; 
            }
            return mayoriaEdad; 
        }
        

        }

