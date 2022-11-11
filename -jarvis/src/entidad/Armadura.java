
package entidad;


public class Armadura {
   
   private double energia;
   private double consumoBasicoBotaDerecha;
   private double consumoBasicoBotaIzquierda;
   private double consumoBasicoGuanteDerecho;
   private double consumoBasicoGuanteIzquierdo;
   private double consumoSintetizador;
   private int resistencia;

    public Armadura() {
        
    }

    public Armadura(double energia, double consumoBasicoBotaDerecha, double consumoBasicoBotaIzquierda, double consumoBasicoGuanteDerecho, double consumoBasicoGuanteIzquierdo, double consumoSintetizador, int resistencia) {
        this.energia = 9999999999.99;
        this.consumoBasicoBotaDerecha = 100.00;
        this.consumoBasicoBotaIzquierda = 100.00;
        this.consumoBasicoGuanteDerecho = 75.00;
        this.consumoBasicoGuanteIzquierdo = 75.00;
        this.consumoSintetizador = 25.00;
        this.resistencia = 100;
    }

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }

    public double getConsumoBasicoBotaDerecha() {
        return consumoBasicoBotaDerecha;
    }

    public void setConsumoBasicoBotaDerecha(double consumoBasicoBotaDerecha) {
        this.consumoBasicoBotaDerecha = consumoBasicoBotaDerecha;
    }

    public double getConsumoBasicoBotaIzquierda() {
        return consumoBasicoBotaIzquierda;
    }

    public void setConsumoBasicoBotaIzquierda(double consumoBasicoBotaIzquierda) {
        this.consumoBasicoBotaIzquierda = consumoBasicoBotaIzquierda;
    }

    public double getConsumoBasicoGuanteDerecho() {
        return consumoBasicoGuanteDerecho;
    }

    public void setConsumoBasicoGuanteDerecho(double consumoBasicoGuanteDerecho) {
        this.consumoBasicoGuanteDerecho = consumoBasicoGuanteDerecho;
    }

    public double getConsumoBasicoGuanteIzquierdo() {
        return consumoBasicoGuanteIzquierdo;
    }

    public void setConsumoBasicoGuanteIzquierdo(double consumoBasicoGuanteIzquierdo) {
        this.consumoBasicoGuanteIzquierdo = consumoBasicoGuanteIzquierdo;
    }

    public double getConsumoSintetizador() {
        return consumoSintetizador;
    }

    public void setConsumoSintetizador(double consumoSintetizador) {
        this.consumoSintetizador = consumoSintetizador;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    
   
}
