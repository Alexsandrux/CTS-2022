package seminar5.prototype.clase;

public class Tramvai implements MijlocTransport {
    private String numeVatman;

    public Tramvai(String vatman) {
        this.numeVatman = vatman;
    }

    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException {
        return (MijlocTransport) super.clone();
    }

    @Override
    public String toString() {
        return "Tramvai{" +
                "vatman='" + numeVatman + '\'' +
                '}';
    }
}
