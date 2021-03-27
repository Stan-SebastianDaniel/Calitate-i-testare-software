package ro.ase.cts.Factory.Clase;

public class Medic extends PersonalMediacal{
    public Medic(String nume, float salariu) {
        super(nume, salariu);
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medic{");
        sb.append(super.toString()).append('}');
        return sb.toString();
    }
}
