package animal;

public class IngrijitorZoo {
    private String nume;

    public IngrijitorZoo(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "IngrijitorZoo{" +
                "nume='" + nume + '\'' +
                '}';
    }

    public void hranesteAnimal(Animal animal, String mancare) {
        animal.mananca(mancare);
    }
}
