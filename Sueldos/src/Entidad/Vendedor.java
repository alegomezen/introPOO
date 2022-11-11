
package Entidad;
import java.util.Date;

public class Vendedor {
    private String nombre;
    private int dni;
    private double comisiones;
    private double sueldoBasico;
    private double sueldoMensual;
    private Date fechaInicio;
//Atributos
//Constructor por defecto
    public Vendedor() {
    }
//Constructor por parametros  
    public Vendedor(String nombre, int dni, double comisiones, double sueldoBasico, double sueldoMensual, Date fechaInicio) {
        this.nombre = nombre;
        this.dni = dni;
        this.comisiones = comisiones;
        this.sueldoBasico = sueldoBasico;
        this.sueldoMensual = sueldoMensual;
        this.fechaInicio = fechaInicio;
    }
    //Agregamos getters and setters 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getComisiones() {
        return comisiones;
    }

    public void setComisiones(double comisiones) {
        this.comisiones = comisiones;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    //Añadimos el metodo toString()

    @Override
    public String toString() {
        return "Vendedor{" + "nombre=" + nombre + ", dni=" + dni + ", comisiones=" + comisiones + ", sueldoBasico=" + sueldoBasico + ", sueldoMensual=" + sueldoMensual + ", fechaInicio=" + fechaInicio + '}';
    }
    
    
    
}
