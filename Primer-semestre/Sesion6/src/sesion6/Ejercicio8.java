/*
Lea dos números B y B y escriba ambos números si por lo menos uno de ellos es positivo
 */
package sesion6;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int a,b;
        
        System.out.println("Ingrese el valor de A");
        Scanner valor1 = new Scanner(System.in);
        a = valor1.nextInt();
        
        System.out.println("Ingrese el valor de B");
        Scanner valor2 = new Scanner(System.in);
        b = valor2.nextInt();
        
        
        if(a > 0 || b > 0){
            System.out.println("Tus numeros son:");
            System.out.println(a);
            System.out.println(b);
        }
    }
}
