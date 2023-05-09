/*
Desarrolle un programa escrito en lenguaje JAVA en el que se solicite el peso y 
la estatura de una persona e indique la clasificación de su peso de acuerdo al 
IMC (Indice de Masa Corporal).
 */
package examen_temas_1;
import java.util.Scanner;
import java.math.*;
import java.util.Locale;

public class Ejercicio1 {
     public static void main(String[] args) {
        double peso, estatura, resultado;
        
        //Entrada para ingresar el 'peso'
        System.out.println("Ingrese el peso");
        Scanner dato = new Scanner(System.in).useLocale(Locale.US);
        peso = dato.nextDouble();
        
        //Entrada para ingresar la 'estatura'
        System.out.println("Ingrese la estatura");
        Scanner dato2 = new Scanner(System.in).useLocale(Locale.US);
        estatura = dato2.nextDouble();
        
        resultado = peso / Math.sqrt(estatura); //Hallando el IMC
        
        //Determinado el peso segun la clasificación
        if(resultado < 18.5){
            System.out.println("Tu peso es menor al normal");
        }else if(resultado == 18.5 && resultado <= 24.9){
            System.out.println("Tu peso es normal");
        }else if(resultado < 25.0 && resultado <= 29.9){
            System.out.println("Tu peso es superior al normal");
        }else{ //Mas de 30.0
            System.out.println("Sufres de obesidad");
        }
        
        System.out.println("Peso total: " + resultado);
    }
}