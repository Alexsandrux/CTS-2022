package Seminar2;

public class Student extends Aplicant {
    protected String facultate;
    protected Integer an_studii;


    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }


    public void setAn_studii(Integer an_studii) {
        this.an_studii = an_studii;
    }


    public Student() {
        super();

    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Angajat{");
        sb.append(super.toString());
        sb.append("Facultaet=").append(facultate);
        sb.append("An_studii=").append(an_studii);

        return sb.toString();
    }

}
