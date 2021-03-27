package ro.ase.cts.Factory.Clase;

public class FactorySingleton {

    public static FactorySingleton factorySingleton=null;

    public static synchronized FactorySingleton getInstance(){
        if(FactorySingleton.factorySingleton==null){
            FactorySingleton.factorySingleton=new FactorySingleton();
        }
        return FactorySingleton.factorySingleton;
    }

    private FactorySingleton(){};

    public PersonalMediacal create(TipPersonal tip,String nume, float salriu){
        switch (tip){
            case MEDIC:{
                Medic medic=new Medic(nume,salriu);
                return medic;
            }
            case ASISTENT:{
                Asistent asistent=new Asistent(nume,salriu);
                return asistent;
            }
            case BRANCARDIER:{
                Brancardier brancardier=new Brancardier(nume,salriu);
                return brancardier;
            }
            default:{
                throw new IllegalArgumentException("tip invalid");
            }
        }
    }
}
