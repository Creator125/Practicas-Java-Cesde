package iniciojava;

public class InicioJava {

    public static void main(String[] args) {
        int num1 = (int) Math.random();
        int num2 = (int) Math.random();
        int num3 = (int) Math.random();
        
        if(num1 > num2 && num1 > num3){
            System.out.println("El mayor es num1 con el valor: " + num1);
        }else if(num2 > num1 && num2 > num3){
            System.out.println("El mayor es num2 con el valor: " + num2);
        }else{
            System.out.println("El mayor es num3 con el valor: " + num3);
        }
       
    }
    
}
