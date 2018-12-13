package CODEWARS;

public class Hero_root {
    public static double pierwiastek(int n, double x) {
        int e =1;
        double stała = x;
        int licznik = 0;
        do{
            x=(x+n/x)/2;
            licznik=licznik+1;
        }
        while(x-stała<e);
        System.out.println("pierwiastek z twojej liczby: " + (int) x);
        return licznik;}
    }

