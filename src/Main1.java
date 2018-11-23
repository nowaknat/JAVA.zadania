package JAVA1;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        System.out.println("Poczatek");

        //ZADANIE 1
        System.out.println("Hello World!");

        //ZADANIE 2
        System.out.println("Natalia 23");

        //ZADANIE 3 KALENDARZ (dwie opcje)

        System.out.println(LocalDate.now());

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));


        //ZADANIE 4 KALKULATOR
        Scanner skanerMoj = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        double liczba1 = skanerMoj.nextDouble();
        System.out.println("Podaj druga liczbe");
        double liczba2 = skanerMoj.nextDouble();
        System.out.println(liczba1 + liczba2);
        System.out.println(liczba1 - liczba2);
        System.out.println(liczba1 * liczba2);

        //ZADANIE 5
        System.out.println("Podaj liczbe calkowita");
        int liczba3 = skanerMoj.nextInt();
        System.out.println(liczba3 * liczba3);

        //ZADANIE 6 TABLICA
        int[] table = {12, 12, 5, 4, 6, 6, 7, 9};

        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i]);
        }


        }
    }

