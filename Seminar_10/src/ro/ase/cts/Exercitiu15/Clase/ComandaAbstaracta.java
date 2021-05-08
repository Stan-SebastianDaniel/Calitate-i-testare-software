package ro.ase.cts.Exercitiu15.Clase;

public abstract class ComandaAbstaracta {
    private Executant executant;
    private float suma;

    public ComandaAbstaracta(Executant executant, float suma){
        this.executant=executant;
        this.suma=suma;
    }

    public ComandaAbstaracta(Executant executant) {
        this.executant = executant;
    }

    public Executant getExecutant() {
        return executant;
    }

    public void setExecutant(Executant executant) {
        this.executant = executant;
    }

    public float getSuma() {
        return suma;
    }

    public void setSuma(float suma) {
        this.suma = suma;
    }

    public abstract void executa();
}
