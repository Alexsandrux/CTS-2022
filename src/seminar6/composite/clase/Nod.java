package seminar6.composite.clase;

public interface Nod {
    void adaugaNod(Nod nod) throws Exception;

    void stergeNod(Nod nod)  throws Exception;

    Nod getNod(int index)  throws Exception;

    void afiseazaDescriere();

    float calculeazaSumaGarantie(float pretPerLoc);
}
