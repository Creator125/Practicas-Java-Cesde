/*
Elaborar un algoritmo que obtenga e imprima el valor de Y a partir de la ecuación.
El sistema de ecuaciones lineales:

ax + by= C

dx + dy= f

Se puede resolver con las fórmulas:

X= ce – bf

   ae – bd

y= af – cd

   ae – bd

Si ae – bd ≠ 0

Elabore un algoritmo que lea los coeficientes a, b, c. e, f,  y calcule los 
valores de x,y.
 */
package sesion2;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        int a,b,c,d,e,f; //Variables a leer
        int x,y; //Variables a halla
        
        //Dando valor a las variables a asignar
        System.out.println("Ingrese el valor de a");
        Scanner valor1 = new Scanner(System.in);
        a = valor1.nextInt();
        
        System.out.println("Ingrese el valor de b");
        Scanner valor2 = new Scanner(System.in);
        b = valor2.nextInt();
        
        System.out.println("Ingrese el valor de c");
        Scanner valor3 = new Scanner(System.in);
        c = valor3.nextInt();
        
        System.out.println("Ingrese el valor de c");
        Scanner valor4 = new Scanner(System.in);
        d = valor4.nextInt();
        
        System.out.println("Ingrese el valor de e");
        Scanner valor5 = new Scanner(System.in);
        e = valor5.nextInt();
        
        System.out.println("Ingrese el valor de e");
        Scanner valor6 = new Scanner(System.in);
        f = valor6.nextInt();
        
        //Calculando el valor de las variable x
        x = (c * e) - (b * f);
        x = (a * e) - (b * d);
        //Calculando el valor de las variable y
        y = (a * f) - (c * d);
        y = (a * e) - (b * d);
        
        System.out.println("Valor de x: "+x);
        System.out.println("Valor de y: "+y);
    }
}
