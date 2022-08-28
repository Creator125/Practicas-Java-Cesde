/*
10. Resolver:

    a. 9 * (4 – 7 / 5) mod 3 > 8 div (4 – 9)

    b. 10+ (24 – 31) ^ 2 > (3 * 4 + 9 - 3 ) < (2 – 1)
 */
package modulo1;

public class ejercicio9 {
    public static void main(String[] args) {
        boolean a,b;
        a = 9 * (4 - 7 / 5) % 3 > 8 / (4 - 9);
        b = 10 + (24 - 31)^2 > (3 * 4 + 9 - 3 ) < (2 - 1);
        
        System.out.print("a. "+ a +"\n"); //item a
        System.out.print("b. "+ b +"\n"); //item b
    }
}
