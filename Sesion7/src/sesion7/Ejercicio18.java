/*
18. Un cliente tiene una inversión en el banco. El decidirá reinvertir con los
intereses siempre y cuando estos excedan a $100.000, sino solo dejará el capital.
Desea saber cuánto dinero tendrá finalmente en su cuenta. Se lee el valor 
invertido (que debe ser máximo de $90.000) y la tasa de interés.
 */
package sesion7;
import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        double tasa, interes, cantidad,total;
        
        //Catidad
        System.out.println("Ingrese la cantidad invertida en el banco");
        Scanner valor1 = new Scanner(System.in);
        cantidad = valor1.nextDouble();
        
        //Tasa
        System.out.println("Ingrese la tasa de intereses");
        Scanner valor2 = new Scanner(System.in);
        tasa = valor2.nextDouble();
        
        
        interes = cantidad * tasa;
        
        if(cantidad <= 90000){
            if(interes > 100000){
                System.out.println("La cantidad generada por intereses es " + interes + ", supera los $100.000");
            }else{
                System.out.println("La cantidad generada por intereses es " + interes + ", no supera los $100.000");
            }

            total = cantidad + interes;

            System.out.println("El saldo generado en su cuenta es: " + total);
        }else{
            System.out.println("El valor invertido debe se maximo $90.000");
        }
    }
}
