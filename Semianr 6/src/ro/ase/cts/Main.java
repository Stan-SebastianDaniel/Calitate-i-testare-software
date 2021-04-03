package ro.ase.cts;

public class Main {

    public static void afiseazaInformatiiJucator(FabricaJucatori fabricaJucatori,String nume,int nrTricou){
        Jucator jucator = fabricaJucatori.creazaJucator(nume, nrTricou);
        System.out.println(jucator.toString());
    }

    public static void main(String[] args){
        afiseazaInformatiiJucator(new FabricaAtacanti(),"PopovichiCHe",13);
        afiseazaInformatiiJucator(new FabricaFundasi(),"Babanu",31);
        afiseazaInformatiiJucator(new FabricaPortar(),"Poter",22);
        afiseazaInformatiiJucator(new FabricaMijlocasi(),"GIGi",1);
    }
}
