/*
Si el valor interno de la variable A = 4, el de B = 5, de C = 1, L = V (Verdadero). 
Muestre cuales son los valores impresos en el siguiente algoritmo.

INICIO

    X = B *A –B^2/4 * C

    Y = A*B/3 ^2

    Z= (((B+C)/A+10)*3*B)-6

    ESCRIBA: X, Y, Z

    TERMINE
 */
package modulo1;

public class ejercicio1 {
    public static void main(String[] args) {
        int a,b,c; //Las constantes
        a = 4;
        b = 5;
        c = 1;
        
        int x,y,z; //Las ecuaciones
        x = b * a - b^2 / 4 * c;
        y = a * b / 3^2;
        z = (((b+c) / a + 10) * 3 * b) - c;
        
        //Resultados
        System.out.print("Resultados: \n");
        System.out.print("Valor de X: "+x+"\n");
        System.out.print("Valor de Y: "+y+"\n");
        System.out.print("Valor de Z: "+z+"\n");
    }
}
