/*
Secion 4
Tema: Importar librerias
 */
package impotar_librerias;
import java.util.Scanner;

public class Impotar_Librerias {

    public static void main(String[] args) {
        int nun1 = 6,num2 = 10;
        double numresul = Math.pow(nun1, 4); //Probando la libreria de matemáticas
        
        System.out.println("Resultado: "+numresul);
        
        Scanner tex = new Scanner(System.in); //Probando la libreria Scanner
        System.out.println("Ingrese una palabra");
        String palabra = tex.nextLine();
        
        Scanner valor1 = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int numin1 = valor1.nextInt();
        
        Scanner valor2 = new Scanner(System.in);
        System.out.println("Ingrese el segundo numero");
        int numin2 = valor2.nextInt();
        
        int suma = numin1 + numin2;
        
        System.out.println("Resultado de los numeros ingresados: "+suma);
    }
    
}
