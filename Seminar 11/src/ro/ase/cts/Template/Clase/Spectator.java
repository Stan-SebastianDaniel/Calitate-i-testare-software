package ro.ase.cts.Template.Clase;

public class Spectator extends Template{
    String nume;

    public Spectator(String nume) {
        this.nume = nume;
    }

    @Override
    public void seAsazaLaCoada() {
        System.out.println("se asaza a coada");
    }

    @Override
    public void prezintaBilet() {
        System.out.println(this.nume+"prezinta biletul");
    }

    @Override
    public void seFaceControlCorporal() {
        System.out.println(this.nume+"se face contrl");
    }

    @Override
    public void ocupaLoc() {
        System.out.println(this.nume+"ocupa loc");
    }
}
