package seminar6.composite.program;


import seminar6.adapter.clase.autobuz.AdapterValidatorObiecte;
import seminar6.adapter.clase.autobuz.ValidatorAutobuz;
import seminar6.adapter.clase.metrou.ValidatorMetrou;
import seminar6.composite.clase.Autobuz;
import seminar6.composite.clase.Flota;
import seminar6.composite.clase.Nod;

public class Program {
    public static void main(String[] args) {
        Nod autobuz1 = new Autobuz("producator1", "model1", 25);
        Nod autobuz2 = new Autobuz("producator2", "model2", 20);
        Nod autobuz3 = new Autobuz("producator3", "model3", 19);
        Nod autobuz4 = new Autobuz("producator4", "model4", 21);
        Nod autobuz5 = new Autobuz("producator5", "model5", 11);
        Nod autobuz6 = new Autobuz("producator6", "model6", 18);

        Nod mari = new Flota("Autobuze Mari");
        Nod mijlocii = new Flota("Autobuze mijlocii");
        Nod mici = new Flota("Autobuze mici");
        Nod flota = new Flota("flota");

        try {
            mici.adaugaNod(autobuz1);
            mici.adaugaNod(autobuz3);

            mijlocii.adaugaNod(autobuz4);
            mijlocii.adaugaNod(autobuz5);

            mari.adaugaNod(autobuz2);
            mari.adaugaNod(autobuz6);

            flota.adaugaNod(mici);
            flota.adaugaNod(mijlocii);
            flota.adaugaNod(mari);

            System.out.println("Garantie pentru intrega flota: " + flota.calculeazaSumaGarantie(2));
            System.out.println("Garantie pentru floa mijlocie: " + mijlocii.calculeazaSumaGarantie(2));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }



    }
}
