package seminar3.factoryFamily;

import seminar3.Factory;
import seminar3.familie.Autobuz;
import seminar3.familie.MijlocTransport;
import seminar3.familie.Troleibuz;

public class TroleibuzFactory implements FactoryMethod {


    @Override
    public MijlocTransport createObject(String nrInmatriculare) {
        return new Troleibuz(nrInmatriculare);
    }
}
