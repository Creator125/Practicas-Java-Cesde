/*
2.Haga un seguimiento del algoritmo y diga que valores se muestran en las 
variables P, R, S (utilice los valores definidos en el punto anterior)

INICIO

    P = A^2(1/2)^B

    R = A*B+A^(1/2)

    S= B*A-B^2/4*C

    ESCRIBA: P, R, S

    TERMINE
 */
package modulo1;

public class ejercicio2 {
    public static void main(String[] args) {
        int a,b,c; //Las constantes
        a = 4;
        b = 5;
        c = 1;
        
        int p,r,s; //Ecuaciones
        p = a^2 * (1 / 2)^b;
        r = a * b + a^(1 / 2);
        s = b * a - b^2 / 4 * c;
        
        //Resultados
        System.out.print("Resultados: \n");
        System.out.print("Valor de P= "+p+"\n");
        System.out.print("Valor de R= "+r+"\n");
        System.out.print("Valor de S= "+s+"\n");
    }
}
