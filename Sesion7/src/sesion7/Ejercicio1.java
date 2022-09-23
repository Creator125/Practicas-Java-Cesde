/*
1. Leer 2 números para realizar una división. Si el segundo número es cero 
escribas "la división no es posible".
 */
package sesion7;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int num1, num2;
        
        System.out.println("Ingrese dos numeros para realizar una division");
        
        //num1
        Scanner valor1 = new Scanner(System.in);
        System.out.print("Primer numero: ");
        num1 = valor1.nextInt();
        
        //num2
        Scanner valor2 = new Scanner(System.in);
        System.out.print("Segundo numero: ");
        num2 = valor2.nextInt();
        
        if(num2 == 0){
            System.out.println("La division no es posible");
        }else{
            int resultado = num1 / num2;
            
            System.out.println("=> " + resultado);
        }
    }
}
