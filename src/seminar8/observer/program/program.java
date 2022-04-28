package seminar8.observer.program;


import seminar8.observer.clase.Autobuz;
import seminar8.observer.clase.Calator;
import seminar8.observer.clase.Observer;
import seminar8.observer.clase.Subiect;

public class program {
    public static void main(String[] args) {
        Subiect autobuz = new Autobuz(32);

        Observer calator1 = new Calator("Alexandru");
        Observer calator2 = new Calator("Mihai");
        Observer calator3 = new Calator("George");

        autobuz.adaugaCalator(calator1);
        autobuz.adaugaCalator(calator2);
        autobuz.notificaCalatori();
        autobuz.adaugaCalator(calator3);
        autobuz.stergeCalator(calator1);
        autobuz.notificaCalatori();
    }
}
