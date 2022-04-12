package seminar7.strategy.program;


import seminar7.strategy.clase.PlataCardBancar;
import seminar7.strategy.clase.PlataSms;
import seminar7.strategy.clase.Validator;

public class Program {
    public static void main(String[] args) {


        Validator validator = new Validator(new PlataCardBancar(), 4);
        validator.plasteCalatorie();

        validator.setMetodaPlata(new PlataSms());
        validator.plasteCalatorie();

    }
}
