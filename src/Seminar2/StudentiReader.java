package Seminar2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiReader implements AplicantiReader {
    @Override
    public List<Aplicant> citireAplicants(String numeFisier) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(numeFisier));
        scanner.useDelimiter(",");
        List<Aplicant> studenti = citireAplicantidinScanner(scanner);


        scanner.close();
        return studenti;
    }


    private List<Aplicant> citireAplicantidinScanner(Scanner scanner) {
        List<Aplicant> studenti = new ArrayList<>();

        while (scanner.hasNext()) {
            Student studentNou = new Student();

            AplicantReader.citireAplicant(scanner, studentNou);

            int an_studii = scanner.nextInt();
            String facultate = (scanner.next());

            studentNou.setAn_studii(an_studii);
            studentNou.setFacultate(facultate);

            studenti.add(studentNou);
        }

        return studenti;
    }
}
