package seminar12testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class GetVarstaTest {
    private Persoana persoana;

    @Test
    public void getVarsta() {
        persoana = new Persoana("John", "5000101460090");
        int varsta = persoana.getVarsta();
        assertEquals(22, varsta);
    }

    @Test
    public void getVarstaRightBoundary1800() {
        persoana = new Persoana("John", "3000101460090");
        int varsta = persoana.getVarsta();
        assertEquals(222, varsta);
    }

    @Test
    public void getVarstaRightZiuaCurenta() {
        persoana = new Persoana("John", "5220546009000");
        int varsta = persoana.getVarsta();
        assertEquals(0, varsta);
    }

//    @Test(expected =  IllegalArgumentException.class)
    public void getVarstaRightZiuaUrmatoare() {
        persoana = new Persoana("John", "5220529009000");
        @SuppressWarnings("unused")
        int varsta = persoana.getVarsta();
    }

    @Test(expected = IllegalArgumentException.class)
    public void getVarstaErrorCondition2() {
        persoana = new Persoana("John", null);
        @SuppressWarnings("unused")
        int varsta= persoana.getVarsta();
    }

    @Test(timeout = 100)
    public void getVarstaPerformance() {
        persoana = new Persoana("John", "6000101263498");
        @SuppressWarnings("unused")
        int varsta= persoana.getVarsta();
    }


    @Test
    public void getVarstaOrder() {
        persoana = new Persoana("John1", "5030101263498");
        Persoana persoana2 = new Persoana("John2", "5001231263498");
        assertTrue(persoana2.getVarsta()>persoana.getVarsta());
    }
}