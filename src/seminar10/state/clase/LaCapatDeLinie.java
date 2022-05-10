package seminar10.state.clase;

public class LaCapatDeLinie implements Stare{
    @Override
    public void actualizareStare(Autobuz autobuz) {
        if (!(autobuz.getStare() instanceof LaCapatDeLinie) ) {
            System.out.printf("Autobuzul cu nr. linie %d a ajuns la capat de linie!\n", autobuz.getNrAutobuz());
            autobuz.setStare(this);
        }
        else {
            System.out.printf("Autobuzul cu nr. linie %d nu poate sa ajunge la capat de linei!\n", autobuz.getNrAutobuz());
        }
    }
}
