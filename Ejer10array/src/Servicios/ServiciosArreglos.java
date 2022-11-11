
package Servicios;
import Entidad.Arreglo;
import java.util.Arrays;

public class ServiciosArreglos {
    public Arreglo crearArregloA(){
        Arreglo vectorA = new Arreglo();
        double vector3 [] = new double[vectorA.getA().length];      
        for (int i = 0; i < vector3.length; i++) {
            vector3[i]=(double) Math.random()*10; 
            vectorA.setA(vector3);
        } 
        Arrays.sort(vector3);
        System.out.println(Arrays.toString(vector3));
        return vectorA;
    }
    public Arreglo crearArregloB(Arreglo A){
        Arreglo vectorB = new Arreglo();
        double vector4 [] = new double[vectorB.getA().length];
        double vector5 [] = new double[vectorB.getB().length];
        vector4=A.getA();
        for (int i = 0; i < vectorB.getB().length-10; i++) { 
            vector5[i]=vector4[i];
            for (int j = 0; j < vector4.length; j++) {
                Arrays.fill(vector5,10,20,0.5);               
            }
        
        }
        for (int i = 0; i < vectorB.getB().length; i++) {
            vectorB.setB(vector5);
        }
        System.out.println("Arreglo B: ");
        vectorB.mostrarB();
        
        return vectorB;
    }
    
    
    
}
