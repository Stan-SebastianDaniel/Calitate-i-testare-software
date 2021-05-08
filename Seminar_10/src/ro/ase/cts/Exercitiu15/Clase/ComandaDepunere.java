package ro.ase.cts.Exercitiu15.Clase;

public class ComandaDepunere extends ComandaAbstaracta {
    public ComandaDepunere(Executant executant, float suma) {
        super(executant, suma);
    }


    @Override
    public void executa(){
        super.getExecutant().depunere(super.getSuma());
    }
}
