/*
Dados tres números A, B y C, calcular las soluciones de la ecuación Ax2+Bx+C=0.
 */
package sesion2;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int A,B,C,x,ecuacion;
        
        System.out.println("Ingrese el valor de A"); //Dando valor a las variables
        Scanner valor1 = new Scanner(System.in);
        A = valor1.nextInt();
        
        System.out.println("Ingrese el valor de B");
        Scanner valor2 = new Scanner(System.in);
        B = valor2.nextInt();
        
        System.out.println("Ingrese el valor de C");
        Scanner valor3 = new Scanner(System.in);
        C = valor2.nextInt();
        
        System.out.println("Ingrese el valor de x");
        Scanner valor4 = new Scanner(System.in);
        x = valor2.nextInt();
        
        ecuacion = (A * x * 2) + (B * x) + C; //Resolviendo la ecucacion
        boolean resul = (ecuacion == 0);
        
        System.out.println("Resultado de la ecuacion: "+resul);
    }
}
