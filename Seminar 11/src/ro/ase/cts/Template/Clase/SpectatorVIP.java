package ro.ase.cts.Template.Clase;

public class SpectatorVIP extends Template{
    private String nume;
    private int nrLoja;

    public SpectatorVIP(String nume, int nrLoja) {
        this.nume = nume;
        this.nrLoja = nrLoja;
    }

    @Override
    public void seAsazaLaCoada() {

    }

    @Override
    public void prezintaBilet() {
        System.out.println(this.nume+" prezita bilet VIP");
    }

    @Override
    public void seFaceControlCorporal() {
        System.out.println(this.nume+" se face controlul corporal");
    }

    @Override
    public void ocupaLoc() {
        System.out.println(this.nume+"ocupa loc in loja"+this.nrLoja);
    }
}
