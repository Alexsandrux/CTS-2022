package seminar8.chain.program;


import seminar8.chain.clase.Tramvai;
import seminar8.chain.clase.TramvaiProbe;

public class program {
    public static void main(String[] args) {


        Tramvai tramvai = new Tramvai();

        tramvai.parcurgeTraseu();
        System.out.print("\n");
        tramvai.parcurgeTraseuInvers();

    }
}
