package seminar7.decorator.program;


import seminar6.facade.clase.Autobuz;
import seminar6.facade.clase.Facade;
import seminar7.decorator.clase.AbstractDecorator;
import seminar7.decorator.clase.Decorator;
import seminar7.decorator.clase.Printer;
import seminar7.decorator.clase.PrinterBilet;

public class Program {
    public static void main(String[] args) {
        Printer printer = new PrinterBilet();
        printer.print();


        AbstractDecorator decorator = new Decorator(printer, "La multi ani");
        System.out.println("Decorator: ");
        decorator.print();
        decorator.printeazaMesaj();

    }
}
