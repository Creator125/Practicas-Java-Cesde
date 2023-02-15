/*
12. Lea dos números X y Y y escriba ambos números si por lo menos uno de 
ellos es positivo.
 */
package sesion7;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        int x,y;
        
        //x
        System.out.println("Ingrese el valor de X");
        Scanner valor1 = new Scanner(System.in);
        x = valor1.nextInt();
        
        //y
        System.out.println("Ingrese el valor de Y");
        Scanner valor2 = new Scanner(System.in);
        y = valor2.nextInt();
        
        
        if(x > 0 || y > 0){
            System.out.println("Tus numeros son:");
            System.out.println(x);
            System.out.println(y);
        }
    }
}
