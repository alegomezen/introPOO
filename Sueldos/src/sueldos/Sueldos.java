
package sueldos;

import Entidad.Vendedor;
import Servicios.VendedorServicio;


public class Sueldos {

    
    public static void main(String[] args) {
        VendedorServicio vs = new VendedorServicio();
        Vendedor v1 = vs.altaVendedor();
        vs.SueldoMensual(v1);
        vs.Vacaciones(v1); 
    }
    
}
