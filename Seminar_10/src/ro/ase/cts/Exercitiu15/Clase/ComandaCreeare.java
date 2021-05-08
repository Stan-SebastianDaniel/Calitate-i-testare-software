package ro.ase.cts.Exercitiu15.Clase;

public class ComandaCreeare extends ComandaAbstaracta {

    public ComandaCreeare(Executant executant, float suma) {
        super(executant, suma);
    }

    @Override
    public void executa() {
        super.getExecutant().creeazaCont(super.getSuma());
    }


}
