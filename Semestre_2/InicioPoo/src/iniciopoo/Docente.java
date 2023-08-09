package iniciopoo;

public class Docente extends Persona{
    private int canthoras;

    public Docente() {
    }
    
    public Docente(int conthoras, String indentidad, String nombre, boolean status, int salario) {
        super(indentidad, nombre, status, salario);
        this.canthoras = conthoras;
    }

    public int getCanthoras() {
        return canthoras;
    }

    public void setCanthoras(int canthoras) {
        this.canthoras = canthoras;
    }
    
    public void pagarBono(String ident, int valor){
        System.out.println("El valor del bono es: "+ valor);
    }
}
