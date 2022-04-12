package seminar6.adapter.clase.autobuz;

public class ValidatorAutobuz implements ValidatorTerestru {

    @Override
    public void validareAbonament() {
        System.out.println("Am validat abonamentul autobuz");
    }

    @Override
    public void validareBilet() {
        System.out.println("Am validat biletul autobuz");
    }
}
