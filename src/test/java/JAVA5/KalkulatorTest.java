package JAVA5;

import org.junit.Test;

import java.io.ByteArrayInputStream;

import static junit.framework.TestCase.assertEquals;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class KalkulatorTest {

    @Test
    public void testDzielenia() {
        ByteArrayInputStream in = new ByteArrayInputStream("dzielenie".getBytes());
        System.setIn(in);

        double wynik = Kalkulator.kalkulator(5,1);
        assertEquals(5.0,wynik);

    }

    @Test
    public void testMnożenia() {
        ByteArrayInputStream in = new ByteArrayInputStream("mnożenie".getBytes());
        System.setIn(in);

        double wynik = Kalkulator.kalkulator(5,1);
        assertEquals(5.0,wynik);

    }

    @Test
    public void testOdejmowania() {
        ByteArrayInputStream in = new ByteArrayInputStream("odejmowanie".getBytes());
        System.setIn(in);

        double wynik = Kalkulator.kalkulator(5,1);
        assertEquals(4.0,wynik);

    }

    @Test
    public void testDodawania() {
        ByteArrayInputStream in = new ByteArrayInputStream("dodawanie".getBytes());
        System.setIn(in);

        double wynik = Kalkulator.kalkulator(5,1);
        assertEquals(6.0,wynik);

    }

    @Test
    public void testDzieleniaPrzezZero() {
        ByteArrayInputStream in = new ByteArrayInputStream("dzielenie".getBytes());
        System.setIn(in);
        try {
            Kalkulator.kalkulator(5, 0);
        }catch (Exception e){
            assertThat(e).isInstanceOf(DzielnikNieMożeByćZerem.class);
        }


    }
}