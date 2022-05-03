package seminar9.chain_of_responsability.clase;

import seminar9.chain_of_responsability.clase.Calator;

public abstract class Notificator {
    protected Notificator nextNotificator;

    public void setNextNotificator(Notificator nextNotificator) {
        this.nextNotificator = nextNotificator;
    }

    public abstract  void notifica(Calator calator, int distanta);
}
