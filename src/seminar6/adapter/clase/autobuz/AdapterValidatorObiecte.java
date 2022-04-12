package seminar6.adapter.clase.autobuz;

import seminar6.adapter.clase.metrou.ValidatorMetrou;

public class AdapterValidatorObiecte implements ValidatorTerestru{

    private ValidatorMetrou validatorMetrou;

    public AdapterValidatorObiecte(ValidatorMetrou validatorMetrou) {
        this.validatorMetrou = validatorMetrou;
    }

    @Override
    public void validareAbonament() {
        validatorMetrou.validareAbonament();
    }

    @Override
    public void validareBilet() {
        validatorMetrou.validareBilet();
    }
}
