package seminar10.state.clase;

public class InCursa implements Stare {

    @Override
    public void actualizareStare(Autobuz autobuz) {
        if (autobuz.getStare() instanceof LaCapatDeLinie) {
            System.out.printf("Autobuzul cu nr. linie %d a plecat in cursa!\n", autobuz.getNrAutobuz());
            autobuz.setStare(this);
        }
        else {
            System.out.printf("Autobuzul cu nr. linie %d nu poate sa plece in cursa!\n", autobuz.getNrAutobuz());
        }
    }
}
