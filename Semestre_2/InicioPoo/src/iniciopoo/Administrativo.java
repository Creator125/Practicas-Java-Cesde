package iniciopoo;

public class Administrativo extends Persona{
    private String cargo;

    public Administrativo() {
    }

    public Administrativo(String cargo, String indentidad, String nombre, boolean status, int salario) {
        super(indentidad, nombre, status, salario);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
    public int pagarBonoDicienbre(String ident, int salario){
        if(salario > 2000000){
            return 500000;
        }else{
            return 100000;
        }
    }
}
