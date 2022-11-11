
package Entidad;


public class Ahorcado {
    private int longitud;
    private String [] palabra = new String[longitud];
    private int aciertos=0;
    private int intentosMax;
    private String [] palabraEncontrada = new String[longitud];

    public Ahorcado(int longitud, int intentosMax) {
        this.longitud = longitud;
        this.intentosMax = intentosMax;
    }

    public Ahorcado() {
    }
    
    
    
    public String[] getPalabraEncontrada() {
        return palabraEncontrada;
    }

    public void setPalabraEncontrada(String[] palabraEncontrada) {
        this.palabraEncontrada = palabraEncontrada;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getAciertos() {
        return aciertos;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }

    public int getIntentosMax() {
        return intentosMax;
    }

    public void setIntentosMax(int intentosMax) {
        this.intentosMax = intentosMax;
    }

   
    
    
}
