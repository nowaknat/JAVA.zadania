package JAVA5;

import java.util.Scanner;

public class Zaokrąglanie {
    public static void zaokrąglanie(double liczba){

        System.out.println("ZADANIE 2:");
        System.out.println("Podaj liczbę rzeczywistą - zaokrąglę ją:");
        double a = (int) liczba;
        if ( liczba - a >= 0.5){
            System.out.println(a + 1);
        }
        else {
            System.out.println(a);}


    }
}
