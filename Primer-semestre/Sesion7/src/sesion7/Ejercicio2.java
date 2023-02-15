/*
2. Leer un número e escribir su raíz cuadrada. Si el número es menor que cero
escribir un mensaje "El número tiene raíz imaginaria".
 */
package sesion7;
import java.util.Scanner;
import java.math.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        int num;
        
        Scanner valor = new Scanner(System.in);
        System.out.println("Ingrese un numero para realizar una raiz cuadrada: ");
        num = valor.nextInt();
        
        if(num < 0){
            System.out.println("El numero tiene raiz imaginaria");
        }else{
            int resultado =(int) Math.sqrt(num); //Hallando la raiz cuadrada
            
            System.out.println("=> " + resultado);
        }
    }
}
