package vectores;
import java.util.Scanner;

public class Ejemplo2 {
    public static void main(String[] args) {
        int num, i;
        
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elemtos del vector");
        num = dato.nextInt();
        
        int[] vector = new int[num];
        
        for (i = 0; i <= num; i++) {
            System.out.println("Ingrese el elemento #" +i+ " :");
            vector[i] = dato.nextInt();
        }
        
        System.out.println(vector[i]);
    }
}
