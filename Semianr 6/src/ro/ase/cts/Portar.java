package ro.ase.cts;

public class Portar extends Jucator{
    public Portar(String nume, int nrTricou) {
        super(nume, nrTricou);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Portar{");
        sb.append(getNume());
        sb.append(",");
        sb.append(getNrTricou());
        sb.append('}');
        return sb.toString();
    }
}
