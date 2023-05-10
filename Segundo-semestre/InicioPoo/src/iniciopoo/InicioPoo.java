/*
Tema: Progamación Orientada a Objetos (POO)
*/
package iniciopoo;

public class InicioPoo {
    public static void main(String[] args) {
        /*
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
        */
        
        //Instanciar el docente
        Docente docente1 = new Docente();
        docente1.setIndent("12");
        docente1.setNombre("Tatiana Maria ortega");
        docente1.setStatus(true);
        docente1.setSalario(2300000);
        docente1.setCanthoras(40);
        
        System.out.println("El nombre del docente1 es: "+ docente1.getNombre());
        
        System.out.println("Valor a pagar: "+ docente1.pagar(docente1.getIndent(), "02/04/2023", docente1.getSalario()));
        
        docente1.contratar(docente1.getIndent(), docente1.getSalario());
        docente1.pagarBono("34", 78000);
        
        //Creando un nuevo docente
        Docente docente2 = new Docente(45, "38", "Pablo Andres", false, 680000);
        
        
        
    }
    
}
