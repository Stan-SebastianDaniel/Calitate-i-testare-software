package ro.ase.cts.Exercitiu15.Clase;

import java.util.ArrayList;
import  java.util.List;

public class ManagerComenzi {
    private List<ComandaAbstaracta> listaComenzi=new ArrayList<>();

    public void adaugaComanda(ComandaAbstaracta comanda){
        this.listaComenzi.add(comanda);
    }

    public void executaComenzi(){
        if (listaComenzi.size() != 0){
            this.listaComenzi.get(0).executa();
            this.listaComenzi.remove(0);
        }
        else {
            throw new IndexOutOfBoundsException();
        }
    }
}
