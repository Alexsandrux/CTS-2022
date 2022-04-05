package seminar5.main_builder_2;


import seminar5.builder_var2.AutobuzBuilder;
import seminar5.builder_var2.AutobuzLinie;

public class Program {

    public static void main(String[] args) {
        AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
        autobuzBuilder.setAreOprire(false).setNrLinie(25);

        AutobuzLinie autobuzLinie = autobuzBuilder.build();

        System.out.println(autobuzLinie);







    }

}
