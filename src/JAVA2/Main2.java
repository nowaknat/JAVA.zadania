package JAVA2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        //ZADANIE1
        Scanner skanerMoj = new Scanner(System.in);
        System.out.println("Podaj liczbe całkowita");
        int liczba = skanerMoj.nextInt();
           if (liczba % 2 == 0) {
           System.out.println("twoja liczba jest parzysta");
       } else {
          System.out.println("twoja liczba jest nieparzysta");
        }


        //ZADANIE2
        System.out.println("Podaj liczbe całkowita");
        int liczba2 = skanerMoj.nextInt();
        int a = liczba2 % 2;
        switch (a) {
            case 1:
                System.out.println("twoja liczba jest nieparzysta");
                break;
            default:
                System.out.println("twoja liczba jest parzysta");

        }

    }
}

