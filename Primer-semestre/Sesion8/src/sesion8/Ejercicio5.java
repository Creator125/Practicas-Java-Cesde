/*
5.Realice un algoritmo que simule una calculadora, de tal forma que:

a.Si el usuario ingresa 1, se sumarán dos números ingresados por el usuario

b.Si el usuario ingresa 2, se restarán dos números ingresados por el usuario

c.Si el usuario ingresa 3, se multiplicarán dos números ingresados por el usuario

d.Si el usuario ingresa 5, se dividirá dos números ingresados por el usuario. 
Debe asegurarse que el segundo numero sea diferente de cero, ya que la división 
por cero no está permitida

e.Si ingresa 6, realizará una potencia, donde el segundo numero será el exponente.

Mostrar el resultado de las operaciones según la opción escogida
 */
package sesion8;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int num1,num2,resultado,opcion;
        
        System.out.println("Ingrese dos numeros");
        
        //num1
        Scanner dato1 = new Scanner(System.in);
        num1 = dato1.nextInt();
        
        //num2
        Scanner dato2 = new Scanner(System.in);
        num2 = dato2.nextInt();
        
        //Opcion
        System.out.println("Imgrese una opcion");
        System.out.println("(1) Sumar");
        System.out.println("(2) Restar");
        System.out.println("(3) Multiplicar");
        System.out.println("(5) Dividir");
        System.out.println("(6) Potencia");
        Scanner dato3 = new Scanner(System.in);
        opcion = dato3.nextInt();
        
        switch (opcion) {
            case 1: //Suma
                resultado = num1 + num2;
                break;
                
            case 2: //Resta
                resultado = num1 - num2;
                break;
                
            case 3: //Multiplicación
                resultado = num1 * num2;
                break;
                
            case 5: //División
                if(num2 == 0){
                    System.out.println("El segundo numero debe se diferente de 0");
                    resultado = 0;
                }else{
                    resultado = num1 / num2;
                }
                break;
                
            case 6: //Potenciación
                resultado = num1 ^ num2;
                break;
                
            default:
                System.out.println("Opcion incorrecta");
                resultado = 0;
        }
        
        System.out.println("\n => " + resultado);
    }
}
