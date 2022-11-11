
 
package Entidad;


public class Persona {
   public String nombre; 
   public int DNI; 
   public int Edad; 
 
    public Persona(String nombre, int DNI, int Edad) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.Edad = Edad;
       
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
   

    

   
   
   
    
}
