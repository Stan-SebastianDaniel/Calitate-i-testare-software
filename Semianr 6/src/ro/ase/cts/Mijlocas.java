package ro.ase.cts;

public class Mijlocas extends Jucator{
    public Mijlocas(String nume, int nrTricou) {
        super(nume, nrTricou);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Mijlocas{");
        sb.append(getNume());
        sb.append(",");
        sb.append(getNrTricou());
        sb.append('}');
        return sb.toString();
    }
}
