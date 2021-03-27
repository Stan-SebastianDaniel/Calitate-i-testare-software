package ro.ase.cts.Program;

import ro.ase.cts.Clase.Retete;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> solutii=new ArrayList<>();
        solutii.add("apa");
        List<Integer> cantiati=new ArrayList<>();
        cantiati.add(10);

        Retete retete1=new Retete(solutii,cantiati);
        Retete retete2=(Retete) retete1.copiaza();
        System.out.println(retete1);
        System.out.println("==================");
        System.out.println(retete2);
    }
}
