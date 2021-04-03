package ro.ase.cts;

public class Fundas extends Jucator{
    public Fundas(String nume, int nrTricou) {
        super(nume, nrTricou);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Fundas{");
        sb.append(getNume());
        sb.append(",");
        sb.append(getNrTricou());
        sb.append('}');
        return sb.toString();
    }
}
