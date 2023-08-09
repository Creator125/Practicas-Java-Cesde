package clasesabstractas_interfaces;

public class Resta extends Operacion{

    public Resta() {
    }
    
    public Resta(int valor1, int valor2){
        super resultado (valor1, valor2);
    }
    
    public void operar(){
        int resultado = valor1 - valor2;
        System.out.println("Resta: "+ resultado);
    }
    
    
    public void operar(int num1, int num2){
        int resultado = num1 - num2;
        System.out.println("Resta de 2 numeros: "+ resultado);
    }
}
