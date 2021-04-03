package ro.ase.cts;

public class Atacant extends Jucator{

    public Atacant(String nume, int nrTricou) {
        super(nume, nrTricou);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Atacant{");
        sb.append(getNume());
        sb.append(",");
        sb.append(getNrTricou());
        sb.append('}');
        return sb.toString();
    }
}
