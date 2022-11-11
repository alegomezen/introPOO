
package ejerpuntosg7;
import Servicios.ServiciosPuntos;
import Entidad.Puntos;

public class EjerPuntosG7 {

   
    public static void main(String[] args) {
        ServiciosPuntos serv1 = new ServiciosPuntos();
        Puntos coordenadas = serv1.crearPuntos();
        serv1.calcularDistancia(coordenadas);
    }
    
}
