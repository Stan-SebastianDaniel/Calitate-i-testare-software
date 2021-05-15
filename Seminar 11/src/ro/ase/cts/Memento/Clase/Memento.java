package ro.ase.cts.Memento.Clase;

public class Memento {
    private String echimaGazda;
    private String echimaOaspete;
    private int nrSpecatatori;

    public Memento(String echimaGazda, String echimaOaspete, int nrSpecatatori) {
        this.echimaGazda = echimaGazda;
        this.echimaOaspete = echimaOaspete;
        this.nrSpecatatori = nrSpecatatori;
    }

    public String getEchimaGazda() {
        return echimaGazda;
    }

    public String getEchimaOaspete() {
        return echimaOaspete;
    }

    public int getNrSpecatatori() {
        return nrSpecatatori;
    }
}
