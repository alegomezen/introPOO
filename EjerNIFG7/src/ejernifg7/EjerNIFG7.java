
package ejernifg7;
import Entidad.NIF;
import Servicio.ServiciosNif;

public class EjerNIFG7 {

   
    public static void main(String[] args) {
        ServiciosNif serv1 = new ServiciosNif();
        NIF Nif1 = serv1.crearNIF();
        serv1.mostrarNif(Nif1);
    }
    
}
