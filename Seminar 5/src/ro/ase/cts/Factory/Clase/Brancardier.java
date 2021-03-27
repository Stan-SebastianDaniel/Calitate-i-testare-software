package ro.ase.cts.Factory.Clase;

public class Brancardier extends PersonalMediacal {
    public Brancardier(String nume, float salariu) {
        super(nume, salariu);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("brancardier{");
        sb.append(super.toString()).append('}');
        return sb.toString();
    }
}
