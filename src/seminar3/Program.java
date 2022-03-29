package seminar3;

import seminar3.factoryFamily.AutobuzFactory;
import seminar3.factoryFamily.FactoryMethod;
import seminar3.familie.MijlocTransport;
import seminar3.familie.TipTransport;

public class Program {

    public static void main(String[] args) {
//        Singleton obiect = Singleton.getInstance();
//        Singleton obiect2 = Singleton.getInstance();
//        System.out.println(obiect);
//        System.out.println(obiect2);

//        Factory factory = new Factory();
//        MijlocTransport autobuz1 = factory.createObject(TipTransport.AUTOBUZ, "a1");
//        MijlocTransport tramvai1 = factory.createObject(TipTransport.TRAMVAI, "t1");
//        MijlocTransport troleibuz1 = factory.createObject(TipTransport.TROILEIBUZ, "tro1");
//
//
//        System.out.println(autobuz1);
//        System.out.println(tramvai1);
//        System.out.println(troleibuz1);

        FactoryMethod factoryMethod = new AutobuzFactory();
        MijlocTransport autobuz = factoryMethod.createObject("a2");
        factoryMethod = new AutobuzFactory();
        MijlocTransport tramvai = factoryMethod.createObject("t2");
        factoryMethod = new AutobuzFactory();
        MijlocTransport troleibuz = factoryMethod.createObject("tro2");

        System.out.println(autobuz);
        System.out.println(tramvai);
        System.out.println(troleibuz);
    }

}
