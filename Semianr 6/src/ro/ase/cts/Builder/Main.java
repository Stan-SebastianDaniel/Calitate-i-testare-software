package ro.ase.cts.Builder;

public class Main {
    public static void main(String[] args){
        Rezervare rezervare=new Rezervare(12, false,true,true,false,"rock");
            
        BuilderRezervare builderRezervare=new BuilderRezervare().setCodRezervare(1)
                .setAreBauturaRacoritoareInclusa(true)
                .setAreMancareInclusa(true)
                .setAreMuzicaAmbientalaPersonalizabilaInclusa(true)
                .setAreScaunErgonomic(true)
                .setGenMuzica("metal");
        Rezervare rezervare1=new BuilderRezervare().build();

        Rezervare rezervare2=new BuilderRezervare().setCodRezervare(2)
                .setAreBauturaRacoritoareInclusa(true).build();
        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());
    }

}
