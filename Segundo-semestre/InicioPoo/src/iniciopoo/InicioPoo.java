/*
Tema: Progamación Orientada a Objetos (POO)
*/
package iniciopoo;

public class InicioPoo {
    public static void main(String[] args) {
        Persona per1 = new Persona();
        per1.setIndent("10");
        per1.setNombre("Juan Manuel");
        per1.setSalario(3000000);
        per1.setStatus(true);
        per1.contratar(per1.getIndent(), per1.getSalario());
        double mretencion = per1.pagar(per1.getIndent(), "04/20/2023",per1.getSalario());
        
        System.out.println("Retecion: "+ mretencion);
        
        Persona per2 = new Persona("54", "Mariana Maria", false, 5000000);
        System.out.println("Nombre de la persona 2: "+ per2.getNombre());
        
    }
    
}
