
package ejerraicesg7;
import Entidad.Raices;
import Servicios.Servicios;

public class EjerRaicesG7 {

   
    public static void main(String[] args) {
        Servicios serv1 = new Servicios();
        Raices rx = serv1.crearAtributos();
        serv1.getDiscriminante(rx);
        serv1.tieneRaices(rx);
        serv1.tieneRaiz(rx);
        serv1.obtenerRaices(rx);
        serv1.obtenerRaiz(rx);
        serv1.calcular(rx);
        
        
    }
    
}
