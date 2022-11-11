
package ejeroperacion;
import Entidad.Operacion;
import Servicio.ServicioOperacion;

public class EjerOperacion {

    
    public static void main(String[] args) {
       ServicioOperacion servicio1 = new ServicioOperacion();
       Operacion primera = servicio1.crearOperacion();
       servicio1.sumar(primera);
       servicio1.restar(primera);
       servicio1.multiplicar(primera);
       servicio1.dividir(primera); 
       
        
    }
    
}
