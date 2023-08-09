/*
Tema: Clases Abstactas y Interfaces
*/
package clasesabstractas_interfaces;

public class ClasesAbstractas_Interfaces {

    public static void main(String[] args) {
        // Trabajando con clases abstractas
        //Operacion operar1 = new Operacion(); //Genera error porque Opercion es una clase abstracta
        /*
        Suma sum1 = new Suma(23, 4);
        
        System.out.println("Valor de 1: "+ sum1.getValor1());
        
        sum1.operar();
        sum1.operar(45);
        sum1.operar(12, 45, 54);
        System.out.println("Valor de sum1: "+ sum1.getValor2());
        
        Resta res1 = new Resta();
        res1.setValor1(45);
        res1.setValor2(55);
        res1.operar();
        res1.operar(res1.getValor1(), res1.getValor2());
        */
        Carpintero carp1 = new Carpintero("Juan Arboleda", 3400000);
        System.out.println("El nombre del carpintero 1:"+ carp1.getMombreCom());
        System.out.println("El salario del carpimtero es: "+ carp1.getSalario());
        carp1.trabajar();
        carp1.trabajar("Indstalador de puertas");
        carp1.trabajar("Ebanista", 2000000);
        System.out.println(carp1.pagar());
        System.out.println(carp1.getSalario());
        System.out.println(carp1.pagar("Liquidacion", 2000000));
    }
    
}
