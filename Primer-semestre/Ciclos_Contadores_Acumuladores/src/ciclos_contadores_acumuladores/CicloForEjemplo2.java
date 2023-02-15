/*
Programa que lea 10 números desde teclado en un proceso repetitivo y muestre la suma.
*/
package ciclos_contadores_acumuladores;
import java.util.Scanner;
        
public class CicloForEjemplo2 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int num, suma=0;
        
        for(int i = 0; i <= 10; i++){
            System.out.println("Ingrese un numnero:");
            num = valor.nextInt(); //Entrada para los 10 numeros
            
            suma = suma + num;
        }
        
        System.out.println("Suma total: " + suma);
    }
}