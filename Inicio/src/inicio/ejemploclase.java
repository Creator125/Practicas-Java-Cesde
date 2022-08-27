package inicio;

public class ejemploclase {
    public static void main(String[] args) { 
        //Suma enteros
        int num1,num2,suma;
        num1 = 4;
        num2 = 5;
        suma = num1 +num2;
        
        //Suma de flotantes
        float numf1,numf2,sumaf;
        numf1 = 2.5f;
        numf2 = 6.9f;
        sumaf = numf1 + numf2;
        
        //Suma de flotantes largos
        double numd1,numd2,sumad;
        numd1= 6.5693;
        numd2 = 19.9463;
        sumad = numd1 + numd2;
        
        //Imprimiendo resultados
        System.out.print("La suma de enteros es: "+suma+"\n");
        System.out.print("La suma de flotantes es: "+sumaf+"\n");    
        System.out.print("La suma de flotantes largos es: "+sumad+"\n");  
    }
}