
package Entidad;


public class CuentaBancaria {
    private String nombre;
    private int numeroCuenta;
    private int DNI;
    private double saldo; 

    public cuentaBancaria() {
    }

    
    public CuentaBancaria(String nombre, int numeroCuenta, int DNI, double saldo) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
