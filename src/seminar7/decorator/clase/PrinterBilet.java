package seminar7.decorator.clase;

public class PrinterBilet implements Printer {
    @Override
    public void print() {
        System.out.println("Mesaj bilet");
    }
}
