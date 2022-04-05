package seminar5.prototype.clase;

public class Autobuz implements MijlocTransport {
    private String numeSofer;

    public Autobuz(String sofer) {
        this.numeSofer = sofer;
    }

    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException {
        return (MijlocTransport) super.clone();
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "sofer='" + numeSofer + '\'' +
                '}';
    }
}
