/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia7;
import Entidad.Persona;

/**
 *
 * @author agome
 */
public class JavaGuia7 {

    
  
    public static void main(String[] args) {
     Persona primeraPersona= new Persona("Alejandro", 42203417,22);
     Persona segundaPersona= new Persona("Rocky", 12321, 9);
      segundaPersona.setNombre("Rocky"); 
        System.out.println(segundaPersona);
    }
    
}
