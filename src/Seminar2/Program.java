package Seminar2;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Aplicant> angajati;
        AplicantiReader readerAngajati = new AngajatiReader();
        try {
            angajati = readerAngajati.citireAplicants("Fisiere/Seminar2/angajati.txt");
            for (Aplicant angajat : angajati) {
                angajat.afisareSalariuZilnic(1000);
                angajat.afisareStatut();
                System.out.println(angajat.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
