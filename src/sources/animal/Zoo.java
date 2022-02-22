package sources.animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String nume;
    private IngrijitorZoo ingrijitorZoo;
    private List<Animal> animale;

    public Zoo(String nume, IngrijitorZoo ingrijitorZoo) {
        this.nume = nume;
        this.ingrijitorZoo = ingrijitorZoo;
        this.animale = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public IngrijitorZoo getIngrijitorZoo() {
        return ingrijitorZoo;
    }

    public void setIngrijitorZoo(IngrijitorZoo ingrijitorZoo) {
        this.ingrijitorZoo = ingrijitorZoo;
    }

    public List<Animal> getAnimale() {
        return animale;
    }

    public void adaugaAnimal(Animal animal) {
        animale.add(animal);
    }

    public void hranesteAnimale() {
        for (Animal a : animale) {
            ingrijitorZoo.hranesteAnimal(a, "fan");
        }
    }

}
