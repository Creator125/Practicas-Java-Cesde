package interfazfigura;

public class Rectangulo implements iFigura{
    private double largo;
    private double ancho;

    public Rectangulo() {
    }

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    
    public double Largo(){
        double num = 0;
        getLargo();
        setLargo(num);
        
        return num;
    }
    
    public double Ancho(){
        double num = 0;
        getAncho();
        setAncho(num);
        
        return num;
    }
    
    @Override
    public double CalcularArea(){
        return 0;
    }
    
    @Override
    public double CalcularPerimetro(){
        return 0;
    }
}
