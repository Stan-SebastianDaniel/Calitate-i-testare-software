package RO.ASE.CTS.program;

import RO.ASE.CTS.clase.Angajat;
import RO.ASE.CTS.clase.Aplicant;
import RO.ASE.CTS.clase.Readers.Angajati_Reader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static List<Aplicant> citesteAplicant(String numeFisier,)

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
			listaAngajati = Angajati_Reader.readAngajati("RO/ASE/CTS/angajati.txt");
			for(Aplicant aplicant:listaAngajati)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
