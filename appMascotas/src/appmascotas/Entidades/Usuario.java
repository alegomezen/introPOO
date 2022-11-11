
package appmascotas.Entidades;

import java.util.Date;


public class Usuario {
    public String nombre;
    public String apellido;
    public String pais;
    public int edad;
    public int DNI;
    public Date nacimiento; //añadimos la fecha de nacimiento
    //como Date porque podemos cambiar automaticamente la edad de la persona o la mascota. 
   //CONSTRUCTOR

    public Usuario() {
    }
    /*
    public Usuario(String nombre, String apellido, int DNI){
        this.nombre=nombre;
        this.apellido=apellido;
        this.DNI=DNI;
    }
*/
   ////Alternativamente -> lo generamos completo con el insertar. 
    public Usuario(String nombre, String apellido, String pais, int edad, int DNI, Date nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.edad = edad;
        this.DNI = DNI;
        this.nacimiento = nacimiento;
    }
    
    
}
