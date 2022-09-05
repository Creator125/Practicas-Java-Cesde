/*
Dados dos números enteros calcular el cociente y el resto de su división entera.
 */
package sesion2;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int num1,num2,cosiente,resto_div;
        
        System.out.println("Ingrese dos numero"); //Dando valor a las variables
        Scanner valor1 = new Scanner(System.in);
        num1 = valor1.nextInt();
        
        Scanner valor2 = new Scanner(System.in);
        num2 = valor2.nextInt();
        
        cosiente = num1 / num2; //Realizando las operaciones
        resto_div = num1 % num2;
        
        System.out.println("Cociente: "+cosiente); //Mostrando el resultado
        System.out.println("Resto de la division entera: "+resto_div);
    }
}
