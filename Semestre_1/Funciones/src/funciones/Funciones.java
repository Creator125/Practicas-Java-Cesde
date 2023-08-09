/*
Tema funciones
 */
package funciones;

public class Funciones {
    /*
    static void saludar(){ //Funcion que imprime un saludo
        System.out.println("Hola a todos");
    }
    */
    
    /*
    static void mostrarNumero(int numero){ // Reciben datos y no devuelven nada 
        System.out.println("El numero ingresado es " + numero);
    }
    */
    
    static int mostrarNumero(int numero1){ //Reciben datos y devuelven datos 
        int resultado;
        int numero2 = 0;
        resultado = numero2 + numero1;
        
        return resultado;
    }

    public static void main(String[] args) { //Funcion principal
       // saludar();
       
       int num1 = 230, num2 = 49;
       
        System.out.println("El resultado es "+ mostrarNumero(num1 + num2));
    }
    
}
