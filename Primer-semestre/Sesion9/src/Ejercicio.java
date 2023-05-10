/*
Una estación climática proporciona un par de temperaturas diarias 
(Máxima, mínima – no es posible que alguna o ambas temperaturas sean 0 grados). 
La pareja fin de temperaturas es 0, 0. Elabore un algoritmo para determinar el 
número de días, cuyas temperaturas se han proporcionado, las medidas máximas y 
mínima, el número de errores (temperaturas de 0 grados) y el porcentaje que representan 
 */
import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
       int temp_maxima, temp_minima, dias=0, errores=0;
       double porc_errores,porc_dias;
       
       do{
           dias++;
           
           
           System.out.println("\nIngrese las temperaturas del día "+ dias);
           //Entrada para la Temperatura minima
           Scanner dato1 = new Scanner(System.in);
           System.out.print("Tempratura minima: ");
           temp_minima = dato1.nextInt();
           //Entrada para la Temperatura maxima
           Scanner dato2 = new Scanner(System.in);
           System.out.print("Tempratura maxima: ");
           temp_maxima = dato2.nextInt();
           
           if(temp_minima == 0 || temp_maxima == 0){
               errores++;
           }
       }while(temp_minima != 0 && temp_maxima != 0);
           

        System.out.println("Días con temperaturas proporcionadas: "+ dias);
        System.out.println("Errores (temperaturas de 0 grados): "+ errores);
        
        porc_errores = (errores /( errores + dias))*100;
        porc_dias = (dias /( errores + dias))*100;
        
        System.out.println("Porcentage de errores: "+ porc_errores);
        System.out.println("Porcentage de días con temperaturas proporcionadas : "+ porc_dias);
        
    }
}
