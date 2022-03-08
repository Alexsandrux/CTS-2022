package Seminar2;

public class Elev extends Aplicant {
    private Integer clasa;
    private String tutore;


    public void setClasa(int i) {
        this.clasa = i;
    }


    public void setTutore(String tutore) {
        this.tutore = tutore;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Angajat{");
        sb.append(super.toString());
        sb.append("Clasa=").append(clasa);
        sb.append("Tutore=").append(tutore);

        return sb.toString();
    }

    public Elev() {
        super();
    }


}
