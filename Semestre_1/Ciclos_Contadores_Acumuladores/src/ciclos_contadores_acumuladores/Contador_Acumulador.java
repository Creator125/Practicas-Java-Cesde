package ciclos_contadores_acumuladores;

/*
Contar y acumular
*/
public class Contador_Acumulador {
    public static void main(String[] args) {
        int num = 0,suma = 0;
        
        while(num <= 5){
            num = num + 1;
            suma = suma + num;
        }
        
        System.out.println("La suma de los primeros 5 numeros: " + suma);
    }
}
