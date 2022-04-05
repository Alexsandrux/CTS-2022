package seminar5.builder.clase;

public class AutobuzLinie {
    private int nrLinie;
    private String numeSofer;
    private boolean deschideUsile;
    private boolean areOprire;
    private String testRulat;
    private String model;
    private int numarCalatori;

    public AutobuzLinie() {
        this.nrLinie = 1;
        this.numeSofer = "Sofer";
        this.deschideUsile = true;
        this.areOprire = true;
        this.testRulat = "Text Rulat";
        this.model = "Model autobuz";
        this.numarCalatori = 20;
    }

    public void setNrLinie(int nrLinie) {
        this.nrLinie = nrLinie;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public void setDeschideUsile(boolean deschideUsile) {
        this.deschideUsile = deschideUsile;
    }

    public void setAreOprire(boolean areOprire) {
        this.areOprire = areOprire;
    }

    public void setTestRulat(String testRulat) {
        this.testRulat = testRulat;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumarCalatori(int numarCalatori) {
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
