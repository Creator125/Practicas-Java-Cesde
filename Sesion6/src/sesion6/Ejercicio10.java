/*
10. Escriba el nombre y la edad de una persona, si esta es mayor de edad, 
mujer y casada. Si es hombre y soltero, escriba sólo el nombre. Si no cumple 
alguno de los requisitos, escribir un mensaje "No cumple con lo pedido".
 */
package sesion6;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        String nombre, genero, estado_civil;
        int edad;
        
        //Nombre
        System.out.println("Ingrese el nombre");
        Scanner valor1 = new Scanner(System.in);
        nombre = valor1.nextLine();
        
        //Edad
        System.out.println("Ingrese la edad");
        Scanner valor2 = new Scanner(System.in);
        edad = valor2.nextInt();
        
        //Genero
        System.out.println("Ingrese el genero");
        Scanner valor3 = new Scanner(System.in);
        genero = valor3.nextLine();
        
        //Estado civil
        System.out.println("Ingrese el estado civil");
        Scanner valor4 = new Scanner(System.in);
        estado_civil = valor4.nextLine();
        
        
        if(edad >= 18 && genero.equals("femenino") && estado_civil.equals("cazada")){
            System.out.println("Datos del ususario:");
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
        }else if(genero.equals("masculino") && estado_civil.equals("soltero")){
            System.out.println("Datos del ususario:");
            System.out.println("Nombre: " + nombre);
        }else{
            System.out.println("\nNo cumpre con lo pedido");
        }
    }
}
