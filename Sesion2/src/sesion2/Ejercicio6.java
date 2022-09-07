/*
Escribir el algoritmo de Newton-Raphson para encontrar una raíz de una función 
concreta. Este método parte de una estimación inicial de la raíz, x0, y va 
calculado aproximaciones sucesivas al valor de la misma utilizando la fórmula: xi+1=xi-f(xi)/f'(xi
 */
package sesion2;
import java.util.Scanner;
import java.math.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        int i=0,x0,x1,fx,err=0,i_max;
        
        System.out.println("Ingrese el valor inicial"); //
        Scanner valor1 = new Scanner(System.in);
        x0 = valor1.nextInt();
        
        System.out.println("Ingrese el error sugerido o la tolerancia");
        Scanner valor2 = new Scanner(System.in);
        x1 = valor2.nextInt();
        
        System.out.println("Ingrese el numero maximo de iteraciones");
        Scanner valor3 = new Scanner(System.in);
        i_max = valor3.nextInt();
        
        //Iniciando la ecuacion
        while(i < i_max){
            fx = x1^2 - 2 + x1 + 1;
            int deri_f = 2 * x1 - 2; //Derivado de f
            int xn = x1 - fx / deri_f;
            err = Math.abs((xn - x1) / xn);
            i++;
        }
        
        if(i <= err){
            System.out.println("La raíz aproximada es: "+x1);
        }else{
            System.out.println("No hay convergencia");
            System.out.println(">El valor alcanzado fue es: "+x1);
        }
    }
}
