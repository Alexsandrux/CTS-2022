package seminar3.factoryFamily;

import seminar3.Factory;
import seminar3.familie.Autobuz;
import seminar3.familie.MijlocTransport;

public class AutobuzFactory implements FactoryMethod {


    @Override
    public MijlocTransport createObject(String nrInmatriculare) {
        return new Autobuz(nrInmatriculare);
    }
}
