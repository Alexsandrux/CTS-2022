package seminar3.familie;

public class Autobuz extends  MijlocTransport{

    public Autobuz(String nrImatriculare) {
        super(nrImatriculare);
    }

    @Override
    public String toString() {
        return "Autobuz " + nrImatriculare;
    }
}
