
package Comparadores;

import Entidad.Pelicula;
import java.util.Comparator;

//El comparator es una INTERFACE generica, ponemos entre los signos con qué debe trabajar. 
public class Comparadores {
    public static Comparator<Pelicula> ordenarPorDuracionDescend = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {           
            return t1.getDuracion().compareTo(t.getDuracion());
        }
    };
    public static Comparator<Pelicula> ordenarPorDuracionAscend = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
            return t.getDuracion().compareTo(t1.getDuracion());
        }
    };
    public static Comparator<Pelicula> ordenarAlfabPorTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
    public static Comparator<Pelicula> ordenarAlfabPorDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };
    
}
