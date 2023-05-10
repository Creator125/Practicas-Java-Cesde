/*
19. Se tienen el área y el valor del metro cuadrado de una propiedad y la 
forma de pago de la cuota inicial. Se pide calcular el precio de venta y el 
valor de la cuota inicial (20% del valor de la propiedad). Si la forma de pago 
es = 1 el recibe un descuento del 10% sobre la cuota inicial, y si forma de pago
es = 2 se le recarga un 8% sobre su valor. Mostrar el valor de la propiedad y el
valor a pagar de la cuota inicial (solo hay 2 formas de pago).
 */
package sesion7;
import java.util.Scanner;


public class Ejercicio19 {
    public static void main(String[] args) {
        int forma_pago;
        double area, valor_metro, precio_venta, cuota_inicial;
       
        System.out.println("Ingrese el area y el valor del metro cuadrado de la propiedad");
        
        //Area
        System.out.print("Area: ");
        Scanner valor1 = new Scanner(System.in);
        area = valor1.nextDouble();
        
        ////Valor del metro
        System.out.print("Metro: ");
        Scanner valor2 = new Scanner(System.in);
        valor_metro = valor2.nextDouble();
        
        //Forma de pago
        System.out.println("\nIngrese la forma de pago (1 o 2)");
        Scanner valor3 = new Scanner(System.in);
        forma_pago = valor3.nextInt();
        
        
        precio_venta = area * valor_metro;
        
        if(forma_pago == 1){
            cuota_inicial = precio_venta * 0.20 - precio_venta * 0.20 * 0.10;
            
            System.out.println("Precio de venta de la propidad: $" + precio_venta);
            System.out.println("Cuota inicial: $" + cuota_inicial);
        }else if(forma_pago == 2){
            cuota_inicial = precio_venta * 0.20 + precio_venta * 0.20 * 0.8;
            
            System.out.println("Precio de venta de la propidad: $" + precio_venta);
            System.out.println("Cuota inicial: $" + cuota_inicial);
        }else{
            System.out.println("Ingreso la forma de pago incorrecta.");
        }
    }
}
