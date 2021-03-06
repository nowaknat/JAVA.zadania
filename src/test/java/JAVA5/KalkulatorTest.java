package JAVA5;

import org.junit.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Parameters;

import java.io.ByteArrayInputStream;

import static junit.framework.TestCase.assertEquals;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class KalkulatorTest {
    @Parameters({"liczba"})
    @Test
    public void testDzielenia(int liczba) {
        ByteArrayInputStream in = new ByteArrayInputStream("dzielenie".getBytes());
        System.setIn(in);

        double wynik = Kalkulator.kalkulator(liczba,1);
        AssertJUnit.assertEquals(5.0,wynik);

    }

    @Test
    public void testMnożenia(int liczba) {
        ByteArrayInputStream in = new ByteArrayInputStream("mnożenie".getBytes());
        System.setIn(in);

        double wynik = Kalkulator.kalkulator(liczba,1);
        assertEquals(5.0,wynik);

    }

    @Test
    public void testOdejmowania(int liczba) {
        ByteArrayInputStream in = new ByteArrayInputStream("odejmowanie".getBytes());
        System.setIn(in);

        double wynik = Kalkulator.kalkulator(liczba,1);
        assertEquals(4.0,wynik);

    }

    @Test
    public void testDodawania(int liczba) {
        ByteArrayInputStream in = new ByteArrayInputStream("dodawanie".getBytes());
        System.setIn(in);

        double wynik = Kalkulator.kalkulator(liczba,1);
        assertEquals(6.0,wynik);

    }

    @Test
    public void testDzieleniaPrzezZero(int liczba) {
        ByteArrayInputStream in = new ByteArrayInputStream("dzielenie".getBytes());
        System.setIn(in);
        try {
            Kalkulator.kalkulator(liczba, 0);
        }catch (Exception e){
            assertThat(e).isInstanceOf(DzielnikNieMożeByćZerem.class);
        }
    }
}