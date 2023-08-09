package pooinmuebles;

public class Casa extends Inmueble{
    private int nohabitaciones;

    public Casa() {
    }

    public Casa(int nohabitaciones) {
        this.nohabitaciones = nohabitaciones;
    }

    public Casa(int nohabitaciones, String codigo, String direccion, String telefono) {
        super(codigo, direccion, telefono);
        this.nohabitaciones = nohabitaciones;
    }

    public int getNohabitaciones() {
        return nohabitaciones;
    }

    public void setNohabitaciones(int nohabitaciones) {
        this.nohabitaciones = nohabitaciones;
    }
    
    public void repararJardin(){
        
    }
}
