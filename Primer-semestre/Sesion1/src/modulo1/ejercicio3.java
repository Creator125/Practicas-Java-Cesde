/*
3. Utilizando los valores de A, B, C, y L, arriba mencionados, calcule el valor 
almacenado en las siguientes variables:

    a. X = (A>B) ˄ (⁓L) ˅ (X < 30)

    b. Y = (B <= 100) ˄ ⁓ (A > C) ˄ (C = 1)

    c. Z = (B = 5) ˅ (C = 30) ˄ ⁓L

    d. W = ((B + 20) > (C - 1)) ˅ ((A +5) < = 50) 
 */
package modulo1;

public class ejercicio3 {
    public static void main(String[] args) {
        int a,b,c; //Las constantes
        a = 4;
        b = 5;
        c = 1;
        boolean l = true;
        
        boolean y,z,w,x,x1; //Ecuaciones
        //a. X = (A>B) ˄ (⁓L) ˅ (X < 30)
        x1 = ((a > b) && (!l));
        int n = x1 ? 1 : 0; //Convirtiendo la x de (X < 30) an entero
        x = x1 || (n < 30);  //Concluyendo la ecuación
        
        y = (b <= 100) && !(a > c) && (c == 1);
        z = (c == 5) || (c == 30) && !l;
        w = ((b + 20) > (c - 1)) || ((a + 5) <= 50);
        
        //Resultados
        System.out.print("Resultados: \n");
        System.out.print("Valor de X= "+x+"\n");
        System.out.print("Valor de Y= "+y+"\n");
        System.out.print("Valor de Z= "+z+"\n");
        System.out.print("Valor de Y= "+w+"\n");
    }
}
