package seminar7.strategy.clase;

public class PlataSms implements ModalitatePlata{


    @Override
    public void plateste(float sumaPlatita) {
        System.out.println("Plata de " + sumaPlatita +  " lei a fost facuta cu telefonul prin SMS");
    }
}
