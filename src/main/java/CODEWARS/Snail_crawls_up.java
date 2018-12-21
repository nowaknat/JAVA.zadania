package CODEWARS;

public class Snail_crawls_up {
    public static void czołganie(int wysokośćSłupa, int wDzień, int wNoc) {
       int a = wDzień;
        int ileDni = 1;

        while (wDzień<wysokośćSłupa){
            wDzień = wDzień + a - wNoc;
            ileDni = ileDni + 1;
        }
        System.out.println("Slimak potrzebuje tyle dni: " + ileDni);
    }
}
