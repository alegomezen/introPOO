
package ejerbanco;
import Entidad.CuentaBancaria;
import Servicio.Servicios;


public class EjerBanco {

    
    public static void main(String[] args) {
        Servicios serv1 = new Servicios();
        CuentaBancaria cuenta1= serv1.crearCuenta();
        serv1.Ingresar(cuenta1);
        serv1.Retirar(cuenta1);
        serv1.extraccionRapida(cuenta1);
        serv1.mostrarSaldo(cuenta1);
        serv1.consultarDatos(cuenta1);
    }
    
}
