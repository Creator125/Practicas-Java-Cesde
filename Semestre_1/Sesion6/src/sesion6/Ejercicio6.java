/*
6. Una agencia de alquiler de autos cobra la hora de uso del vehículo a un
valor determinado. Si el cliente usa el carro por más de 10 horas, le hacen un 
descuento del 20% por cada hora de más. Haga un programa que lea horas de uso, 
valor hora, y determine el total a pagar.
 */
package sesion6;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        double precio,precio_total;
        double horas,resta,horas_demas;
        
        //Precio de horas de uso del vehículo
        System.out.println("Ingrese el precio por hora");
        Scanner valor1 = new Scanner(System.in);
        precio = valor1.nextDouble();
        
        //Horas de uso del veículo
        System.out.println("Ingrese las horas de uso");
        Scanner valor2 = new Scanner(System.in);
        horas = valor2.nextDouble();
        
        
        if(horas > 10){
            resta = horas - 10;
            horas_demas =((resta * 20) * 20) / 100; 
            precio_total = (horas - precio) * horas_demas;
            System.out.println("Se realizó un descuento del 20%");
        }else{
            precio_total = precio * horas;
        }
        
        System.out.println("\nValor total a pagar: $" + precio_total);
    }
}