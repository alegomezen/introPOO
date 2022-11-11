/*
 EJERCICIOS DE APRENDIZAJE. GUIA 1 JAVA. 
 */
package guiajavapdf;
import java.util.Scanner; 
import java.util.Random;

public class EjerciciosAprendizaje {

  
    public static void main(String[] args) {
        ///Ejercicio 1.
    
     
        Scanner leer = new Scanner(System.in); 
        /*
        System.out.println("Ingrese dos numeros enteros: ");
        */
        /*
        int numero1=leer.nextInt();
        int numero2=leer.nextInt();
        int suma= numero1+numero2;
        System.out.println("La suma de los numeros es: "+suma+".");
        */
        /*
        //Ejercicio 2.
        System.out.println("Ingrese su nombre: ");
        String nombre= leer.nextLine();
        System.out.println("Usted es: "+nombre+".");
    */
        //Ejercicio 3
        /*
        System.out.println("Ingrese una frase: ");
        String frase=leer.nextLine();
        System.out.println(frase.toUpperCase()+frase.toLowerCase()); 
        */
        //Ejercicio 4
        /*
        System.out.println("Ingrese la temperatura actual en grados centigrados: ");
        double tempCent=leer.nextDouble();
        double tempFar=32+(9*(tempCent/5));       
        System.out.println("Su equivalente en grados Farenheit es: "+tempFar);
        */
        //Ejercicio 5
        /*
        System.out.println("Ingrese un numero entero: ");
        int num=leer.nextInt();
       int doble=num*2;
       int triple=num*3;
       double raiz= Math.sqrt(num);
        System.out.print("El doble del numero "+num+" es "+doble+" , el triple es "+triple+" y su raiz");
        System.out.print(" cuadrada es "+raiz+".");
               */
        //Ejercicio 6 
        /*
        System.out.println("Ingrese un numero: ");
           int numeroPar=leer.nextInt();                              
           if (numeroPar%2==0) {
               System.out.println("El numero ingresado es par.");     
           } else {
               System.out.println("El numero ingresado es impar.");
           }
               */
        //Ejercicio 7 
        /*
        System.out.println("Ingrese la frase 'eureka': ");
        String palabra = leer.nextLine();
        if (!palabra.equals("eureka")){
            System.out.println("Incorrecto");
        } else {
            System.out.println("Correcto");
        }
        */
        //Ejercicio 8
        /*
        System.out.println("Ingrese una frase de 8 caracteres: ");
        String frase2 = leer.nextLine();
        int longitud = frase2.length();
        if (longitud==8){
            System.out.println("La longitud es correcta.");
        } else {
            System.out.println("Incorrecto, la frase no tiene 8 caracteres.");
        }
            */
        //Ejercicio 9
        /*
        System.out.println("Ingrese una frase que comience con la letra 'A': ");
        String frase3 = leer.next();
        int longitud2= frase3.length();
        
        if (frase3.startsWith("A")){
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
*/
        //Ejercicio 10
        /*
        System.out.println("Ingrese un numero limite: ");
        int numeroLim=leer.nextInt();
        int suma=0;
        int numeros;
        do {
            System.out.println("Ingrese otro numero para sumarlo: ");
            numeros=leer.nextInt(); 
            suma=suma+numeros;
            
        } while (suma<numeroLim);
        */
        //Ejercicio 11
        /*
        System.out.println("Bienvenido. Ingrese dos numeros enteros: ");
        int numero1= leer.nextInt();
        int numero2= leer.nextInt();
        int suma= numero1 + numero2;
        int resta=numero1-numero2;
        int multip=numero1*numero2;
        double division=(numero1/numero2);
        String salida="S";
        do {
            System.out.println("Ahora ingrese una opción:");
        System.out.println("1: Sumar");
        System.out.println("2: Restar");
        System.out.println("3: Multiplicar");
        System.out.println("4: Dividir");
        System.out.println("5: Salir");

        int opcion = leer.nextInt();
        switch (opcion){
            case 1:
                System.out.println("El resultado de sumar los numeros es: "+suma+".");
                break;
            case 2:
                System.out.println("El resultado de restar los numeros es: "+resta+".");
                break;
            case 3:
                System.out.println("El resultado de multiplicar los numeros es: "+multip+".");
                break;
            case 4:
                System.out.println("El resultado de dividir los numeros es: "+division+".");
                break;
            case 5:
                System.out.println("Seguro que desea salir?. Si esta seguro pulse 'S', sino, pulse otro caracter:" );
                salida=leer.next();
                if ("S".equals(salida));
                        break;
                
        }
        } while (!"S".equals(salida));
        */
        //Ejercicio 12
        /*
        String cadena1;
        int contCorrectas=0;
        int contIncorrectas=0;
                
        String cadena2="&&&&&";
        do {
            System.out.println("Ingrese una cadena de 5 caracteres. Recuerde! Debe comenzar con una 'X' y terminar con una 'O'.");
            System.out.println("Si desea finalizar, introduzca la FDE '&&&&&'.");
            cadena1=leer.next();
            int longitud=cadena1.length();
            if((longitud==5) && (cadena1.startsWith("X")) && ("O".equals(cadena1.substring(4)))) {
                contCorrectas++;                              
            } else {
                System.out.println("La frase ingresada no es valida.");
                contIncorrectas++;
            }
            } while (!cadena1.equals(cadena2)); 
            
        System.out.println("Luego de la prueba, el numero de codigos correctos es de "+contCorrectas+".");
        System.out.println("El numero de intentos incorrectos fue de "+contIncorrectas+".");
            */
        
        //Ejercicio 13.
        /*
        System.out.println("Elija una cantidad de euros a convertir: ");
        
        
        int euros=leer.nextInt();
        String moneda=leer.next();
        Conversion(euros,moneda); 
        */
       ///Ejercicio 15
       /*
        System.out.println("Se procederá a rellenar un vector y mostrarlo en orden decreciente: ");
        int[] vector;
        vector = new int[101];
        RellenarVector(vector);
        */
       ///Ejercicio 16
       
        
        
        
        
    }
      
