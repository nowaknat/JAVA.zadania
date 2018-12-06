package JAVA5;

public class Main5 {
    public static void main(String[] args) {
        //zadanie 1
        int a;
        a = 5;
        double b;
        b = 4;
        double bnowe;
        String c;
       // c = "mama";
        short d;
        d = 5;
        byte e;
        short g;

        bnowe = a;
        a = (int) b;

        e = (byte) d;
        g = e;

      //  int y = Integer.parseInt(c);
        c = String.valueOf(a);
        System.out.println(bnowe);
        System.out.println(c);
        System.out.println(g);
      //  System.out.println(y);

        //zadanie 2
        Zaokrąglanie.zaokrąglanie(5.2);
    }
}
