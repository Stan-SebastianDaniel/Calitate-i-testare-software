package ro.ase.cts.Builder;

public class BuilderRezervare implements AbstractBuilder{
    Rezervare rezervare=null;

    public BuilderRezervare(){
        this.rezervare=new Rezervare(0,false,false,false,
                false,"nimic");
    }



    public BuilderRezervare setCodRezervare(int codRezervare) {
        this.rezervare.setCodRezervare(codRezervare);
        return this;
    }


    public BuilderRezervare setAreMancareInclusa(boolean areMancareInclusa) {
        this.rezervare.setAreMancareInclusa(areMancareInclusa);
        return this;
    }


    public BuilderRezervare setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.rezervare.setAreScaunErgonomic(areScaunErgonomic);
        return this;
    }


    public BuilderRezervare setAreBauturaRacoritoareInclusa(boolean areBauturaRacoritoareInclusa) {
        this.rezervare.setAreBauturaRacoritoareInclusa(areBauturaRacoritoareInclusa);
        return this;
    }


    public BuilderRezervare setAreMuzicaAmbientalaPersonalizabilaInclusa(boolean areMuzicaAmbientalaPersonalizabilaInclusa) {
        this.rezervare.setAreMuzicaAmbientalaPersonalizabilaInclusa(areMuzicaAmbientalaPersonalizabilaInclusa);
        return this;
    }


    public BuilderRezervare setGenMuzica(String genMuzica) {
        this.rezervare.setGenMuzica(genMuzica);
        return this;
    }


    @Override
    public Rezervare build() {
        return rezervare;
    }
}
