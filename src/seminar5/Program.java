package seminar5;


import seminar5.builder.clase.AutobuzBuilder;
import seminar5.builder.clase.AutobuzLinie;
import seminar5.prototype.clase.Autobuz;
import seminar5.prototype.clase.MijlocTransport;
import seminar5.prototype.clase.Tramvai;

public class Program {

    public static void main(String[] args) {
//        MijlocTransport autobuz1 = new Autobuz("Sofer1");
//        MijlocTransport tramvai1 = new Tramvai("Vatman1");
//        MijlocTransport tramvai2 = null;
//        try{
//            tramvai2 = tramvai1.copiaza();
//        }
//        catch (CloneNotSupportedException e)
//        {
//            e.fillInStackTrace();
//        }
//
//        System.out.println(tramvai2.toString());
//        System.out.println(autobuz1.toString());
//        System.out.println(tramvai1.toString());


        AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
        AutobuzLinie autobuzLinie1 = autobuzBuilder.build();

        System.out.println(autobuzLinie1);

        autobuzBuilder.setTestRulat("Redducere!");
        AutobuzLinie autobuzLinie2 = autobuzBuilder.build();
        System.out.println(autobuzLinie2);








    }

}
