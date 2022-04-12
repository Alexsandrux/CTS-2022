package seminar7.decorator.clase;

public abstract class AbstractDecorator implements Printer {
    Printer printer;

    public AbstractDecorator(Printer printer) {
        this.printer = printer;
    }

    public abstract void printeazaMesaj();

    @Override
    public void print() {
        printer.print();
    }
}
