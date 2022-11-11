
package circunferenciaprueba;
import Entidad.Circunferencia;
import Servicios.ServicioCircunferencia;


public class CircunferenciaPrueba {

    
    public static void main(String[] args) {
    ServicioCircunferencia servicio1 = new ServicioCircunferencia();
    Circunferencia circ1 = servicio1.crearCircunferencia();       //convino con el servicio
    servicio1.area(circ1);
    servicio1.perimetro(circ1); 
    }
        
}
