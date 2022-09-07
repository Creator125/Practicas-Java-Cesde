/*
Calcular el sueldo de un empleado dados como datos de entrada: el nombre, hrs. 
De trabajo y el pago en hr.
 */
package sesion2;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        String nombre;
        int horas_trabajo;
        float pago_horas,sueldo;
    
        System.out.println("Ingrese el nombre"); //Entrada de caracteres
        Scanner valortext = new Scanner(System.in);
        nombre = valortext.nextLine(); 
        
        //Entradas numéricas
        System.out.println("Ingrese las horas de trabajo");
        Scanner valor1 = new Scanner(System.in);
        horas_trabajo = valor1.nextInt();
        
        System.out.println("Ingrese el pago por horas");
        Scanner valor2 = new Scanner(System.in);
        pago_horas = valor2.nextInt();
        
        //Hallando e imprimiedo el sueldo del empleado
        sueldo = pago_horas * horas_trabajo;
        
        System.out.println("El sueldo de "+nombre+" es $"+sueldo);
    }
    
}
