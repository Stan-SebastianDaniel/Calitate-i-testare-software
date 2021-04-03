package ro.ase.cts.Builder;

public class Rezervare {
    private int codRezervare;
    private boolean areMancareInclusa;
    private boolean areScaunErgonomic;
    private boolean areBauturaRacoritoareInclusa;
    private boolean areMuzicaAmbientalaPersonalizabilaInclusa;
    private String genMuzica;

    public Rezervare(int codRezervare, boolean areMancareInclusa, boolean areScaunErgonomic, boolean areBauturaRacoritoareInclusa, boolean areMuzicaAmbientalaPersonalizabilaInclusa, String genMuzica) {
        this.codRezervare = codRezervare;
        this.areMancareInclusa = areMancareInclusa;
        this.areScaunErgonomic = areScaunErgonomic;
        this.areBauturaRacoritoareInclusa = areBauturaRacoritoareInclusa;
        this.areMuzicaAmbientalaPersonalizabilaInclusa = areMuzicaAmbientalaPersonalizabilaInclusa;
        this.genMuzica = genMuzica;
    }

    public int getCodRezervare() {
        return codRezervare;
    }

    public void setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
    }

    public boolean isAreMancareInclusa() {
        return areMancareInclusa;
    }

    public void setAreMancareInclusa(boolean areMancareInclusa) {
        this.areMancareInclusa = areMancareInclusa;
    }

    public boolean isAreScaunErgonomic() {
        return areScaunErgonomic;
    }

    public void setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
    }

    public boolean isAreBauturaRacoritoareInclusa() {
        return areBauturaRacoritoareInclusa;
    }

    public void setAreBauturaRacoritoareInclusa(boolean areBauturaRacoritoareInclusa) {
        this.areBauturaRacoritoareInclusa = areBauturaRacoritoareInclusa;
    }

    public boolean isAreMuzicaAmbientalaPersonalizabilaInclusa() {
        return areMuzicaAmbientalaPersonalizabilaInclusa;
    }

    public void setAreMuzicaAmbientalaPersonalizabilaInclusa(boolean areMuzicaAmbientalaPersonalizabilaInclusa) {
        this.areMuzicaAmbientalaPersonalizabilaInclusa = areMuzicaAmbientalaPersonalizabilaInclusa;
    }

    public String getGenMuzica() {
        return genMuzica;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Rezervare{");
        sb.append("codRezervare=").append(codRezervare);
        sb.append(", areMancareInclusa=").append(areMancareInclusa);
        sb.append(", areScaunErgonomic=").append(areScaunErgonomic);
        sb.append(", areBauturaRacoritoareInclusa=").append(areBauturaRacoritoareInclusa);
        sb.append(", areMuzicaAmbientalaPersonalizabilaInclusa=").append(areMuzicaAmbientalaPersonalizabilaInclusa);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
