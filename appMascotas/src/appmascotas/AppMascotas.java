

package appmascotas;

import appmascotas.Entidades.Mascota;
//import java.util.Scanner;
import appmascotas.servicios.ServicioMascotas;
public class AppMascotas {

  
    public static void main(String[] args) {
     ///   Scanner leer = new Scanner(System.in); Borro mientras para ver lo del ServicioMascotas. 
     ServicioMascotas sm = new ServicioMascotas();
     Mascota m1 = sm.crearMascota();
        System.out.println(m1.toString());
     //Mascota m1 = new Mascota();
     //Ahora le vamos a dar caracteristicas a la mascota m1 poniendo "m1." lo que nos permite acceder a las caracteristicas
     //Tambien podiamos hacerlo mediante el uso de la variable scanner con el java util. 
     //y si fuera el caso podrimamos asignar el valor con cualquiera de las dos. 
     /*
     m1.apodo= "chiquito";
     m1.nombre="Fernando chiquito";
     m1.tipo="Perro";
     m1.edad=14;
     m1.raza="Beagle";
     m1.cola=true;
     m1.color="Tricolor";
     ///Aca ya tengo creada mi primer mascota.
     /*
     //EN LUGAR DE LO ANTERIOR, VAMOS A CREARLOS CON LOS CONSTRUCTORES. 
     */
     //Mascota m1 = new Mascota("Rocky", "perrito", "Perro");
     //Cambiamos los atributos del constructor de la clase Mascota a private y los resultados dan error.
     //Es lo que esperabamos -> debemos usar los setter. Lo creamos en la clase Mascota. 
     ///Mascota m1 = new Mascota("Rocky", "perrito", "Perro"); Comento para probar lo del servivio. 
     ///m1.setNombre("Rocky chiquito"); //Aca modificamos el de arriba ... Comento para probar lo del servivio.
     ///m1.pasear(100); ... Comento para probar lo del servivio.
    /*
     Mascota m2 = new Mascota();
     Podríamos crear todos los objetos que querramos de la misma forma
    */
    //MOSTRAR DATOS -> como en este caso no pusimos la edad, tira el valor 0 por defecto. 
        //System.out.print("Hola! Soy Alejandro, mi mascota se llama "+m1.nombre+", es un "+m1.tipo+" ");
        //System.out.print("y tiene "+m1.edad+" años.");
        //System.out.println(m1.nombre); //Si lo dejo así (solo poniendo el nombre) y quiero mostrar el nombre no voy a poder.
       // System.out.println(m1.getNombre()); //así es la forma correcta usando el getter. Aca vemos que si toma al nombre modificado por el setter.
        //Con la nueva funcion que hicimos, el to string, podemos hacer: 
       // System.out.println(m1); //o
        //System.out.println(m1.toString()); //y nos tira los valores que pusimos o aquellos por defecto. 
    }
    
}
