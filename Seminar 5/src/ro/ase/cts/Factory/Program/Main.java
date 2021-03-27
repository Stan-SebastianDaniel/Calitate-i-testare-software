package ro.ase.cts.Factory.Program;

import ro.ase.cts.Factory.Clase.*;

public class Main {
    public static void main(String[] args) {
        Factory factory=new Factory();
        Medic medic=(Medic) factory.create(TipPersonal.MEDIC,"gigi",123);
        PersonalMediacal brancardier=factory.create(TipPersonal.BRANCARDIER,"brna",258);
        PersonalMediacal asistent= factory.create(TipPersonal.ASISTENT,"Ass",753);

        System.out.println(medic);
        System.out.println(brancardier);
        System.out.println(asistent);

        PersonalMediacal med=FactorySingleton.getInstance().create(TipPersonal.MEDIC,"Medicus",159);
        System.out.println(med);
    }
}
