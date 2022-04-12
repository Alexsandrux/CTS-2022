package seminar6.facade.program;


import seminar6.adapter.clase.autobuz.AdapterValidatorObiecte;
import seminar6.adapter.clase.autobuz.ValidatorAutobuz;
import seminar6.adapter.clase.metrou.ValidatorMetrou;
import seminar6.facade.clase.Autobuz;
import seminar6.facade.clase.Facade;

public class Program {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz();

        Facade.deschideUsi(autobuz);

        System.out.println("------");

        Facade.lasaLiberUsi(autobuz);

    }
}
