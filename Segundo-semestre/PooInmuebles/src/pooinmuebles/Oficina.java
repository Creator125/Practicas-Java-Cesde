package pooinmuebles;

public class Oficina extends Inmueble {

    private int salaAsamblea;

    public Oficina() {
    }

    public Oficina(int salaAsamblea) {
        this.salaAsamblea = salaAsamblea;
    }

    public Oficina(int salaAsamblea, String codigo, String direccion, String telefono) {
        super(codigo, direccion, telefono);
        this.salaAsamblea = salaAsamblea;
    }

    public int getSalaAsamblea() {
        return salaAsamblea;
    }

    public void setSalaAsamblea(int salaAsamblea) {
        this.salaAsamblea = salaAsamblea;
    }
    
    public void instalarInternet(){
        
    }
}
