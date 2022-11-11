
package Servicio;
import Entidad.NIF;
import java.util.Scanner;

public class ServiciosNif {
    public NIF crearNIF(){
        Scanner leer = new Scanner(System.in);
        NIF Nifx = new NIF();
        int resto;
        System.out.println("Ingrese su numero de DNI: ");
        Nifx.setDNI(leer.nextLong());
        resto = Math.round(Nifx.getDNI()%23);
        String [] vectorCaracteres = new String [23];
        vectorCaracteres[0]="T";
        vectorCaracteres[1]="R";
        vectorCaracteres[2]="W";
        vectorCaracteres[3]="A";
        vectorCaracteres[4]="G";
        vectorCaracteres[5]="M";
        vectorCaracteres[6]="Y";
        vectorCaracteres[7]="F";
        vectorCaracteres[8]="P";
        vectorCaracteres[9]="D";
        vectorCaracteres[10]="X";
        vectorCaracteres[11]="B";
        vectorCaracteres[12]="N";
        vectorCaracteres[13]="J";
        vectorCaracteres[14]="Z";
        vectorCaracteres[15]="S";
        vectorCaracteres[16]="Q";
        vectorCaracteres[17]="V";
        vectorCaracteres[18]="H";
        vectorCaracteres[19]="L";
        vectorCaracteres[20]="C";
        vectorCaracteres[21]="K";
        vectorCaracteres[22]="E";
        
        /*/for (int i = 0; i < vectorCaracteres.length; i++) {
            System.out.println("V["+i+"]");           
            vectorCaracteres[i]=leer.next();
        }   ///PODRIA CARGAR TODO ANTES Y DEJARLO CREADO. 
    */
        String caracter=vectorCaracteres[resto];
        Nifx.setLetra(caracter);
        return Nifx;
    }
    public void mostrarNif(NIF Nifx){
        System.out.println(+Nifx.getDNI()+"-"+Nifx.getLetra());
    }
}
