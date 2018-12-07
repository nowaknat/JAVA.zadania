package JAVA5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Kalkulator {
    public static double kalkulator(double a, double b) {
        Scanner skanerMoj = new Scanner(System.in);
        System.out.println("Wpisz działanie: dodawanie, odejmowanie, mnożenie lub dzielenie");
        String działanie = skanerMoj.next();
        switch (działanie) {
            case "dodawanie":
                System.out.println(a + b);
                return a + b;

            case "odejmowanie":
                System.out.println(a - b);
                return a - b;

            case "mnożenie":
                System.out.println(a * b);
                return a * b;

            case "dzielenie":
                System.out.println(a / b);
                try {
                    if (b == 0)
                        throw new DzielnikNieMożeByćZerem("DzielnikNieMożeByćZerem");

                } catch (DzielnikNieMożeByćZerem e) {
                    System.out.println("Nie dziel przez zero");
                }
                if (b != 0) {
                    return a / b;
                }
        }
        return 0;
    }
}
