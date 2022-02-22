package sources.animal;

public class main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Prima Gradina Zoo", new IngrijitorZoo("Peter Quill"));
        Animal girafa1 = new Girafa("Girafa1");
        Animal girafa2 = new Girafa("Girafa2");
        Animal zebra1 = new Girafa("Zebra1");
        Animal zebra2 = new Girafa("Zebra2");

        zoo.adaugaAnimal(girafa1);
        zoo.adaugaAnimal(girafa2);
        zoo.adaugaAnimal(zebra1);
        zoo.adaugaAnimal(zebra2);

        zoo.hranesteAnimale();
    }
}
