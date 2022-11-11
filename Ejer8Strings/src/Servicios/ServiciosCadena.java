
package Servicios;
import Entidad.Cadena;

    public class ServiciosCadena {
        public void invertirFrase(Cadena frase1){
            int longitud = frase1.getLongitud();
            String frase = frase1.getFrase();
            String fraseInvertida;
            for (int i = longitud-1; i >= 0; i--) {
                System.out.print(frase.charAt(i));      
            }  
        } 
        private static boolean esVocal(char letra) {
    return "aeiou".contains(String.valueOf(letra).toLowerCase());
}
        public int mostrarVocales(Cadena frase1){
            int contador = 0;
            String frase;
            frase = frase1.getFrase();
            for (int i = 0; i < frase.length(); i++) {
                char letraActual=frase.charAt(i);
                if (esVocal(letraActual)){
                    contador = contador + 1;
                }
            }
            System.out.println(" ");
            System.out.println("La cantidad de vocales en la frase es: "+contador+".");
            return contador; 
        }
        public void vecesRepetido(String letra, Cadena frase1){
            int longitud = frase1.getLongitud();
            String frase=frase1.getFrase();
            int contador = 0;
            for (int i = 0; i < longitud; i++) {
                if (frase.substring(i,i+1).equals(letra)){
                    contador=contador+1; 
                }     
            }
            System.out.println("La cantidad de veces que la letra '"+letra+"'se repite, es: "+contador+".");
        }
        public void compararLongitud(String frase, Cadena frase1){
            int longitud1=frase.length();
            int longitud2=frase1.getLongitud();
            if (longitud1>longitud2){
                System.out.println("La frase ingresada tiene una longitud mayor a la anterior.");
            } else if (longitud1<longitud2) {
                System.out.println("La primer frase tiene una longitud mayor.");
            }else
            {
                System.out.println("Las cadenas tienen la misma longitud.");
            }
            
        }
        public void unirFases(String frase, Cadena frase1){
            System.out.println(frase1.getFrase().concat(frase));
        }
        public void reemplazar(String c1, Cadena frase1){
          if(frase1.getFrase().contains("a")){
                frase1.setFrase(frase1.getFrase().replace("a", c1));
            }
           System.out.println(frase1.getFrase());
        }
        public void contiene(String letra, Cadena frase1){
            boolean contiene;
            int longitud = frase1.getLongitud();
            for (int i = 0; i < longitud; i++) {
                if (frase1.getFrase().contains(letra)){
                    contiene=true;
                    System.out.println("La frase contiene a la letra elegida.");
                }else{
                    System.out.println("La frase no contiene a la letra elegida.");
                }
                    
            }
           
        }
    } 
