package ro.ase.cts.Exercitiu15.Program;

import ro.ase.cts.Exercitiu15.Clase.*;

public class Main {
    public static void main(String[] args){
        ManagerComenzi managerComenzi= new ManagerComenzi();

        Executant cont=new Executant("gigi");

        ComandaCreeare comandaCreeare=new ComandaCreeare(cont,1000);
        managerComenzi.adaugaComanda(comandaCreeare);
        managerComenzi.adaugaComanda(new ComandaRetragere(cont,123));
        managerComenzi.executaComenzi();
        managerComenzi.adaugaComanda(new ComandaDepunere(cont,369));
        managerComenzi.adaugaComanda(new ComandaRetragere(cont,7530));
        managerComenzi.executaComenzi();
        managerComenzi.executaComenzi();
        managerComenzi.executaComenzi();
    }
}
