/*
13. Hacer un programa el cual indique si un número es negativo y convertirlo a 
positivo; si es positivo a negativo.
 */
package sesion7;
import java.util.Scanner;
import java.math.*;

public class Ejercicio13 {
    public static void main(String[] args) {
        int num;
        
        Scanner valor = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num = valor.nextInt();
        
        if(num < 0){
            num = Math.abs(num); //Convirtiendo el numero a negativo
            
            System.out.println("El numero es negativo");
        }else{
            num = num * -1; //Convirtiendo el numero a positivo
            
            System.out.println("El numero es positivo");
        }
        
        System.out.println("La conversion inversa es: " + num);
    }
}
