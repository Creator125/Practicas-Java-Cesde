/*
11. Deducir si un número leído desde el teclado es positivo, negativo o igual 
a Cero (0)
 */
package sesion7;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        int num;
        
        Scanner valor = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num = valor.nextInt();
        
        if(num > 0){
            System.out.println("El numero es positivo");
        }else if(num < 0){
            System.out.println("El numero es negativo");
        }else{
            System.out.println("El numero es igual a cero (0)");
        }
    }
}
