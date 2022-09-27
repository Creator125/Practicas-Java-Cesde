/*
3. De 3 números cualquiera. Escribirlos en orden ascendente de menor a mayor.
 */
package sesion7;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int num1, num2, num3;
        
        System.out.println("Ingrese 3 numeros para organizalos ascendentemente");
        
        //num1
        Scanner valor1 = new Scanner(System.in);
        num1 = valor1.nextInt();
        
        //num2
        Scanner valor2 = new Scanner(System.in);
        num2 = valor2.nextInt();
        
        //num3
        Scanner valor3 = new Scanner(System.in);
        num3 = valor3.nextInt();
        
        System.out.println("\nLa organizacion ascendentemente es:");
        
        if(num1 < num2 && num1 < num3){ //num1 menor
            if(num2 < num3){
                System.out.println(num1);
                System.out.println(num2);
                System.out.println(num3);
            }else{
                System.out.println(num1);
                System.out.println(num3);
                System.out.println(num2); 
            }
        }else if(num2 < num1 && num2 < num3){ //num2 menor
            if(num1 < num3){
                System.out.println(num2);
                System.out.println(num1);
                System.out.println(num3);
            }else{
                System.out.println(num1);
                System.out.println(num3);
                System.out.println(num2); 
            }
        }else if(num3 < num1 && num3 < num2){ //num3 menor
            if(num1 < num2){
                System.out.println(num3);
                System.out.println(num1);
                System.out.println(num2);
            }else{
                System.out.println(num3);
                System.out.println(num2);
                System.out.println(num1); 
            }
        }else{ //Todos los numeros iguales
            System.out.println("Los numeros son iguales");
        }
    }
}
