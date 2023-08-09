/*
Calcular la media (promedio) de 3 números.
 */
package sesion2;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int num1,num2,num3;
        
        System.out.println("Ingrese 3 numeros para hallar la media"); 
        Scanner valor1 = new Scanner(System.in);
        num1 = valor1.nextInt();
        
        Scanner valor2 = new Scanner(System.in);
        num2 = valor2.nextInt();
        
        Scanner valor3 = new Scanner(System.in);
        num3 = valor3.nextInt();
        
        int media = (num1 + num2 + num3) / 3; //Hallando la media
        
        System.out.println("La media es: "+media); //Imprimiendo la media
    }
}
