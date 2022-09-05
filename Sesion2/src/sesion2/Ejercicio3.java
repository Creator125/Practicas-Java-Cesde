/*
Dado un número entero determine si el número es primo.
 */
package sesion2;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int num;
        
        System.out.println("Ingrese un numero"); //Dando valor a la variable
        Scanner valor = new Scanner(System.in);
        num = valor.nextInt();
        
        if(num % 2 == 0){
            System.out.println("El numero ingresado es primo");
        }else{
            System.out.println("El numero ingresado no es primo");
        }
    }
}
