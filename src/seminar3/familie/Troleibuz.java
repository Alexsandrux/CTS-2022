package seminar3.familie;

public class Troleibuz extends  MijlocTransport{

    public Troleibuz(String nrImatriculare) {
        super(nrImatriculare);
    }

    @Override
    public String toString() {
        return "Troleibuz " + nrImatriculare;
    }
}