         /*
        public static void Conversion(int euros){
          double eurosAlibras= (euros*0.86);
          double eurosAdolares= (euros*1.28611);
          double eurosAyenes= (euros*129.852);
           System.out.println("Los "+euros+" convertidos a libras son "+eurosAlibras+", a dolares "+eurosAdolares+"y a yenes "+eurosAyenes+".");
            */
            
       // } 
    /*
    public static void RellenarVector(int vector[], int N){
        for (int i = 0; i < N; i++) {
            vector[i]=(int)(Math.random()*100);          
        }
        
    }
   /*
    /*
    public static void RellenarVector(int vector[]){
        for (int i = 0; i < 101; i++) {
            vector[i]=i; 
        }
        //String aux= " ";
        ///for (int i=100; i>0; i--){
       ///     System.out.print(" "+vector[i]+" "); Lo hice así y escribia uno debajo del otro, con el siguiente que lo saqué del video escribe bien pero en orden creciente. 
       /// }
       for (int elemento : vector ){
        aux=aux+" "+elemento;
    }
    System.out.println(aux); 
    
    }
       */  
    /*
    public static void Conversion(int euros, String moneda){
        System.out.println("Elija una moneda para la conversion: ");
        if (moneda.equals("Libras")) {
            double eurosAlibras= euros*0.86;
            System.out.println("Los "+euros+" euros convertidos a libras son: "+eurosAlibras+" libras.");
        }
        if (moneda.equals("Dolares")) {
            double eurosAdolares= euros*1.28611;
            System.out.println("Los "+euros+"convertidos a libras son: "+eurosAdolares+" dolares.");
             
        }
      if (moneda.equals("Yenes")){ 
          double eurosAyenes= euros*129.852;
          System.out.println("Los "+euros+"convertidos a libras son: "+eurosAyenes+" yenes.");
      }
      
      }
    */

    
    
    
    
 
    
}
    




   
    
    
       

    

