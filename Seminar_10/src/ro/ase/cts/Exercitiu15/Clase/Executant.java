package ro.ase.cts.Exercitiu15.Clase;

public class Executant {
    private float sold;
    private String destinatar;

    public Executant(String destinatar) {
        this.destinatar = destinatar;
    }

    public float getSold() {
        return sold;
    }

    public void setSold(float sold) {
        this.sold = sold;
    }

    public String getDestinatar() {
        return destinatar;
    }

    public void setDestinatar(String destinatar) {
        this.destinatar = destinatar;
    }

   public void creeazaCont(float sold){
        this.sold=sold;
        System.out.println("Sa constituit contul cu suma"+sold);
    }

  public   void retaragere(float suma){
        if(suma<= this.sold){
            this.sold-=suma;
            System.out.println("sa retras suma de "+ suma);
        }
        else {
            System.out.println("Fonduri insuficiente");
        }
    }

  public   void depunere(float suma){
        this.sold=suma;
        System.out.println("sa depus suma de: "+suma);
    }

}
