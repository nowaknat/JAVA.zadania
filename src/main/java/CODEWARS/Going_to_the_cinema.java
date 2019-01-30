package CODEWARS;

public class Going_to_the_cinema {
    public static double zwrot(int card, int ticket, double perc) {
int SystemA = 0;
double SystemB;
double platnosc = 0;
        for(int i=1; SystemA<platnosc+card; i++){
            SystemA = ticket * i;
            platnosc = ticket * perc * (1-Math.pow(perc, i))/(1-perc) ;
            if(SystemA>platnosc+card){
                System.out.println("trzeba kupić tyle biletów, żeby sie opłacało: "+i);
            }
        }
        SystemB = 500 + platnosc - ticket;
        System.out.println(SystemA);
        System.out.println(SystemB);
    return 0;}
}
