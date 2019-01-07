package CODEWARS;

import java.util.Scanner;

public class Banjo {
    public static void banjo(String imię) {
        Scanner skaner = new Scanner(System.in);
        imię = skaner.next();
        String[] ary = imię.split("");
        if(ary[0].equals("N") || ary[0].equals("n")){
            String a = imię.substring(1);
            System.out.println(a);
        }
        else{
            System.out.println(imię);
        }
        }
}
