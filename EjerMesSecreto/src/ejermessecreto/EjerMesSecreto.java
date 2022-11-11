
package ejermessecreto;
import Entidad.Meses;
import Servicios.ServicioMeses;

public class EjerMesSecreto {

    
    public static void main(String[] args) {
        ServicioMeses serv1 = new ServicioMeses();
        Meses juego1 = serv1.llenar();
    }
    
}
