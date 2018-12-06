package JAVA5;

public class Zaokrąglanie {
    public static void zaokrąglanie(double liczba){

        System.out.println("ZADANIE 2:");
        System.out.println("Podaj liczbę rzeczywistą - zaokrąglę ją:");
        System.out.println(liczba);
        double a = (int) liczba;
        if ( liczba - a >= 0.5 ){
            System.out.println(a + 1);
        }
        if ( liczba - a <= -0.5){
            System.out.println(a-1);
        }
       if ( liczba - a > -0.5 && liczba - a < 0.5 ){
            System.out.println(a);
       }
    }
}
