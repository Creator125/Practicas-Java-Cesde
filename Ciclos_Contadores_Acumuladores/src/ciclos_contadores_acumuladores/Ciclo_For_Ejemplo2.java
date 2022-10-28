/*
Imprimir los hasta el cinco
 */
package ciclos_contadores_acumuladores;
import java.util.Scanner;

public class Ciclo_For_Ejemplo2 {
    public static void main(String[] args) {
        int i=0,suma=0,num;
        
        for(i = 1; i <= 5; i++){
            System.out.println("Ingrese un numero");
            Scanner dato = new Scanner(System.in);
            num = dato.nextInt();
            
            suma = suma + num;
        }
        
        System.out.println("Suma total: "+ suma);
    }
}
