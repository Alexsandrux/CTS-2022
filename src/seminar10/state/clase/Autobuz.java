package seminar10.state.clase;

public class Autobuz {
    private Stare stare;
    private int nrAutobuz;

    public Autobuz(int nrAutobuz) {
        this.stare = new LaCapatDeLinie();
        this.nrAutobuz = nrAutobuz;
    }

    protected void setStare(Stare stare) {
        this.stare = stare;
    }

    public Stare getStare() {
        return stare;
    }

    public int getNrAutobuz() {
        return nrAutobuz;
    }

    public void pleacaInCursa() {
        new InCursa().actualizareStare(this);
    }

    public void intraInService() {
        new LaReparat().actualizareStare(this);
    }

    public void ieseDinService() {
        new LaCapatDeLinie().actualizareStare(this);
    }

    public void ajungeLaCapatDeLinie() {
        new LaCapatDeLinie().actualizareStare(this);
    }
}
