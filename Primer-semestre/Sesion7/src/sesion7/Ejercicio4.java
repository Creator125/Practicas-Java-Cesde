/*
4.  Leer 4 números y escribir el mayor de ellos.
 */
package sesion7;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int num1,num2,num3,num4;
        
        System.out.println("Ingrese 4 numeros para impimir el mayor");
        
        //num1
        Scanner valor1 = new Scanner(System.in);
        num1 = valor1.nextInt();
     
        //num2
        Scanner valor2 = new Scanner(System.in);
        num2 = valor2.nextInt();
        
        //num3
        Scanner valor3 = new Scanner(System.in);
        num3 = valor3.nextInt();
        
        //num4
        Scanner valor4 = new Scanner(System.in);
        num4 = valor4.nextInt();
        
        
        if((num1 > num2) && (num1 > num3) && (num1 > num4)){ //num1 mayor
            System.out.println("\nNumero mayor: " + num1);
        }else if((num2 > num1) && (num2 > num3) && (num2 > num4)){ //num2 mayor
            System.out.println("\nNumero mayor: " + num2);
        }else if((num3 > num1) && (num3 > num2) && (num3 > num4)){ //num3 mayor
            System.out.println("\nNumero mayor: " + num3);
        }else if((num4 > num1) && (num4 > num2) && (num4 > num3)){ //num4 mayor
            System.out.println("\nNumero mayor: " + num4);
        }else{ //Numeros iguales
            System.out.println("Los numeros son iguales");
        }
    }
}
