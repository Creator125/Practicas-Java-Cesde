/*
15. Leer el código de un empleado, el valor de la hora y el número de horas 
trabajadas en la semana. Calcule el salario semanal, teniendo en cuenta que si 
trabaja más de 48 horas le debe pagar un 35% de recargo por cada hora de más
 */
package sesion7;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        int codigo;
        double vh; //Valor por hora
        double nh; //Numero de horas
        double salario; //Salario semanal
        
        //Codigo
        System.out.println("Ingrese el codigo del empleado");
        Scanner valor0 = new Scanner(System.in);
        codigo = valor0.nextInt();
        
        //Valor por hora
        System.out.println("Ingrese el valor por horas");
        Scanner valor1 = new Scanner(System.in);
        vh = valor1.nextDouble();
        
        //Numero de horas
        System.out.println("Ingrese el numero de horas");
        Scanner valor2 = new Scanner(System.in);
        nh = valor2.nextDouble();
        
        
        salario = vh * nh;
        
        if (nh >= 48){
            double recargo = salario * 0.35;
            salario = salario + recargo;
            
            System.out.println("Al empleado " + codigo + " se le debe pagar un recargo del 30%");
            System.out.println("Al empleado " + codigo + " se le debe pagar en total " + salario);
        }else{
            System.out.println("Al empleado " + codigo + " se le debe pagar en total " + salario);
        }
    }
}
