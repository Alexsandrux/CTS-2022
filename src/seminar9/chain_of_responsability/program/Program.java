package seminar9.chain_of_responsability.program;

import seminar9.chain_of_responsability.clase.*;

public class Program {
    public static void main(String[] args)
    {
        Notificator troleibuz = new NotificatorTroileibuz(3);
        Notificator autobuz = new NotificareAutobuz(5);
        Notificator tramvai = new NotificatorTramvai(10);
        Notificator metrou = new NotificatorMetrou(100000);

        troleibuz.setNextNotificator(autobuz);
        autobuz.setNextNotificator(tramvai);
        tramvai.setNextNotificator(metrou);

        troleibuz.notifica(new Calator("John"), 8);

        System.out.println("Pentru Cluj: ");

        Notificator troilebuzCluj = new NotificatorTroileibuz(5);
        Notificator autobuzCluj = new NotificareAutobuz(100);
        Notificator tramvaiCluj = new NotificatorTramvai(2);
        Notificator metrouCluj = new NotificatorMetrou(1);

        metrouCluj.setNextNotificator(tramvaiCluj);
        tramvaiCluj.setNextNotificator(troilebuzCluj);
        troilebuzCluj.setNextNotificator(autobuzCluj);

        metrouCluj.notifica(new Calator("Jhonny"), 3);

        metrouCluj.notifica(new Calator("Jhonny care merge mai mult"), 6);

    }
}
