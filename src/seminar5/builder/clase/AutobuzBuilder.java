package seminar5.builder.clase;

public class AutobuzBuilder implements Builder {
    AutobuzLinie autobuzLinie;

    public  AutobuzBuilder() {
        this.autobuzLinie = new AutobuzLinie();
    }

    @Override
    public AutobuzLinie build() {
        return autobuzLinie;
    }

    public AutobuzBuilder setNrLinie(int nrLinie) {
        autobuzLinie.setNrLinie(nrLinie);
        return this;
    }

    public AutobuzBuilder setNumeSofer(String numeSofer) {
        autobuzLinie.setNumeSofer(numeSofer);
        return this;
    }

    public AutobuzBuilder setDeschideUsile(boolean deschideUsile) {
        autobuzLinie.setDeschideUsile(deschideUsile);
        return this;
    }

    public AutobuzBuilder setAreOprire(boolean areOprire) {
        autobuzLinie.setAreOprire(areOprire);
        return this;
    }

    public AutobuzBuilder setTestRulat(String testRulat) {
        autobuzLinie.setTestRulat(testRulat);
        return this;
    }

    public AutobuzBuilder setModel(String model) {
        autobuzLinie.setModel(model);
        return this;
    }

    public AutobuzBuilder setNumarCalatori(int numarCalatori) {
        autobuzLinie.setNumarCalatori(numarCalatori);
        return this;
    }
}
