package CODEWARS;

import java.util.*;

public class Bingo {
    public static void bingo() { //usuwa duplikaty - świetny sposób
        int pomocnicza =0;
        int rozmiar = 10;
        int[] table = new int[rozmiar];
        for (int i = 0; i < rozmiar; i++) {
            Random losowa = new Random();
            table[i] = losowa.nextInt(26) + 1;}
        System.out.println("rozmiar: " + rozmiar);
        System.out.println(Arrays.toString(table));
        for (int i = 0; i < rozmiar; i++) {
            for (int z = 0; z < rozmiar; z++) {
                if (i != z && table[i] == table[z]) {
                    for (int t =z; t<rozmiar-1; t++) {
                        table[t] = table [t+1];
                    }
                    rozmiar = rozmiar -1;
                }
            }
        }
        System.out.println("rozmiar: " + rozmiar);
        int[] table2 = new int[rozmiar];
        for(int i=0; i<rozmiar; i++){
            table2[i]=table[i];
        }
        System.out.println(Arrays.toString(table2));
        for (int i = 0; i < rozmiar; i++){
            if(table[i] == 2 || table[i] == 9 || table[i] == 14 || table[i] == 7 || table[i] == 15){
                pomocnicza++;
            }
        }
        System.out.println("pomocnicza: " +pomocnicza);
            if(pomocnicza == 5){
                System.out.println("tak");}
            else{
                System.out.println("nie");}
    }}

