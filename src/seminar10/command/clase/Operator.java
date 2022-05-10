package seminar10.command.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Command> comenzi;

    public Operator() {
        this.comenzi = new ArrayList<>();
    }

    public void incoca(Command comanda) {
        comenzi.add(comanda);
    }

    public void executaComanda() {
        if(comenzi.size() > 0)
        {
            comenzi.get(0).execute();
            comenzi.remove(0);
        }
        else {
            System.out.println("Nu mai exista comenzi de executat!!!");
        }
    }
}
