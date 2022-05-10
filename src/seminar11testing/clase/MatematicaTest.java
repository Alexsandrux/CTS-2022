package seminar11testing.clase;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatematicaTest {


    @Test
    public void testeazaSuma()
    {
        Matematica matematica = new Matematica();
        int rezObtinut =  matematica.suma(1, 2);
        assertEquals(3, rezObtinut);
    }

    @Test
    public  void testeazaRaport() throws Exception {
        Matematica matematica = new Matematica();
        double rezultatObtinut = matematica.raport(24, 6);
        assertEquals(4, rezultatObtinut, 0.001);
    }

    @Test
    public void testRaportShoudlTrowException() {
        try {
            Matematica matematica = new Matematica();
            matematica.raport(1, 0);
            fail("Nu trebuie sa ajunga aici");
        }catch (IllegalArgumentException e)
        {
            e.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}