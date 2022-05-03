package seminar9.memento.program;

import seminar9.memento.clase.*;

public class Program {
    public static void main(String[] args)
    {
        Autobuz autobuz=new Autobuz("John",11.7,21,"AUDI",2011);
        System.out.println(autobuz.toString());

        ManagerAutobuze manager=new ManagerAutobuze();
        manager.addMemento(autobuz.creeazaMemento());
        autobuz.setNumeSofer("Johnny");
        autobuz.setConsumMediu(18.6);
        manager.addMemento(autobuz.creeazaMemento());

        System.out.println(autobuz.toString());
        autobuz.restaurareMemento(manager.getMemento(0));
        System.out.println(autobuz.toString());


    }
}
