/*
En un juego de preguntas que se responde “SI” o “NO”, gana quien responda 
correctamente las tres preguntas.  Si responde mal cualquiera de ellas, 
ya no se pregunta y termina el juego. Las preguntas son:

a. ¿Simón Bolívar liberto a Colombia?

b. ¿Camilo Torres fue guerrillero?

c. ¿El Binomio de Oro es un grupo de música vallenata?
 */
package Examen_temas_1;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        String opcion;
        
        System.out.println("\tBievenido");
        System.out.println("En este juego debes responde las sigientes preguntas. \n");
        
        //Pregunta a
        System.out.println("¿Simón Bolívar liberto a Colombia?");
        Scanner item1 = new Scanner(System.in); //Entrada para 'opcion'
        opcion = item1.nextLine();
        
        if(opcion.equals("Si") || opcion.equals("SI") || opcion.equals("si")){
            System.out.println("Correcto \n");
            
            //Pregunta b
            System.out.println("¿Camilo Torres fue guerrillero?");
            Scanner item2 = new Scanner(System.in); //Entrada para 'opcion'
            opcion = item2.nextLine();
            
            if(opcion.equals("Si") || opcion.equals("SI") || opcion.equals("si")){
                System.out.println("Correcto \n");
                
                //Pregunta c
                System.out.println("¿El Binomio de Oro es un grupo de música vallenata?");
                Scanner item3 = new Scanner(System.in); //Entrada para 'opcion'
                opcion = item3.nextLine();
                
                if(opcion.equals("Si") || opcion.equals("SI") || opcion.equals("si")){
                    System.out.println("Correcto");
                }else{
                    System.out.println("Incorrecto, fallaste");
                }
            }else{
                System.out.println("Incorrecto, fallaste");
            }            
        }else{
            System.out.println("Incorrecto, fallaste");
        }
        
        System.out.println("Gracias por participar");
    }
}
