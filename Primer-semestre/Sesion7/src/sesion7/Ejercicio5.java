/*
5. Leer tres números enteros x, y, z, compararlos y si al menos dos son iguales 
escriba un mensaje que diga: “Hacen pareja”.
 */
package sesion7;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int x, y, z;
        
        System.out.println("Ingrese 3 numeros");
        
        //x
        Scanner valor1 = new Scanner(System.in);
        x = valor1.nextInt();
        
        //y
        Scanner valor2 = new Scanner(System.in);
        y = valor2.nextInt();
        
        //z
        Scanner valor3 = new Scanner(System.in);
        z = valor3.nextInt();
        
        if(x == y || x == z){ //x = ?
            System.out.println("Hacen pareja");
        }else if(y == x || y == z){ //y = ?
            System.out.println("Hacen pareja");
        }else if(z == x || z == y){ // z = ?
            System.out.println("Hacen pareja");
        }
    }
}
