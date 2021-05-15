package ro.ase.cts.Observer.Program;

import ro.ase.cts.Observer.Clase.Client;
import ro.ase.cts.Observer.Clase.ManagerSala;

public class Main {
    public static void main(String[] args){
        ManagerSala managerSala=new ManagerSala("Manager1");

        Client client=new Client("popescu");
        Client client1=new Client("Georgescu");

        managerSala.adaugaAbonat(client);
        managerSala.adaugaAbonat(client1);

        managerSala.anuntaMeci("Volei");

        System.out.println("----------------");

        managerSala.stergeAbonat(client1);
        managerSala.anuntaMeci("fotbal");
    }
}
