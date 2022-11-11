
package ejrectangulo;
import Entidad.Rectangulo;
import Servicio.ServicioRectangulo; 

public class EjRectangulo {

    
    public static void main(String[] args) {
        ServicioRectangulo serv1= new ServicioRectangulo();
        Rectangulo rect1 = serv1.crearRectangulo();
        serv1.calcularSuperficie(rect1);
        serv1.calcularPerimetro(rect1);
        serv1.dibujarCuadradito(rect1);
    }
    
}
