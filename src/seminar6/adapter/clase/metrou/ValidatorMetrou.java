package seminar6.adapter.clase.metrou;

public class ValidatorMetrou implements ValidatorSubteran{
    @Override
    public void validareAbonament() {
        System.out.println("Am validat abonamentul metrou");
    }

    @Override
    public void validareBilet() {
        System.out.println("Am validat biletul metrou");
    }
}
