package ro.ase.cts.Template.Program;

import ro.ase.cts.Template.Clase.Spectator;
import ro.ase.cts.Template.Clase.SpectatorVIP;

public class Main {
    public static void main(String[] args){
        Spectator spectator=new Spectator("Gigel");
        SpectatorVIP spectatorVIP=new SpectatorVIP("Becali",1);

        spectator.intrPeStadion();
        System.out.println("----------------");
        spectatorVIP.intrPeStadion();
    }
}
