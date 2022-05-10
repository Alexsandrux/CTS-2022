package seminar10.command.program;

import seminar10.command.clase.Autobuz;
import seminar10.command.clase.ComandaPlecareTraseu;
import seminar10.command.clase.Command;
import seminar10.command.clase.Operator;

public class Program {
    public static void main(String[] args) {
        Operator operator = new Operator();
        Autobuz autobuz1 = new Autobuz("Audi");
        Autobuz autobuz2 = new Autobuz("Volvo");

        Command comanda1 = new ComandaPlecareTraseu(autobuz1, 120);
        Operator operator1 = new Operator();
        operator1.incoca(comanda1);
        operator1.incoca(new ComandaPlecareTraseu(autobuz2, 120));
        operator1.incoca(new ComandaPlecareTraseu(autobuz1, 131));
        operator1.incoca(new ComandaPlecareTraseu(autobuz1, 120));
        operator1.incoca(new ComandaPlecareTraseu(autobuz2, 131));
        operator1.incoca(new ComandaPlecareTraseu(autobuz2, 199));

        operator1.executaComanda();
        operator1.executaComanda();
        operator1.executaComanda();
        operator1.executaComanda();
        operator1.executaComanda();
        operator1.executaComanda();
        operator1.executaComanda();
        operator1.executaComanda();
    }
}
