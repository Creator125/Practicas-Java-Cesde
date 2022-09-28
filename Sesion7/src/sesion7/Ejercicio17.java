/*
17. Se tiene un código, número de artículos vendidos y el valor de cada artículo. 
Calcule el valor de la compra, tiendo en cuenta lo siguiente: compra 50 o más 
artículos se le da al cliente 10% de descuento; si la compra es menor de 50 
artículos no se hace descuento. Mostrar el código, el total de la venta y el 
valor del descuento.
 */
package sesion7;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        int codigo;
        double articulos,valor,descuento,valor_final,total;
        
        //Codigo
        System.out.println("Ingrese el codigo del producto");
        Scanner valor0 = new Scanner(System.in);
        codigo = valor0.nextInt();
        
        //Catidad de articulos
        System.out.println("Ingrese la cantidad de articulos vendidos");
        Scanner valor1 = new Scanner(System.in);
        articulos = valor1.nextDouble();
        
        //Valor de la compra
        System.out.println("Ingrese el valor para cada aticulos");
        Scanner valor2 = new Scanner(System.in);
        valor = valor2.nextDouble();
        
        
        if(articulos >= 50){
            descuento = valor * 0.10;
            valor_final = valor - descuento;
            
            total = valor_final * articulos;
            
            System.out.println("\nSe realizó un descuento del 10% al cliente");
            System.out.println("Codigo del articulo: " + codigo);
            System.out.println("Valor total de la venta: $" + total);
            System.out.println("Valor del descuento: $" + valor_final);
        }else{
            total = valor * articulos;
            
            System.out.println("\nCodigo del articulo: " + codigo);
            System.out.println("Valor total de la venta: $" + total);
        }
    }
}
