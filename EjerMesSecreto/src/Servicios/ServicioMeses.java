
package Servicios;
import Entidad.Meses;
import java.util.Scanner;
public class ServicioMeses {
    public Meses llenar(){
        Scanner leer= new Scanner(System.in);
        Meses meses = new Meses();
        String vector [] = new String[meses.getMeses().length];
        vector[0]="enero";
        vector[1]="febrero";
        vector[2]="marzo";
        vector[3]="abril";
        vector[4]="mayo";
        vector[5]="junio";
        vector[6]="julio";
        vector[7]="agosto";
        vector[8]="septiembre";
        vector[9]="octubre";
        vector[10]="noviembre";
        vector[11]="diciembre";
        meses.setMesSecreto(vector[8]);
        String mes;
        
        do{
            System.out.println("Ingrese un mes: ");
            mes = leer.next();
            if(mes.equalsIgnoreCase(meses.getMesSecreto())){              
                if (mes.equals(meses.getMesSecreto())){
                    System.out.println("Felicidades! Ha acertado.");
                    break;
                }
            }
        }while(!mes.equals(meses.getMesSecreto()));
                
        return meses; 
    }
    
}
