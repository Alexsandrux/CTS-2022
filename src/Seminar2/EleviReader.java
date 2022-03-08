package Seminar2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EleviReader implements AplicantiReader{
    @Override
    public List<Aplicant> citireAplicants(String numeFisier) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(numeFisier));
        scanner.useDelimiter(",");
        List<Aplicant> elevi = citireAplicantidinScanner(scanner);


        scanner.close();
        return elevi;
    }

    private List<Aplicant> citireAplicantidinScanner(Scanner scanner) {
        List<Aplicant> elevi = new ArrayList<>();

        while (scanner.hasNext()) {
            Elev elevNou = new Elev();

            AplicantReader.citireAplicant(scanner, elevNou);

            int clasa = scanner.nextInt();
            String tutore = scanner.next();

            elevNou.setClasa(clasa);
            elevNou.setTutore(tutore);

            elevi.add(elevNou);
        }
        return elevi;
    }
}
