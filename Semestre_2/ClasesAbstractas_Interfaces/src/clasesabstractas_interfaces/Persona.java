package clasesabstractas_interfaces;

public class Persona {
    protected String mombreCom;
    protected int salario;

    public Persona() {
    }

    public Persona(String mombreCom, int salario) {
        this.mombreCom = mombreCom;
        this.salario = salario;
    }

    public String getMombreCom() {
        return mombreCom;
    }

    public void setMombreCom(String mombreCom) {
        this.mombreCom = mombreCom;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    
}
