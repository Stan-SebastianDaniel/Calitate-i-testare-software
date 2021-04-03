package ro.ase.cts;

public abstract class Jucator {
    private String nume;
    private int nrTricou;

    public Jucator(String nume, int nrTricou) {
        this.nume = nume;
        this.nrTricou = nrTricou;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNrTricou() {
        return nrTricou;
    }

    public void setNrTricou(int nrTricou) {
        this.nrTricou = nrTricou;
    }

    @Override
    public String toString() {
        return "Jucator{" +
                "nume='" + nume + '\'' +
                ", nrTricou=" + nrTricou +
                '}';
    }
}
