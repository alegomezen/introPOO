
package ejer12personas;
import Entidad.Persona;
import Servicios.ServicioPersona;

public class Ejer12Personas {

    
    public static void main(String[] args) {
       ServicioPersona serv1 = new ServicioPersona();
       Persona pers1 = serv1.crearPersona();
       serv1.menorQue(pers1, 0);
    }
    
}
