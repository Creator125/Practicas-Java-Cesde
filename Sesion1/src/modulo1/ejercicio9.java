/*
10. Resolver:

    a. 9 * (4 – 7 / 5) mod 3 > 8 div (4 – 9)

    b. 10+ (24 – 31) ^ 2 > (3 * 4 + 9 - 3 ) < (2 – 1)
 */
package modulo1;

public class ejercicio9 {
    public static void main(String[] args) {
        boolean a,b,o;
        a = 9 * (4 - 7 / 5) % 3 > 8 / (4 - 9);
        
        //Resolviendo "b. 10+ (24 – 31) ^ 2 > (3 * 4 + 9 - 3 ) < (2 – 1)"
        //JAVA NO PUEDE COMPARAR BOOLEAN CON INT
        o = (10 + (24 - 31)^2) > (3 * 4 + 9 - 3 );
        int n;
        n = o ? 1 : 0; //Covirtiendo en boolean a int
        b = n < (2 - 1);
        
        //Resultados
        System.out.print("a. "+ a +"\n"); //item a
        System.out.print("b. "+ b +"\n"); //item b
    }
}
