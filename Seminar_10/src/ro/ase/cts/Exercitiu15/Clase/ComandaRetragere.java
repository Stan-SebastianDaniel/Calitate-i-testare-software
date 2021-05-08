package ro.ase.cts.Exercitiu15.Clase;

public class ComandaRetragere extends ComandaAbstaracta{

    public ComandaRetragere(Executant executant, float suma) {
        super(executant, suma);
    }

    @Override
    public void executa(){
        super.getExecutant().retaragere(super.getSuma());
    }

}
