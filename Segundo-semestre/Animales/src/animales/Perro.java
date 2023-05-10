package animales;

public class Perro extends Mamifero {
   String colorPelo;

   public Perro() {
   }

   public Perro(String colorPelo, boolean sangrecalinete, float peso) {
       super(sangrecalinete, peso);
       this.colorPelo = colorPelo;
   }
    
   public void ladrar(){
        
   }
}
