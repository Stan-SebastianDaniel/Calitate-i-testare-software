package ro.ase.cts.Program;

import ro.ase.cts.Clase.Aplicant;
import ro.ase.cts.Clase.Proiect;
import ro.ase.cts.Clase.Readers.AplicantReadable;
import ro.ase.cts.Clase.Readers.ElevReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static List<Aplicant> citesteAplicant(AplicantReadable aplicantReadable) throws FileNotFoundException {
        return aplicantReadable.readAplicants();
    }

    public static void main(String[] args) {
        List<Aplicant> listaAplicanti;
        try {
            Proiect proiect = new Proiect(80);
            listaAplicanti = citesteAplicant(new ElevReader("elevi.txt"));
            for(Aplicant aplicant:listaAplicanti){
                System.out.println(aplicant.toString());
                System.out.println(aplicant.getFinantare());
                aplicant.displayStateInProject(proiect);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
