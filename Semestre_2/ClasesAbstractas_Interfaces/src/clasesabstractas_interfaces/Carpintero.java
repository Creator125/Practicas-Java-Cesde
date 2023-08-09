package clasesabstractas_interfaces;
public class Carpintero  extends Persona implements InEmpreado{

    public Carpintero() {
    }

    public Carpintero(String mombreCom, int salario) {
        super(mombreCom, salario);
    }
    
    @Override
    public void trabajar(){
        System.out.println("El carpintero está trabajando");
    }
    
    public void trabajar(String tipotrabajo){
        System.out.println("El carpintero está trabajando: "+ tipotrabajo);
    }
    
    public void trabajar(String tipotrabajo, int presupuesto){
        if(presupuesto < 2000000){
            System.out.println("Como "+ tipotrabajo +" tiene un presupuesto alto");
        }else{
            System.out.println("Como "+ tipotrabajo +" tiene un presupuesto bajo");
        }
    }
    
    public int pagar(int salario){
        int valor = 0;
        
        if(salario < 2000000){
            valor = 1000000;
        }
        
        return valor;
    }
    
    public  int pagar(String novedad, int valor){
        int bono = 0;
            
        if(novedad.equals("Liquidacion")){
             bono = 1200000;  
        }
        
        return bono;
    }
}