/*
4. Si A = 6, B = 5, C = 4 y D = 2; responde verdadero o falso en cada caso

    a. ((A > B) OR (A < C)) AND ((A = C) OR (A >= B))

    b. ((A >= B) OR (A < D)) AND ((A >= D) AND (C > D))

    c. NOT (A = C) AND (C > B)
 */
package modulo1;

public class ejercicio4 {
    public static void main(String[] args) {
        int A,B,C,D; //Contantes
        A = 6;
        B = 5;
        C = 4;
        D = 2;
        
        boolean a,b,c; //items
        a = ((A > B) || (A < C)) && ((A == C) || (A >= B));
        b = ((A >= B) || (A < D)) && ((A >= D) && (C > D));
        c = !(A == C) && (C > B);
        
        System.out.print("Resultados: \n");
        System.out.print("Valor de item a: "+a+"\n");
        System.out.print("Valor de item b: "+b+"\n");
        System.out.print("Valor de item c: "+c+"\n");
    }
}
