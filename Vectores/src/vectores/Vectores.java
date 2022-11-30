package vectores;
import java.util.Scanner;

public class Vectores {
    public static void main(String[] args) {
        /*
        int[] vector1 = {10, 8, 6, 4, 2};
        String vector2[] = {"Crintian", "Yohana", "Julio"};
        int[] vector3 = {};
        int[] vector4 = new int[5];
        int alumnos = 10;
        float[] notas = new float[alumnos];
        int notas1;
        
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de notas");
        notas1 = dato.nextInt();
        
        double[] vector4 = new double[notas1];
        */
        
        int[] vector = {10, 8, 6, 4, 2};
        int i, suma=0,suma1=0, acumulador=0;
        
        for(i=0; i<=4; i++){
            System.out.println(vector[i]);
            
            acumulador = acumulador + vector[i];
            System.out.println("Acumulador" + acumulador);
            
            suma1 = acumulador + suma1;
            System.out.println("Suma  con acumulador: " + suma1);
            
            suma = vector[i] + vector[i + 1];
            System.out.println("Suma de la posicion: " + suma);
        }
    }
    
}
