/*
Crear una app para listar los N primeros numeros de la serie fibonacci
(0,1,1,2,3,5,8,13,21,34,55,89)
 */
package repasojava;

public class RepasoJava {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int n = 6;
        int suma = 0;
        
        
        System.out.print(num1+" , "+num2);
        
        /*
        for(int i = 3; i <= n; i++){
            suma = num1 + num2;
            System.out.print(" , "+suma);
            num1 = num2;
            num2 = suma;
        }
        */
        
        int i = 2;
        
        /*
        while(i < n){
            suma = num1 + num2;
            System.out.print(" , "+suma);
            num1 = num2;
            num2 = suma;
            
            i++;
        }
        */
        
        do{
          suma = num1 + num2;
            System.out.print(" , "+suma);
            num1 = num2;
            num2 = suma;
            
            i++;
        }while(i < n);
        
        System.out.print("\n");
        
        String cargo = "Gerente";
        double salario = 0;
        
        switch (cargo) {
            case "Gerente":
                salario = 4500;
                break;
            case "Director":
                salario = 4900;
                break;
            case "Asistente":
                salario = 2000;
                break;
            case "Doctor":
                salario = 50000;
                break;
            case "Desarrollador":
                salario = 60000;
                break;
            default:
                salario = 0;
        }
        
        //Operador condicioinal (remario)
        boolean sexo = true;
        
        System.out.println(sexo ? "Femenino" : "Masculino");
        System.out.println(sexo && salario < 2200 ? "Guatape" : "Cancun");
    }
    
}
