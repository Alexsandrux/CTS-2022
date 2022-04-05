package seminar5.builder_var2;


public class AutobuzBuilder implements Builder {
    private int nrLinie;
    private String numeSofer;
    private boolean deschideUsile;
    private boolean areOprire;
    private String testRulat;
    private String model;
    private int numarCalatori;


    @Override
    public AutobuzLinie build() {
        return new AutobuzLinie(this.nrLinie, this.numeSofer, this.deschideUsile, this.areOprire, this.testRulat, this.model, this.numarCalatori);
    }

    public AutobuzBuilder() {
        this.nrLinie = 1;
        this.numeSofer = "Sofer";
        this.deschideUsile = true;
        this.areOprire = true;
        this.testRulat = "Text Rulat";
        this.model = "Model autobuz";
        this.numarCalatori = 20;
    }

    public AutobuzBuilder setNrLinie(int nrLinie) {
        this.nrLinie = nrLinie;
        return this;
    }

    public AutobuzBuilder setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
        return this;
    }

    public AutobuzBuilder setDeschideUsile(boolean deschideUsile) {
        this.deschideUsile = deschideUsile;
        return this;
    }

    public AutobuzBuilder setAreOprire(boolean areOprire) {
        this.areOprire = areOprire;
        return this;
    }

    public AutobuzBuilder setTestRulat(String testRulat) {
        this.testRulat = testRulat;
        return this;
    }

    public AutobuzBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public AutobuzBuilder setNumarCalatori(int numarCalatori) {
        this.numarCalatori = numarCalatori;
        return this;
    }
}
