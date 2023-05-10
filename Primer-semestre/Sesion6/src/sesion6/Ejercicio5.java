/*
Lea dos números NRO1 y NRO2 y escriba ambos números sólo si son de diferente 
signo y distintos de cero.
 */
package sesion6;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int nro1,nro2;
        
        //Valor de nro1
        System.out.println("Ingrese el valor de NRO1");
        Scanner valor1 = new Scanner(System.in);
        nro1 = valor1.nextInt();
        
        //Valor de nro2
        System.out.println("Ingrese el valor de NRO2");
        Scanner valor2 = new Scanner(System.in);
        nro2 = valor2.nextInt();
        
        
        if((nro1 > 0 && nro2 < 0) && (nro1 != 0 && nro2 != 0)){
            System.out.println("Tus numeros son:");
            System.out.println(nro1);
            System.out.println(nro2);
        }else if((nro1 < 0 && nro2 > 0) && (nro1 != 0 && nro2 != 0)){
            System.out.println("Tus numeros son:");
            System.out.println(nro1);
            System.out.println(nro2);
        }
    }
}
