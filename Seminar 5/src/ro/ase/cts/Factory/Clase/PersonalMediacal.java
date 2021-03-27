package ro.ase.cts.Factory.Clase;

public abstract class PersonalMediacal {
    private String nume;
    private float salariu;

    public PersonalMediacal() {
        super();
    }

    public PersonalMediacal(String nume, float salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float getSalariu() {
        return salariu;
    }

    public void setSalariu(float salariu) {
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        return "PersonalMediacal{" +
                "nume='" + nume + '\'' +
                ", salariu=" + salariu +
                '}';
    }
}
