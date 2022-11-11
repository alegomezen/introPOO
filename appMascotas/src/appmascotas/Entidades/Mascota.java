package appmascotas.Entidades;

public class Mascota {
    //cambiamos los atributos de public a private para ver el tema de los setter's
    private String nombre;
    private String apodo;
    //Aca veremos que puede ser cualquier tipo de mascota:
    private String tipo;
    private String raza;
    private String color;
    private int edad;
    private boolean cola; //si tiene o no cola. 
    //Estos son los atributos que tiene la clase Mascota-> como vemos, son los esperados si queremos
    //describir a una mascota. 
    //Añadimos el atributo energia para probar la funcion pasear
    private int energia;
    //CONSTRUIR EL CONSTRUCTOR
    public Mascota(){
        energia=1000; //hacemos que, por defecto, cualquier mascota creada tenga 1000 de energia    
        
    }
    public Mascota(String nombre, String apodo,String tipo){
        this.nombre= nombre; //Se usa la palabra reservada this para diferenciar el parametro de la asignación.
        this.apodo=apodo;                     //this hace referencia a esta clase, es decir, donde estamos parados.
        this.tipo=tipo;
        this.energia=1000;
    }                        
    ///alternativamente podemos iniciarlizar el constructor con el comando y nos lo genera automaticamente
    ///a ver si guarda xd 
    public Mascota(String nombre, String apodo, String tipo, String raza, String color, int edad, boolean cola) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.energia=1000; 
    }
    
    ///Creamos el setter para poder modificar los atributos desde el Main u otra clase. 
    public void setNombre(String nombre){
        this.nombre=nombre;
        //Ya esta hecho el setter 
    }
   ///Para mostrar el mensaje que quedó pendiente crearemos todos los setters que faltan.
   ////así podríamos cambiarle cualquiera de los atributos al objeto.
    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }
    //Ahora creamos los getter's -> en este caso no van los this. porque no hay redundancia.
    //no tienen parametros y devuelven el atributo.

    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }
    
    public int pasear(int energiaRestar){
        energia-=energiaRestar;
        return energia;
         
         
    } 

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", raza=" + raza + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", energia=" + energia + '}';
    }
    
    
    
    
}
