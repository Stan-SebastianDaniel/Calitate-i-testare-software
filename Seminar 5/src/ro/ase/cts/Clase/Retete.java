package ro.ase.cts.Clase;

import java.util.ArrayList;
import java.util.List;

public class Retete implements AbstractPrototype{
   private List<String> solutii;
   private List<Integer> cantitati;

   public Retete(List<String> solutii, List<Integer> cantitati) {
      this.solutii = solutii;
      //se fac teoretic validari pe aici
      this.cantitati = cantitati;
   }
   private Retete(){

   }

   public List<String> getSolutii() {
      return solutii;
   }

   public void setSolutii(List<String> solutii) {
      this.solutii = solutii;
   }

   public List<Integer> getCantitati() {
      return cantitati;
   }

   public void setCantitati(List<Integer> cantitati) {
      this.cantitati = cantitati;
   }
   public  AbstractPrototype copiaza(){
      Retete copie=new Retete();
      copie.cantitati=new ArrayList<>();
      copie.solutii=new ArrayList<>();
      copie.cantitati.addAll(this.cantitati);
      copie.solutii.addAll(this.solutii);
      return copie;
   }
}
