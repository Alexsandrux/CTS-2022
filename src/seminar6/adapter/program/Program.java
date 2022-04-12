package seminar6.adapter.program;


import seminar6.adapter.clase.autobuz.AdapterValidatorObiecte;
import seminar6.adapter.clase.autobuz.ValidatorAutobuz;
import seminar6.adapter.clase.metrou.ValidatorMetrou;

public class Program {
    public static void main(String[] args) {
        ValidatorAutobuz autobuz = new ValidatorAutobuz();
        ValidatorMetrou metrou = new ValidatorMetrou();

        AdapterValidatorObiecte adaptorObiecte = new AdapterValidatorObiecte(metrou);
        adaptorObiecte.validareBilet();
        adaptorObiecte.validareAbonament();

    }
}
