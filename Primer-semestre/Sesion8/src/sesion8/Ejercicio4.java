/*
4.Construya un algoritmo que permita calcular lo que hay que pagarle a un 
trabajador teniendo en cuenta su sueldo y las horas extras trabajadas. 
Para el pago de horas extras se toma en cuenta la categoría del trabajador.

CATEGORIA |  PRECIO HORA EXTRA
1         |  10000
2         |  13800
3         |  15000
4         |  17000
 */
package sesion8;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        double sueldo, precio_horas=0 ,pago_total;
        int horas_extras;
        
        //Sueldo
        System.out.println("Ingrese el sueldo");
        Scanner dato1 = new Scanner(System.in);
        sueldo = dato1.nextDouble();
        
        //Horas extras
        System.out.println("Ingrese las horas extras");
        Scanner dato2 = new Scanner(System.in);
        horas_extras = dato2.nextInt();
        
        switch(horas_extras){
            case 1: precio_horas = 10000; break;
            case 2: precio_horas = 13800; break;
            case 3: precio_horas = 15000; break;
            case 4: precio_horas = 17000; break;
        }
        
        pago_total = sueldo + precio_horas;
        
        System.out.println("Al empleado al que pagarle: " + pago_total);
    }
}
