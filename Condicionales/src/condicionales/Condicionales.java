/*
Sesion 6
Tema: Condicionales
Fecha: Lunes 16 de septiembre de 2022
 */
package condicionales;
import java.util.Scanner;

public class Condicionales {

    public static void main(String[] args) {
    /*
        // Condicional con constantes
        int a = 4, 
            b = 8;
        
        if(a > b){
            System.out.println("El numero mayor es: " + a);
        }else{
            System.out.println("El numero mayor es: " + b);
        }
    */
        int a, b;
        
        //Valor de a
        Scanner valor1 = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        a = valor1.nextInt();
        //Valor de b
        Scanner valor2 = new Scanner(System.in);
        System.out.println("Ingrese el segundo numero");
        b = valor2.nextInt();
        
        if(a > b){
            System.out.println("El numero mayor es: " + a);
        }else if(a == b){
            System.out.println("Los numeros son iguales");
        }else{
            System.out.println("El numero mayor es: " + b);
        }
    }
}
