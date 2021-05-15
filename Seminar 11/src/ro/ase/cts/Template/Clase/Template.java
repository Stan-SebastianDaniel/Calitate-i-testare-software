package ro.ase.cts.Template.Clase;

public abstract class Template {
    public final void intrPeStadion(){
        seAsazaLaCoada();
        prezintaBilet();
        seFaceControlCorporal();
        ocupaLoc();
    }

    public abstract void seAsazaLaCoada();
    public abstract void prezintaBilet();
    public abstract void seFaceControlCorporal();
    public abstract void ocupaLoc();
}
