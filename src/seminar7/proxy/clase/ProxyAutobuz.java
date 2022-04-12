package seminar7.proxy.clase;

public class ProxyAutobuz implements MijlocTransport{
    Autobuz autobuz;

    public ProxyAutobuz(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opreste() {
        if(autobuz.getNrCalatori() == 0)
        {
            System.out.println("Autobuzul nu a oprit in statie deoarece are 0 calatori");
            return;
        }
        autobuz.opreste();

    }
}
