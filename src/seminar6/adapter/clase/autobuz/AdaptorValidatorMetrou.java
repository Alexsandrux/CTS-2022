package seminar6.adapter.clase.autobuz;

import seminar6.adapter.clase.metrou.ValidatorMetrou;
import seminar6.adapter.clase.metrou.ValidatorSubteran;

public class AdaptorValidatorMetrou extends ValidatorMetrou implements ValidatorTerestru {

    @Override
    public void validareBilet() {
        super.validareBilet();
    }
}
