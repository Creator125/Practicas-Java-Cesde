/*
6. Leer tres números enteros a, b, c y mostrar el que sea múltiplo de 7; si no lo 
es, escriba un mensaje "No es divisible por 7".
 */
package sesion7;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int a,b,c;
        
        //a
        System.out.println("Ingrese el primer numero");
        Scanner valor1 = new Scanner(System.in);
        a = valor1.nextInt();
        
        if(a % 7 == 0){
            System.out.println(a);
        }else{
            System.out.println("No es divisible por 7");
        }
        
        //b
        System.out.println("\nIngrese el segundo numero");
        Scanner valor2 = new Scanner(System.in);
        b = valor2.nextInt();
        
        if(b % 7 == 0){
            System.out.println(b);
        }else{
            System.out.println("No es divisible por 7");
        }
        
        //c
        System.out.println("\nIngrese el tecer numero");
        Scanner valor3 = new Scanner(System.in);
        c = valor3.nextInt();
        
        if(c % 7 == 0){
            System.out.println(c);
        }else{
            System.out.println("No es divisible por 7");
        }
        
    }
}
