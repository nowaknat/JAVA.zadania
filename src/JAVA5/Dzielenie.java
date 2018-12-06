package JAVA5;

public class Dzielenie {
    public static double dzielenie(int dzielna, int dzielnik) throws IllegalArgumentException {
        double c = (double) dzielna/dzielnik;
        System.out.println("wynik dzielenia to: " );


if (dzielnik == 0){
    throw new IllegalArgumentException("b nie może być zerem");
}
        return c; }
}
