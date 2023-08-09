/*
8. Leer un número, si este es > 0 sumarle 10 y poner el resultado en una 
variable SUM, de lo contrario si el número es < 0 multiplíquelo por su positivo.
 */
package sesion7;
import java.util.Scanner;
import java.math.*;

public class Ejercicio8 {
    public static void main(String[] args) {
        int num,sum;
        
        Scanner valor = new Scanner(System.in);
        System.out.println("Ingrese un numero : ");
        num = valor.nextInt();
        
        if(num > 0){
            sum = num + 10; //Sumando 10 al numero 
            
            System.out.println("=> " + sum);
        }else{
            num = num * Math.abs(num); //multiplicando el numero por su positivo
            
            System.out.println("=> " + num);
        }
    }
}
