
package ejernespresso;
import Entidad.Cafetera;
import Servicio.ServiciosCafetera;



public class EjerNespresso {

    
    public static void main(String[] args) {
        ServiciosCafetera serv1 = new ServiciosCafetera();
        Cafetera Nespresso = serv1.llenarCafetera();
        serv1.vaciarCafetera(Nespresso);
        serv1.agregarCafe(Nespresso);
        serv1.servirTaza(Nespresso);
        
    }
    
}
