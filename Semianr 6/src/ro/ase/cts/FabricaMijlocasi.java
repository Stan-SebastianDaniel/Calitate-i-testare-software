package ro.ase.cts;

public class FabricaMijlocasi implements FabricaJucatori{

    @Override
    public Jucator creazaJucator(String nume, int nrTricou) {
        return new Mijlocas(nume, nrTricou);
    }
}
