package ro.ase.cts.Observer.Clase;

public class ManagerSala extends Subiect{
    String nume;

    public ManagerSala(String nume) {
        this.nume = nume;
    }

    public void anuntaMeci(String tipMeci){
        super.notificaAbonat(this.nume+" o sa tina un meci de "+tipMeci);
    }
}
