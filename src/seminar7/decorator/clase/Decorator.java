package seminar7.decorator.clase;

public class Decorator extends  AbstractDecorator{
    private String mesaj;

    public Decorator(Printer printer, String mesaj) {
        super(printer);
        this.mesaj = mesaj;
    }

    @Override
    public void printeazaMesaj()
    {
        printer.print();
        System.out.println(this.mesaj);
    }



}
