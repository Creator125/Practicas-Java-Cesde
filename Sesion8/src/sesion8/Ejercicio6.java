/*
6.Una empresa de telecomunicaciones ofrece servicio de llamadas internacionales,
el costo de la llamada depende del lugar de destino. En la siguiente tabla se 
presenta el costo por minuto para las llamadas originadas desde Medellín Colombia.

Clave   Zona            Precio
------------------------------
1       Camerun         750
2       Estados Unidos  450
5       Argentina       370
6       Canada          560
7       Mexico          480
9       Europa          890
10      Asia            930
15      Africa          920
20      Oceania         1030

Realice un algoritmo que le permita calcular e imprimir el costo total de una 
llamada telefónica, considerando la duración y que el origen siempre es desde 
Medellín Colombia.
*/
package sesion8;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int clave,duracion,costo=0;
        
        //Clave
        System.out.println("Ingrese la clave del destino a llamar");
        System.out.println("(1) Camerun");
        System.out.println("(2) Estados Unidos");
        System.out.println("(5) Argentina");
        System.out.println("(6) Canada");
        System.out.println("(7) Mexico");
        System.out.println("(9) Europa");
        System.out.println("(10) Asia");
        System.out.println("(15) Africa");
        System.out.println("(20) Oceania");
        Scanner dato1 = new Scanner(System.in);
        clave = dato1.nextInt();
        
        //Duración
        System.out.println("Ingrese la duracion de la llamada");
        Scanner dato2 = new Scanner(System.in);
        duracion = dato2.nextInt();
        
        switch (clave) {
            case 1: costo = 750 * duracion; break; // Costo para Camerun
            case 2: costo = 450 * duracion; break; // Costo para Estados Unidos
            case 5: costo = 370 * duracion; break; // Costo para Argentina
            case 6: costo = 560 * duracion; break; // Costo para Canada
            case 7: costo = 480 * duracion; break; // Costo para Mexico
            case 9: costo = 90 * duracion; break; // Costo para Europa
            case 10: costo = 750 * duracion; break; // Costo para Asia
            case 15: costo = 750 * duracion; break; // Costo para 
            default:
                throw new AssertionError();
        }
    }
}
