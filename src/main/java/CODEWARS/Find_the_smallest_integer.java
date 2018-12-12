package CODEWARS;

// SZUKA NAJMNIEJSZEJ W TABELI

import java.util.Arrays;

public class Find_the_smallest_integer {

    public static int findSmallestInt(int[] args) {
        Arrays.sort(args);
       // System.out.println(args);
      //  System.out.println(args[0]);
    return args[0];
    }
}
