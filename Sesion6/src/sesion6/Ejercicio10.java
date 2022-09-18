/*
10. Escriba el nombre y la edad de una persona, si esta es mayor de edad, 
mujer y casada. Si es hombre y soltero, escriba sólo el nombre. Si no cumple 
alguno de los requisitos, escribir un mensaje "No cumple con lo pedido".
 */
package sesion6;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        String nombre;
        int edad;
        
        //Nombre
        System.out.println("Ingrese el nombre");
        Scanner valor1 = new Scanner(System.in);
        nombre = valor1.nextLine();
        
        //Edad
        System.out.println("Ingrese la edad");
        Scanner valor2 = new Scanner(System.in);
        edad = valor2.nextInt();
        
        
        if(edad >= 18){
            String estado;
            String estado_c = "cazado";
            
            //Estado civil
            System.out.println("Ingrese el estado civil");
            Scanner valor3 = new Scanner(System.in);
            estado = valor3.nextLine();
            
            if(estado.equals(estado_c)){
                String nombre2;
                
                //Nombre de la mujer
                System.out.println("Ingrese el nombre de la pareja (Mujer)");
                Scanner valor4 = new Scanner(System.in);
                nombre2 = valor4.nextLine();
                
                System.out.println("\nNombre del usuario: " + nombre);
                System.out.println("Nombre de la pareja: " + nombre2);
            }else{
                System.out.println("\nNombre del usuario: " + nombre);
            }
        }else{
            System.out.println("\nNo cumpre con lo pedido");
        }
    }
}
