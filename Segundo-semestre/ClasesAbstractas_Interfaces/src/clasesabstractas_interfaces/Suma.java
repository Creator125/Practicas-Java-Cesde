
package clasesabstractas_interfaces;

public class Suma extends Operacion{
    private int resultado;

    public Suma(){
        
    }
    
    public Suma(int valor1, valor2){
        super(valor1, valor2);
    }
     
    public void operar(){
        this.resultado = valor1 + valor2;
        System.out.println("Suma: "+ this.resultado);
    }
    
    public void operar(int valorx){
        this.resultado = valor1 + valor2 + valorx;
        System.out.println("Suma de 3: "+ this.resultado);
    }
    
    public void operar(int valora, int valorb, int valorc){
        this.resultado = valor1 + valor2 + valorx;
        System.out.println("Suma de 3: "+ this.resultado);
    }
}
