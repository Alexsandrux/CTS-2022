package seminar8.observer.clase;

import java.util.List;

public class Autobuz extends Subiect{
    private int nrLinie;

    public Autobuz( int nrLinie) {
        super();
        this.nrLinie = nrLinie;
    }

    @Override
    public void notificaCalatori() {
        for (Observer obj:  calatori
             ) {

            obj.primesteMesaj("Autbozul " + nrLinie + " a plecat de la capat de linie");

        }
    }
}
