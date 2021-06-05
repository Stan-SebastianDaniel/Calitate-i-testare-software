package ro.ase.cts.AdapterClase.program;

import ro.ase.cts.AdapterClase.clase.AdapterLeasing;
import ro.ase.cts.AdapterClase.clase.Creditable;

public class Main {
    public  static void printeazaInfoCredite(Creditable credit){
        credit.creditare();
    }

    public static void main(String[] args) {
        AdapterLeasing adapterLeasing = new AdapterLeasing("Gigel", 123456);
        printeazaInfoCredite(adapterLeasing);
    }
}