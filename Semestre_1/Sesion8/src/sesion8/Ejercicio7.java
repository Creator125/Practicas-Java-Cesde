/*
7. En muchos países del mundo, aun la calificación en las diferentes 
instituciones de educación es de forma cualitativa utilizando letras desde la A 
hasta la F. realiza un algoritmo que dependiendo de la letra ingresada muestra 
un mensaje donde indique el resultado de la evaluación. 
(Desempeño bajo, desempeño básico, desempeño alto, desempeño superior, aprobado con honores, deficiente)
 */
package sesion8;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        String calificacion, mensaje;
        
        System.out.println("Ingrese la nota del estudiante");
        Scanner dato = new Scanner(System.in);
        calificacion = dato.nextLine();
        
        switch(calificacion){
            case "A+": mensaje = "Aprobado con honores"; break;     
            case "A": mensaje = "Desempeño superior"; break;    
            case "B": mensaje = "Desempeño alto"; break;               
            case "C": mensaje = "Desempeño básico"; break;              
            case "D": mensaje = "Desempeño bajo"; break;                
            case "F": mensaje = "Deficiente"; break;                
            default: mensaje = "Nota inexistente";
        }
        
        System.out.println(mensaje);
    }
}