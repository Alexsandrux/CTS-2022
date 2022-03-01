package Seminar2;

import java.io.FileNotFoundException;
import java.util.List;

public interface AplicantiReader {
     List<Aplicant> citireAplicants(String numeFisier) throws FileNotFoundException;
}
