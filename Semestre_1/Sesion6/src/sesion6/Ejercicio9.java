/*
9. Leer un número entero, si es par elevarlo al cuadrado y mostrar el resultado;
si es impar, elevarlo al cubo y mostrar el resultado
 */
package sesion6;

import java.util.Scanner;
import java.math.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        int num,resultado;
        
        System.out.println("Ingrese un numero");
        Scanner valor1 = new Scanner(System.in);
        num = valor1.nextInt();
        
        if(num % 2 == 0){
            resultado =(int)Math.pow(num, 2);
            System.out.println("Se elevó el numero al cuadrado");
        }else{
            resultado =(int)Math.pow(num, 3);
            System.out.println("Se elevó el numero al cubo");
        }
        
        System.out.println("\nEl resutado fue: " + resultado);
    }
}
