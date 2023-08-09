package pooinmuebles;

public class Inmueble {
    private String codigo;
    private String direccion;
    private String telefono;

    public Inmueble() {
    }

    public Inmueble(String codigo, String direccion, String telefono) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void radicar(String codigo){
        
    }
    
    public void arrendar(String codigo){
        
    }
    
    
    
}
