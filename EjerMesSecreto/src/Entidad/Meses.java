
package Entidad;
import java.util.Scanner;

public class Meses {
    private String [] meses = new String [12]; 
    private String mesSecreto;
    public void llenarArreglo(){
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < meses.length; i++) {
            System.out.println("["+i+"]");
            meses[i]=leer.next(); 
        }
 
    }
    public Meses(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public Meses() {
    }
    
    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
    
}
