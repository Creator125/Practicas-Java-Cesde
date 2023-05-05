package pooinmuebles;

public class PooInmuebles {
    public static void main(String[] args) {
        //Instacinado la clase inmueble
        Inmueble inmueble1 = new Inmueble("2754", "Cl 31 No. 41-09, C.P 76520", "5127614");
        
        System.out.println("Datos del inmueble 1: \n"
                + "Codigo: "+ inmueble1.getCodigo() +"\n"
                + "Direcion: "+inmueble1.getDireccion() +"\n"
                + "Telefono: "+ inmueble1.getTelefono());
        
        //Instaciando la clase oficina
        Oficina ofi1 = new Oficina(23, "1243", "Cl 47 No. 19-29, C.P 08001", "53460687");
        
        System.out.println("\nDatos de la Oficina 1: \n"
                + "Sala de asamblea: "+ ofi1.getSalaAsamblea() +"\n"
                + "Codigo: "+ ofi1.getCodigo() +"\n"
                + "Direccion: "+ ofi1.getDireccion() +"\n"
                + "Telefono: "+ ofi1.getTelefono());
        
        //Istaciando la clae Casa
        Casa casa1 = new Casa(3, "4637", "Cl 34A No. 7A-95, C.P 76001", "24485423");
        
        System.out.println("\nDatos de la casa 1: \n"
                + "Sala de asamblea: "+ casa1.getNohabitaciones() +"\n"
                + "Codigo: "+ casa1.getCodigo() +"\n"
                + "Direccion: "+ casa1.getDireccion() +"\n"
                + "Telefono: "+ casa1.getTelefono());
    }
    
}
