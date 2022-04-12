package seminar7.strategy.clase;

public class Validator {

    ModalitatePlata metodaPlata;
    private float pretBilet;

    public Validator(ModalitatePlata metodaPlata, float pretBilet) {
        this.metodaPlata = metodaPlata;
        this.pretBilet = pretBilet;
    }

    public void setMetodaPlata(ModalitatePlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void plasteCalatorie()
    {
        metodaPlata.plateste(this.pretBilet);
    }
}
