/*
9. Resolver los siguientes ejercicios mostrando detalladamente la solución teniendo en cuenta la precedencia de los operadores matemáticos.

    a. 7 * 8 * (160 mod 3 ^ 3) div 5 * 13 - 28

    b. 6 + 3 * (4 / 2 – 6 + 4 ) / 2 mod 4

    c. 4 * (8 - 3 * 2) + (5 / 3 * 2) * 3.0

    d. (5 + 3 * 2 / 6 − 4 ) * (4 /2 − 3 + 6) / (7 − 8 / 2 − 2) ^ 2

    e. 6 * ( -3 * ( 8 + 6 – 9 ) + 6 ) + 4 * ( -8 * ( 1 + 3 – 6 ) + 1 )
 */
package modulo1;

public class ejercicio8 {
    public static void main(String[] args) {
        System.out.print("a. "+(7 * 8 * (160 % 3^3) / 5 * 13 - 28) +"\n"); //item a
        System.out.print("b. "+(6 + 3 * (4 / 2 - 6 + 4 ) / 2 % 4) +"\n"); //item b
        System.out.print("c. "+(4 * (8 - 3 * 2) + (5 / 3 * 2) * 3.0) +"\n"); //item c
        System.out.print("d. "+((5 + 3 * 2 / 6 - 4 ) * (4 / 2 - 3 + 6) / (7 - 8 / 2 - 2)^2) +"\n"); //item d
        System.out.print("e. "+(6 * (-3 * (8 + 6 - 9) + 6) + 4 * (-8 * (1 + 3 - 6) + 1)) +"\n"); //item e
        
    }
}
