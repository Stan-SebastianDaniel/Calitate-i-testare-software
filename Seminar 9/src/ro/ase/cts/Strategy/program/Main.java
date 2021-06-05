package ro.ase.cts.Strategy.program;

import ro.ase.cts.Strategy.clase.Client;
import ro.ase.cts.Strategy.clase.PayCard;
import ro.ase.cts.Strategy.clase.PayCash;
import ro.ase.cts.Strategy.clase.PayDogecoin;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Gigel", new PayCash());
        client.platesteNota(200);

        client.setPayable(new PayCard());
        client.platesteNota(12);

        client.setPayable(new PayDogecoin());
        client.platesteNota(12345);
    }
}