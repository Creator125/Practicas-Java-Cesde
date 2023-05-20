package interfazfigura;

public class Circunferencia implements iFigura{
    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double Radio(){
        double num = 0;
        getRadio();
        setRadio(num);
        
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
