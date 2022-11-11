package ejerpersona;

import Entidad.Persona;
import Servicio.ServiciosPersona;

public class EjerPersona {

    public static void main(String[] args) {
        ServiciosPersona serv1 = new ServiciosPersona();
        try{
            Persona persona1 = null;
        
        serv1.mayorDeEdad(persona1);
        } catch(NullPointerException a){
            System.out.println("No se encontró el objeto del tipo 'Persona'. Probablemente se inicializó como nulo.");
        }
        //Persona persona1 = null;
        //serv1.calcularIMC(persona1);
        //serv1.mayorDeEdad(persona1);
        /*
        Persona persona2 = serv1.crearPersona();
        serv1.calcularIMC(persona2);
        serv1.mayorDeEdad(persona2);
        Persona persona3 = serv1.crearPersona();
        serv1.calcularIMC(persona3);
        serv1.mayorDeEdad(persona3);
        Persona persona4 = serv1.crearPersona();
        serv1.calcularIMC(persona4);
        serv1.mayorDeEdad(persona4);
        */
    }

}
