package interfazfigura;

public class TrianguloEquilatero implements iFigura{
    private double lado;

    public TrianguloEquilatero() {
    }

    public TrianguloEquilatero(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    public double Lado(){
        double num = 0;
        getLado();
        setLado(num);
        
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
