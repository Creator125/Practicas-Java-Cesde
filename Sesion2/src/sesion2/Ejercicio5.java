/*
Escribir el algoritmo para calcular la suma de los n primeros términos de la 
serie 1/x2 , para x=1,2, ,n.
 */
package sesion2;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int n,x;
        float serie=0;
        
        System.out.println("Ingrese un numero"); //Dando valor a laa variables
        Scanner valor = new Scanner(System.in);
        n = valor.nextInt();
        
        if(n > 0){
            System.out.println("Ingrese un numero para la operacion"); //Dando valor a las variable x
            Scanner valorx = new Scanner(System.in);
            x = valorx.nextInt();
            
            for(int i=1; i<=n; i++){ //Bucle para la serie
                serie = serie + (1 / ((float)i * x));
            }
            
            System.out.println("El resultado de la serie es: "+serie);
        }
        
        
    }
  
}
