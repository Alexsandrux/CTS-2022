package seminar3.factoryFamily;

import seminar3.Factory;
import seminar3.familie.Autobuz;
import seminar3.familie.MijlocTransport;
import seminar3.familie.Tramvai;

public class TramvaiFactory implements FactoryMethod {


    @Override
    public MijlocTransport createObject(String nrInmatriculare) {
        return new Tramvai(nrInmatriculare);
    }
}
