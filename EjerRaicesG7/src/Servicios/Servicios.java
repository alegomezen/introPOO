
package Servicios;
import Entidad.Raices;
import java.util.Scanner;
import static java.lang.Math.pow;
public class Servicios {
    public Raices crearAtributos(){
        Scanner leer = new Scanner(System.in);
        Raices r = new Raices(); 
        System.out.println("Ingrese los valores de los coeficientes 'a', 'b' y 'c': ");
        r.setA(leer.nextDouble());
        r.setB(leer.nextDouble());
        r.setC(leer.nextDouble());       
        return r;
    }
    public double getDiscriminante(Raices r1){
        double discriminante; 
        double primerTermino = (Math.pow(r1.getB(),2));
        double segundoTermino = (4)*(r1.getA())*(r1.getC());
        //discriminante = (pow(r1.getB(),2))-(4)*(r1.getA())*(r1.getC());
        discriminante = primerTermino - segundoTermino; 
        System.out.println("El discriminante es: "+discriminante+".");
        return discriminante;
    }  
    public boolean tieneRaices(Raices r1){
        boolean solucion;
        double discriminante; 
        discriminante = (pow(r1.getB(),2))-(4)*(r1.getA())*(r1.getC()); 
        solucion=false;
        if (discriminante>=0){
            solucion=true;          
        } 
        return solucion; 
    }
    public boolean tieneRaiz(Raices r1){
        boolean solucion;
        double discriminante; 
        discriminante = (pow(r1.getB(),2))-(4*r1.getA()*r1.getC());
        solucion=false; 
        if (discriminante==0){
            solucion=true;
        }
        return solucion;
    } 
    public void obtenerRaices(Raices r1){
        tieneRaices(r1);
        double raiz1 = (-(r1.getB()))+Math.sqrt(((pow(r1.getB(),2))-(4*r1.getA()*r1.getC()))/(2*r1.getA()));
        double raiz2 = (-(r1.getB()))-Math.sqrt(((pow(r1.getB(),2))-(4*r1.getA()*r1.getC()))/(2*r1.getA()));
        System.out.println(+raiz1+" "+raiz2);          
    }
    public void obtenerRaiz(Raices r1){
        tieneRaiz(r1);
        double raiz3 = (-(r1.getB()))+Math.sqrt(((pow(r1.getB(),2))-(4*r1.getA()*r1.getC()))/(2*r1.getA()));
        System.out.println(raiz3);
    }
    public void calcular(Raices r1){
        tieneRaices(r1);
        tieneRaiz(r1);
        obtenerRaices(r1);
        obtenerRaiz(r1);
        double discriminante = (pow(r1.getB(),2))-(4*r1.getA()*r1.getC());
        if (discriminante<0){
            System.out.println("La ecuación cuadrática no tiene soluciones.");
        }
    }
}
