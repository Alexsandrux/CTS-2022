package seminar7.proxy.program;


import seminar7.proxy.clase.Autobuz;
import seminar7.proxy.clase.MijlocTransport;
import seminar7.proxy.clase.ProxyAutobuz;

public class Program {
    public static void main(String[] args) {
        MijlocTransport autobuz1 = new Autobuz("Sofer1", 20, 3);
        autobuz1.opreste();

        MijlocTransport autobuz2 = new Autobuz("Sofer2", 20, 0);


        ProxyAutobuz proxy = new ProxyAutobuz((Autobuz) autobuz2);
        proxy.opreste();

    }
}
