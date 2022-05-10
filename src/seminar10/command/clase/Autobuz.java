package seminar10.command.clase;

public class Autobuz {
    private String model;

    public Autobuz(String model) {
        this.model = model;
    }

    public void pleacaInCursa(int nrLinie) {
        System.out.printf("Autobuzul cu modelulul %s pleaca pe linia %d\n", this.model, nrLinie);
    }


}
