package seminar9.chain_of_responsability.clase;

public class NotificatorMetrou extends Notificator{

    private int limita;

    public NotificatorMetrou(int limita) {
        this.limita = limita;
    }

    @Override
    public void notifica(Calator calator, int distanta) {
        if(distanta > limita)
        {
            System.out.println("Calatorul " + calator.getNumeCalator() + " va merge cu metroul");
        }
        else {
            System.out.println("Distanta intrdousa nu este valida");
        }
    }
}
