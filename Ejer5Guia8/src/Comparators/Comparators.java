
package Comparators;

import Entidad.Paises;
import java.util.Comparator;


public class Comparators {
    public static Comparator<Paises> ordenarAlfab = new Comparator<Paises>() {
        @Override
        public int compare(Paises t, Paises t1) {
            return t.getPais().compareTo(t1.getPais());
        }
    };
    
        
    
}
