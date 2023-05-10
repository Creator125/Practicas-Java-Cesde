/*
7. Lea la cédula y la edad de cualquier persona e indique en un mensaje, 
si la persona es mayor de edad, el número de la cédula, si no lo es, escriba un 
mensaje que diga “No puede Votar”.
 */
package sesion7;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int cedula, edad;
        
        //Cedula
        System.out.println("Ingrese tu cedula");
        Scanner valor1 = new Scanner(System.in);
        cedula = valor1.nextInt();
        
        //Edad
        System.out.println("Ingrese tu edad");
        Scanner valor2 = new Scanner(System.in);
        edad = valor2.nextInt();
        
        if(edad >= 18){
            System.out.println("Tu cedula: " + cedula);
        }else{
            System.out.println("No puede Votar");
        }
    }
}