package CODEWARS;

import java.util.Arrays;

public class Counting_sheeps {
    public static int liczenie(String args[]){
        Arrays.sort(args);
        int a = 0;
        for (int i=0; i < args.length; i++){
            if (args[i].equals( "true" )){
               a = a +1;}}
                System.out.println("owieczek jest: " + (a));

        return 0;}
       }


