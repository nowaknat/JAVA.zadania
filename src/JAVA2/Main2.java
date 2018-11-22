package JAVA2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        //ZADANIE1
        Scanner skanerMoj = new Scanner(System.in);
        System.out.println("ZADANIE 1:");
        System.out.println("Podaj liczbę całkowitą");
        int liczba = skanerMoj.nextInt();
           if (liczba % 2 == 0) {
           System.out.println("twoja liczba jest parzysta");
       } else {
          System.out.println("twoja liczba jest nieparzysta");
        }


        //ZADANIE2
        System.out.println("ZADANIE 2:");
        System.out.println("Podaj liczbę całkowitą");
        int liczba2 = skanerMoj.nextInt();
        int a = liczba2 % 2;
        switch (a) {
            case 1:
                System.out.println("twoja liczba jest nieparzysta");
                break;
            default:
                System.out.println("twoja liczba jest parzysta");
                        }

        //ZADANIE4
        System.out.println("ZADANIE 4:");

        int c =0;
        int d = 0;
        do { System.out.println("Podaj liczbę całkowitą");
            int liczba4 = skanerMoj.nextInt();
            c = liczba4 ;
            d = d + c;
            }
        while (c !=0);


        if (c == 0){
            System.out.println("suma twoich liczb to: ");
            System.out.println(d);}


        //ZADANIE5
        System.out.println("ZADANIE 5:");
        System.out.println("Podaj liczbę całkowitą");
        int liczba3 = skanerMoj.nextInt();
        if (liczba3 >= 1 && liczba3 <=10){
            System.out.println("twoja liczba należy do przedziału <1,10>");}
        else {
            System.out.println("twoja liczba nie należy do przedziału <1,10>");}


       //ZADANIE6
         System.out.println("ZADANIE 6:");

        int b =0;
            do { System.out.println("Podaj liczbę całkowitą");
                int liczba4 = skanerMoj.nextInt();
                b = liczba4 ; }
        while (b !=0 && b !=5);
        if (b == 0){
            System.out.println("zakończono, bo podałeś 0");}
        if (b == 5) {
        System.out.println("zakończono, bo podałeś 5") ; }


        //ZADANIE7
        System.out.println("ZADANIE 7:");
        System.out.println("Podaj liczbę całkowitą");
        int liczba5 = skanerMoj.nextInt();
        while (liczba5 %2 == 0){
            System.out.println("twoja liczba jest parzysta");
            break;
        }
        while (liczba5 %2 == 1){
            System.out.println("twoja liczba jest nieparzysta");
            break;
        }

    }
}

