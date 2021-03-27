package ro.ase.cts.Factory.Clase;

public class Asistent extends PersonalMediacal {
    public Asistent(String nume, Float salariu) {
        super(nume, salariu);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Asistent{");
        sb.append(super.toString()).append('}');
        return sb.toString();
    }
}
