/*
1. Desarrolle un programa escrito en lenguaje JAVA en el que se solicite un 
número al usuario entre 1 y 7 y que muestre a qué día de la semana corresponde
siendo 1 Lunes y 7 Domingo. Realice este programa utilizando la estructura SWITCH CASE. 
 */
package sesion8;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int num;
        
        System.out.println("Ingrese un numero entre 1 y 7");
        Scanner dato = new Scanner(System.in);
        num = dato.nextInt();
        
        switch(num){
            case 1:
                System.out.println("Lunes");
            break;
            
            case 2:
                System.out.println("Martes");
            break;
            
            case 3:
                System.out.println("Miercoles");
            break;
            
            case 4:
                System.out.println("Jueves");
            break;
            
            case 5:
                System.out.println("Viernes");
            break;
            
            case 6:
                System.out.println("Sabado");
            break;
            
            case 7:
                System.out.println("Domingo");
            break;
            
            default:
                System.out.println("El día " + num + " no existe, debe se un dia de la semana");
        }
    }
}
