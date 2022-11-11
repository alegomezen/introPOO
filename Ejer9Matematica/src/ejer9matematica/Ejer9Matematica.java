
package ejer9matematica;
import Entidad.Matematica;
import Servicios.ServiciosMatematica;


    public class Ejer9Matematica {


        public static void main(String[] args) {
            ServiciosMatematica serv1 = new ServiciosMatematica();
            Matematica prueba1 = new Matematica();
            prueba1.setNumero1(Math.random()*100);
            prueba1.setNumero2(Math.random()*100);
            serv1.devolverMayor(prueba1);
            serv1.calcularPotencia(prueba1);
            serv1.calcularRaiz(prueba1);
       }

    }
