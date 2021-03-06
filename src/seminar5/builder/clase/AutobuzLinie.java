package seminar5.builder.clase;

public class AutobuzLinie {
    private int nrLinie;
    private String numeSofer;
    private boolean deschideUsile;
    private boolean areOprire;
    private String testRulat;
    private String model;
    private int numarCalatori;

    AutobuzLinie() {
        this.nrLinie = 1;
        this.numeSofer = "Sofer";
        this.deschideUsile = true;
        this.areOprire = true;
        this.testRulat = "Text Rulat";
        this.model = "Model autobuz";
        this.numarCalatori = 20;
    }

    void setNrLinie(int nrLinie) {
        this.nrLinie = nrLinie;
    }

    void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    void setDeschideUsile(boolean deschideUsile) {
        this.deschideUsile = deschideUsile;
    }

    void setAreOprire(boolean areOprire) {
        this.areOprire = areOprire;
    }

    void setTestRulat(String testRulat) {
        this.testRulat = testRulat;
    }

    void setModel(String model) {
        this.model = model;
    }

    void setNumarCalatori(int numarCalatori) {
        this.numarCalatori = numarCalatori;
    }

    @Override
    public String toString() {
        return "AutobuzLinie{" +
                "nrLinie=" + nrLinie +
                ", numeSofer='" + numeSofer + '\'' +
                ", deschideUsile=" + deschideUsile +
                ", areOprire=" + areOprire +
                ", testRulat='" + testRulat + '\'' +
                ", model='" + model + '\'' +
                ", numarCalatori=" + numarCalatori +
                '}';
    }
}
