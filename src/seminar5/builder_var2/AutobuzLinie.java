package seminar5.builder_var2;

public class AutobuzLinie {
    private int nrLinie;
    private String numeSofer;
    private boolean deschideUsile;
    private boolean areOprire;
    private String testRulat;
    private String model;
    private int numarCalatori;

    public AutobuzLinie(int nrLinie, String numeSofer, boolean deschideUsile, boolean areOprire, String testRulat, String model, int numarCalatori) {
        this.nrLinie = nrLinie;
        this.numeSofer = numeSofer;
        this.deschideUsile = deschideUsile;
        this.areOprire = areOprire;
        this.testRulat = testRulat;
        this.model = model;
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
