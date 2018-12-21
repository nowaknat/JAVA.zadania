package CODEWARS;

public class Hero_root {
    public static int pierwiastek(int n, int x) {
        int e =1;
        //double stała = x;
        int licznik = 0;
        int previous_x;
        do{ previous_x = x;
            x=(x+n/x)/2;
            licznik=licznik+1;
            System.out.println(x);
        }
        while(x- previous_x >= e);
        System.out.println("pierwiastek z twojej liczby: " + x);
        return licznik;}
    }

