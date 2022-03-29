package seminar3.familie;

public class Tramvai extends  MijlocTransport{

    public Tramvai(String nrImatriculare) {
        super(nrImatriculare);
    }

    @Override
    public String toString() {
        return "Tramvai " + nrImatriculare;
    }
}
