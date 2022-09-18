/*
1. Un hombre desea saber cuánto dinero se genera por concepto de intereses 
sobre la cantidad que tiene en inversión en el banco. El decidirá reinvertir los
intereses siempre y cuando estos excedan a $7000, y en ese caso desea saber 
cuánto dinero tendrá finalmente en su cuenta.
 */
package sesion6;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
       int cant_invertida, tiempo_inversion;
       double porcentaje_intereses;
       
       
       Scanner valor1 = new Scanner(System.in);
       System.out.println("Ingrese la cantidad invertida");
       System.out.print("$");
       cant_invertida = valor1.nextInt();
       
       Scanner valor2 = new Scanner(System.in);
       System.out.println("Ingrese el porcentaje de intereses");
       porcentaje_intereses = valor2.nextInt();
       porcentaje_intereses = porcentaje_intereses / 100; //Conversion a porsentaje
    
       Scanner valor3 = new Scanner(System.in);
       System.out.println("Ingrese el tiempo de inversion");
       tiempo_inversion = valor3.nextInt();
       
       double valor_intereses = (cant_invertida * porcentaje_intereses) / 60;
       double inversion_total = valor_intereses * tiempo_inversion;
       
       if(valor_intereses >= 700){
           System.out.println("Puedes reinvertir los intereses");
           System.out.println("El valor que finalmente tendrá en su cuenta es " + valor_intereses);
           System.out.print("Inversion total: " + inversion_total);
           
       }else{
           System.out.println("No es recomendable reinvertir");
           System.out.println("El valor que finalmente tendra en su cuenta es " + valor_intereses);
           System.out.print("Inversion total: " + inversion_total);
       }
    }
}