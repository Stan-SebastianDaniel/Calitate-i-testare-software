package ro.ase.cts.AdapteObiecte.program;

import ro.ase.cts.AdapteObiecte.clase.AdapterLeasing;
import ro.ase.cts.AdapteObiecte.clase.Leasing;
import ro.ase.cts.AdapteObiecte.clase.Creditable;

public class Main {
    public  static void printeazaInfoCredite(Creditable credit){
        credit.creditare();
    }

    public static void main(String[] args) {
        Leasing leasing = new Leasing("Petrica", 1234);
        AdapterLeasing adapterLeasing = new AdapterLeasing(leasing);
        adapterLeasing.creditare();
        System.out.println("=================================================================");
        printeazaInfoCredite(adapterLeasing);
    }
}
