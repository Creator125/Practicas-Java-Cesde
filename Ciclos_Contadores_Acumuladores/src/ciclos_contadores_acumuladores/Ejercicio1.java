/*
Hacer un algoritmo que encuentre para cada estudiante el número de créditos 
cursados y el promedio crédito.
 */
package ciclos_contadores_acumuladores;


import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String args[]){
         int nume = 1; //contador estudiantes
         int ne = 0;   //numerom de estudiantes
         String cod=" "; //codigo estudiante
         double n1, n2,n3, n4; //notas de las materias
         double nc1, nc2, nc3, nc4; //numero de creditos de las materias
         double ncc; // numero de creditos cursados
         double pc; //promedio de creditos
         
         Scanner dato = new Scanner(System.in);
         System.out.println("Digite la cantidad de estudiantes");
         ne = dato.nextInt();
         
         while (nume<=ne){
             System.out.println("Digite el codigo del estudiante");
             cod = dato.next();
             System.out.println("Digite nota de la amteria 1");
             n1 = dato.nextDouble();
             System.out.println("Digite nota de la amteria 2");
             n2 = dato.nextDouble();
             System.out.println("Digite nota de la amteria 3");
             n3 = dato.nextDouble();
             System.out.println("Digite nota de la amteria 4");
             n4 = dato.nextDouble();
             System.out.println("Digite creditos de la amteria 1");
             nc1 = dato.nextDouble();
             System.out.println("Digite creditos de la amteria 2");
             nc2 = dato.nextDouble();
             System.out.println("Digite creditos de la amteria 3");
             nc3 = dato.nextDouble();
             System.out.println("Digite creditos de la amteria 4");
             nc4 = dato.nextDouble();
             ncc = nc1 + nc2 + nc3 + nc4;
             pc = (((n1*nc1)+(n2*nc2)+ (n3*nc3)+(n4*nc4))/ncc);
             System.out.println("El estudiante con codigo"+" "+cod+" "+"curso"+ " "+ncc+" "+
                     "creditos y su promedio fue"+" "+pc);
             nume = nume + 1;
         }
    }
         
}

