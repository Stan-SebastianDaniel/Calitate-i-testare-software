package ro.ase.cts.Observer.Clase;

public class Client implements Observer{
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void receptionareMesaj(String mesaj) {
        System.out.println(this.nume+" a receptionat mesajul:"+mesaj);
    }
}
