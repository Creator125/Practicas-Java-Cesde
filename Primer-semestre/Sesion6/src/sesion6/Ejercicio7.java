/*
7.  Deducir si un número leído desde el teclado es positivo, negativo o igual a Cero (0).
 */
package sesion6;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int num;
        
        System.out.println("Ingrese un numero");
        Scanner valor1 = new Scanner(System.in);
        num = valor1.nextInt();
        
        if(num > 0){
            System.out.println("El numero es positivo");
        }else if(num < 0){
            System.out.println("El numero es negativo");
        }else{
            System.out.println("El numero es igual a 0");
        }
    }
}
