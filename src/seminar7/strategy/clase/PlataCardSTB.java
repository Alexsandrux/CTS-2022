package seminar7.strategy.clase;

public class PlataCardSTB implements ModalitatePlata{

    @Override
    public void plateste(float sumaPlatita) {
        System.out.println("Plata de " + sumaPlatita +  " lei a fost facuta cu cardul STB");
    }
}
