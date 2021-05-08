package ro.ase.cts.Exercitiu16.Program;

import ro.ase.cts.Exercitiu16.Clase.Cont;
import ro.ase.cts.Exercitiu16.Clase.ContCurent;

public class Main {
    public static void main(String[] args){
        Cont contCurent=new ContCurent(200);
        Cont contCredit=new ContCurent(159);
        Cont contEconomi=new ContCurent(753);

        contCurent.setSuccesorCont(contCredit);
        contCurent.setSuccesorCont(contEconomi);

        contCurent.realizeazaPlata(100);
        contCurent.realizeazaPlata(150);
        contCurent.realizeazaPlata(150);
        contCurent.realizeazaPlata(170);
        contCurent.realizeazaPlata(465);

    }
}
