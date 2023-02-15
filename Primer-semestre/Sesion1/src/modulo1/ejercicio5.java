/*
6. Teniendo en cuenta los valores de las variables a = 10 b = 12 c = 13 d =10 
que corresponden a la cantidad de artículos adquiridos por un usuario, al 
resolver la siguiente expresión: not (a=c) y (c>b) Podemos afirmar que da como resultado:
 */
package modulo1;

public class ejercicio5 {
    public static void main(String[] args) {
        int a,b,c,d; //Las constantes
        a = 10;
        b = 12;
        c = 13;
        d = 10;
        
        //Resolviendo la expresion para ver el resultado
        System.out.print((!(a == c) && (c > b)) +"\n");
    }
}
