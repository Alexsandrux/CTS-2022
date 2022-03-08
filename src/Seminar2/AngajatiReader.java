package Seminar2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader implements AplicantiReader {
    @Override
    public List<Aplicant> citireAplicants(String numeFisier) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(numeFisier));
        scanner.useDelimiter(",");
        List<Aplicant> angajati = citireAplicantidinScanner(scanner);


        scanner.close();
        return angajati;
    }

    private List<Aplicant> citireAplicantidinScanner(Scanner scanner) {
        List<Aplicant> angajati = new ArrayList<>();

        while (scanner.hasNext()) {
            Angajat angajatNou = new Angajat();

            AplicantReader.citireAplicant(scanner, angajatNou);

            int salariu = scanner.nextInt();
            String ocupatie = scanner.next();
            angajatNou.setSalariu(salariu);
            angajatNou.setOcupatie(ocupatie);

            angajati.add(angajatNou);
        }

        return angajati;
    }
}
