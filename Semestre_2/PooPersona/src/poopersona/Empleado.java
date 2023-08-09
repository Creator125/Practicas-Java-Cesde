package poopersona;

public class Empleado extends Persona{
    private int sueldo_bruto;

    public Empleado() {
    }

    public Empleado(int sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }

    public Empleado(int sueldo_bruto, String nombre, int edad) {
        super(nombre, edad);
        this.sueldo_bruto = sueldo_bruto;
    }

    public int getSueldo_bruto() {
        return sueldo_bruto;
    }

    public void setSueldo_bruto(int sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }
    
    
    @Override
    public void mostrar(){
        
    };
    
    public void calculaSalarioNeto(){
        
    };
}
