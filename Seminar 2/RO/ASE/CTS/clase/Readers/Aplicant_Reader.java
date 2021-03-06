package RO.ASE.CTS.clase.Readers;

import RO.ASE.CTS.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;

public interface Aplicant_Reader {
    List<Aplicant> readAplicant(String file) throws FileNotFoundException;
}
