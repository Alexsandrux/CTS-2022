package seminar8.template.program;


import seminar8.template.clase.Tramvai;

public class program {
    public static void main(String[] args) {


        Tramvai tramvai = new Tramvai();

        tramvai.parcurgeTraseu();
        System.out.print("\n");
        tramvai.parcurgeTraseuInvers();

    }
}
