/*
Elaborar un algoritmo para calcular el promedio final de la materia de 
algoritmos. Dicha calificación se compone de los siguientes porcentajes.

55% -----del promedio final de sus calificaciones parciales (3)

30% ----- de la calificación de promedio

15% ----- de la calificación de un trabajo final
 */
package sesion2;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        float c_parciales,c_promedio,c_trabajo_final;
        
        //Parciales
        System.out.println("Ingrese la nota del paracial 1");
        Scanner valor1 = new Scanner(System.in);
        float parcial1 = valor1.nextFloat();
        
        System.out.println("Ingrese la nota del paracial 2");
        Scanner valor2 = new Scanner(System.in);
        float parcial2 = valor2.nextInt();
        
        System.out.println("Ingrese la nota del paracial 3");
        Scanner valor3 = new Scanner(System.in);
        float parcial3 = valor3.nextFloat();
         
        
        //Calificaciones del promedio
        System.out.println("Ingrese la calificacion promedio");
        Scanner valor4 = new Scanner(System.in);
        c_promedio = valor4.nextFloat();
        
        
        //Calificaciones del trabajo final
        System.out.println("Ingrese la calificacion del trabajo final");
        Scanner valor5 = new Scanner(System.in);
        c_trabajo_final = valor5.nextFloat();
        
        //Hallando el promedio de los parciales
        c_parciales = (parcial1 + parcial2 + parcial3) / 3;
        //Hallando el promedio final
        double promedio_final = (c_parciales * 0.55) + (c_promedio * 3.0) + (c_trabajo_final * 0.15);
        
        //Resultado
        System.out.println("Valor del promedio final: " + promedio_final);
    }
}
