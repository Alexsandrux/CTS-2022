package seminar9.chain_of_responsability.clase;

public class NotificatorTroileibuz extends  Notificator{

    private int limita;

    public NotificatorTroileibuz(int limita) {
        this.limita = limita;
    }

    @Override
    public void notifica(Calator calator, int distanta) {
        if(distanta <= limita)
        {
            System.out.println("Calatorul " + calator.getNumeCalator() + " va merge cu troilebuzul");
        }
        else {
            nextNotificator.notifica(calator, distanta);
        }
    }
}
