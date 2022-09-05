/*
Dado un número entero determine el factorial de ese número.
 */
package sesion2;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int num;
        
        System.out.println("Ingrese un numero"); //Dando valor a la variable
        Scanner valor = new Scanner(System.in);
        num = valor.nextInt();
        
        int factorial = 1;
        
        for(int i= 1; i < num+1; i++){
            factorial = factorial * i;
        }
        
        System.out.println("El factorial de "+num+" es "+factorial);
    }
}
