package poopersona;

public class Cliente extends Persona{
    private String nombreEmpresa;
    private String telefonoEmpresa;

    public Cliente() {
    }

    public Cliente(String nombreEmpresa, String telefonoEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public Cliente(String nombreEmpresa, String telefonoEmpresa, String nombre, int edad) {
        super(nombre, edad);
        this.nombreEmpresa = nombreEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }
    
    @Override
    public void mostrar(){
        
    };
}
