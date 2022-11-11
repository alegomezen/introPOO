
package Servicios;
import Entidad.Matematica;
import static java.lang.Math.abs;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.sqrt;
import java.util.Scanner; 

        public class ServiciosMatematica {
            Scanner leer = new Scanner(System.in);
            public double devolverMayor(Matematica prueba1){
                double mayor;       
                mayor=max(prueba1.getNumero1(),prueba1.getNumero2());
                System.out.println("El mayor de los numeros "+prueba1.getNumero1()+" y ");
                System.out.println(+prueba1.getNumero2()+" es: "+mayor+".");
                return mayor;  
            } 
                public double calcularPotencia(Matematica prueba1){
                    double resultado;
                    double numero1red = Math.floor(prueba1.getNumero1());
                    double numero2red = Math.floor(prueba1.getNumero2());
                    resultado=Math.pow(numero1red,numero2red);
                    System.out.println("Los numeros son: "+prueba1.getNumero1()+" y "+prueba1.getNumero2());
                    System.out.println("El resultado de elevar el numero mayor a la potencia del menor es: "+resultado+".");
                    return resultado; 
            }
                public double calcularRaiz(Matematica prueba1){
                    double raiz;
                    double valorAbsoluto;
                    double menor;
                    menor = min(prueba1.getNumero1(),prueba1.getNumero2());
                    valorAbsoluto=abs(menor);
                    raiz=sqrt(valorAbsoluto);
                    System.out.println("El numero es: "+valorAbsoluto+".");
                    System.out.println("La raiz cuadrada del numero es: "+raiz+".");
                    return raiz;
                }

            } 
 