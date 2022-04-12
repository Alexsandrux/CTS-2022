package seminar6.composite.clase;

public class Autobuz implements Nod {
    private String producator;
    private String model;
    private int numarLocuri;

    public Autobuz(String producator, String model, int numarLocuri) {
        this.producator = producator;
        this.model = model;
        this.numarLocuri = numarLocuri;
    }

    @Override
    public void adaugaNod(Nod nod) throws Exception {
        throw new Exception("Nu se poate implementa");
    }

    @Override
    public void stergeNod(Nod nod) throws Exception {
        throw new Exception("Nu se poate implementa");

    }

    @Override
    public Nod getNod(int index) throws Exception {
        throw new Exception("Nu se poate implementa");
    }

    @Override
    public void afiseazaDescriere() {
        this.toString();
    }

    @Override
    public float calculeazaSumaGarantie(float pretPerLoc) {
        return numarLocuri * pretPerLoc;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "producator='" + producator + '\'' +
                ", model='" + model + '\'' +
                ", numarLocuri=" + numarLocuri +
                '}';
    }
}
