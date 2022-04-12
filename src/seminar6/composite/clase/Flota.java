package seminar6.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Flota implements Nod {
    private String nume;
    private List<Nod> grupuri;

    public Flota(String nume) {
        this.nume = nume;
        this.grupuri = new ArrayList<>();
    }

    @Override
    public void adaugaNod(Nod nod) throws Exception {
        grupuri.add(nod);
    }

    @Override
    public void stergeNod(Nod nod) throws Exception {
        grupuri.remove(nod);
    }

    @Override
    public Nod getNod(int index) throws Exception {
        return grupuri.get(index);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println(this.nume);
        for (Nod nod : grupuri) {
            nod.afiseazaDescriere();
        }
    }

    @Override
    public float calculeazaSumaGarantie(float pretPerLoc) {
        float suma = 0;
        for (Nod nod : grupuri) {
            suma +=  nod.calculeazaSumaGarantie(pretPerLoc);
        }

        return  suma;
    }
}
