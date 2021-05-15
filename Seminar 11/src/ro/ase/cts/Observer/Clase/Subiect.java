package ro.ase.cts.Observer.Clase;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
    private List<Observer> listaObserver=null;

    public Subiect() {
        this.listaObserver=new ArrayList<>();
    }

    public void adaugaAbonat(Observer observer){
        this.listaObserver.add(observer);
    }
    public void stergeAbonat(Observer observer){
        this.listaObserver.remove(observer);
    }
    public void notificaAbonat(String mesaj){
        for (Observer obs:listaObserver) {
            obs.receptionareMesaj(mesaj);
        }
    }
}
