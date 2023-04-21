package iniciopoo;

public class Persona {
    //Atributos
    private String indent;
    private String nombre;
    private boolean status;
    private int salario;

    public Persona() {
    }

    public Persona(String indentidad, String nombre, boolean status, int salario) {
        this.indent = indentidad;
        this.nombre = nombre;
        this.status = status;
        this.salario = salario;
    }

    public String getIndent() {
        return indent;
    }

    public void setIndent(String indent) {
        this.indent = indent;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    private double retencionFrente(int salario){ //Encasulamiento
        return salario * 0.1;
    }
    
    public void contratar(String ident, int salario){
        double mretencion = 0;
        if(salario > 4000000){
            mretencion = retencionFrente(salario);
        }
        
        System.out.println("Rentecion: "+ mretencion);
    }
    
    public double pagar(String ident, String fechaPago, int salario){
        int mrentecion = salario + 100000;
        return mrentecion;
    }
}
