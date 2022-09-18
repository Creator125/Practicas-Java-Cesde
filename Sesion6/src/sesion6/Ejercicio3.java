/*
3.  Se le solicita a un usuario: código, número de días trabajados al mes y 
el salario básico por día.

a. Hallar el salario neto mensual teniendo en cuenta que si su salario básico 
mensual es >= de 1’400.000 le hace un descuento del 7% para impuestos, 3% para 
el seguro social y el 2% para pensiones; si es < 1’400.000 descuéntele 2% para 
el seguro social y 1.5 para fondo de pensiones y se le da un subsidio del 2%. 
Escriba el código del empleado, el salario neto y las deducciones
 */
package sesion6;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int codigo,dias_trabajados;
        double salario_mensual,salario_basico,seguro_social,pensiones,salario_neto;
        
        //Codigo
        System.out.println("Ingrese el codigo");
        Scanner valor1 = new Scanner(System.in);
        codigo = valor1.nextInt();
        
        //Dias trabajados al mes
        System.out.println("Ingrese los días trabajados al mes");
        Scanner valor2 = new Scanner(System.in);
        dias_trabajados = valor2.nextInt();
        
        //Salario básico por dias
        System.out.println("Ingrese el salario básico por dias");
        Scanner valor3 = new Scanner(System.in);
        salario_basico = valor3.nextDouble();
        
        
        salario_mensual = salario_basico * dias_trabajados; //Hallando el salario basico
        
        
        if(salario_mensual >= 1400000){
            double impuesto = salario_mensual - (salario_mensual * 0.7);
            seguro_social = salario_mensual - (salario_mensual * 0.3);
            pensiones = salario_mensual - (salario_mensual * 0.2);
            salario_neto = salario_mensual - impuesto - seguro_social - pensiones;
            
            //Imprimiendo las deducciones
            System.out.println("Codigo del usuario: " + codigo);
            System.out.println("Salario mensual: " + salario_mensual);
            System.out.println("Impuesto: " + impuesto);
            System.out.println("Seguro social: " + seguro_social);
            System.out.println("Pensiones: " + pensiones);
            System.out.println("Salario neto: " + salario_neto);
        }else{
            seguro_social = salario_mensual - (salario_mensual * 0.2);
            pensiones = salario_mensual - (salario_mensual * 1.5);
            double subsidio = salario_mensual + (salario_mensual * 0.2);
            salario_neto = salario_mensual - seguro_social - pensiones;
            
            //Imprimiendo las deducciones
            System.out.println("Codigo del usuario: " + codigo);
            System.out.println("Salario mensual: " + salario_mensual);
            System.out.println("Seguro social: " + seguro_social);
            System.out.println("Pensiones: " + pensiones);
            System.out.println("Subsidio: " + subsidio);
            System.out.println("Salario neto: " + salario_neto);
        }
    }
}
