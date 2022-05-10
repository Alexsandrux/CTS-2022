package seminar10.state.clase;

public class LaReparat implements Stare{
    @Override
    public void actualizareStare(Autobuz autobuz) {
        if (autobuz.getStare() instanceof LaCapatDeLinie ) {
            System.out.printf("Autobuzul cu nr. linie %d a ajuns la reparat!\n", autobuz.getNrAutobuz());
            autobuz.setStare(this);
        }
        else {
            System.out.printf("Autobuzul cu nr. linie %d nu poate ajunge la reparat!\n", autobuz.getNrAutobuz());
        }
    }
}
