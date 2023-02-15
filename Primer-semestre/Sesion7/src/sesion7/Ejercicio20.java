/*
20. Se le solicita a un usuario: código, número de días trabajados al mes y el 
salario básico por día. Hallar el salario neto mensual teniendo en cuenta que si
su salario básico mensual es >= de 1’400.000 le hace un descuento del 7% para 
impuestos, 3% para el seguro social y el 2% para pensiones; si es < 1’400.000 
descuéntele 2% para el seguro social y 1.5 para fondo de pensiones y se le da un
subsidio del 2%. Escriba el código del empleado, el salario neto y las deducciones.
 */
package sesion7;
import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        String codigo;
        int dias_trabajados;
        double salario_mensual, salario_basico, seguro_social,
               pensiones, salario_neto, deducciones;
        
        //Codigo
        System.out.println("Ingrese el codigo");
        Scanner valor1 = new Scanner(System.in);
        codigo = valor1.nextLine();
        
        //Dias trabajados al mes
        System.out.println("Ingrese los días trabajados al mes");
        Scanner valor2 = new Scanner(System.in);
        dias_trabajados = valor2.nextInt();
        
        //Salario básico por dias
        System.out.println("Ingrese el salario básico por dias");
        Scanner valor3 = new Scanner(System.in);
        salario_basico = valor3.nextDouble();
        
        
        salario_mensual = dias_trabajados * salario_basico; //Hallando el salario basico
        
        
        if(salario_mensual >= 1400000){
            double impuesto = salario_mensual * 0.7;
            seguro_social = salario_mensual * 0.3;
            pensiones = salario_mensual * 0.2;
            deducciones = impuesto + seguro_social + pensiones;
            salario_neto = salario_mensual + deducciones;
        }else{
            seguro_social = salario_mensual * 0.2;
            pensiones = (salario_mensual * 15) / 100;
            double subsidio = salario_mensual * 0.2;
            deducciones = seguro_social + pensiones;
            salario_neto = salario_mensual + deducciones + subsidio;
            
            System.out.println("Se adicionó un subsidio del 2% ");
        }
        
        System.out.println("Codigo del empleado: " + codigo);
        System.out.println("Salario mensual: " + salario_mensual);
        System.out.println("Salario neto: " + salario_neto);
        System.out.println("Deducciones: " + deducciones);
    }
}