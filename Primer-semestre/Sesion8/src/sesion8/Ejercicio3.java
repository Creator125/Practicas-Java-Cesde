/*
3.Diseñe un algoritmo que determine la cifra de las unidades de un número 
natural como palabra. Por ejemplo, si se ingresa 10, debe imprimir cero, si se 
ingresa 15, debe imprimir cinco, si se ingresa 123, debe imprimir tres, etc.
 */
package sesion8;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int num, unidades;
        String palabra;
        
        System.out.println("Ingrese un numero");
        Scanner dato = new Scanner(System.in);
        num = dato.nextInt();
        
        unidades = num % 10;
        
        switch(unidades){
            case 0: palabra = "Cero"; break;
            case 1: palabra = "Uno"; break;
            case 2: palabra = "Dos"; break;
            case 3: palabra = "Tres"; break;
            case 4: palabra = "Cuatro"; break;
            case 5: palabra = "Cinco"; break;    
            case 6: palabra = "Seis"; break;
            case 7: palabra = "Siete"; break;
            case 8: palabra = "Ocho"; break;    
            default: palabra = "Nueve";
        }
        
        System.out.println(palabra);
    }
}
