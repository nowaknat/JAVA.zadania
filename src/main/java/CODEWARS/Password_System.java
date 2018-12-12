package CODEWARS;

public class Password_System {
    public static void symetria(int[] args) {
        int a = args.length;
        int b = a-1;
        int pomocnicza = 0;
        for(int i = 0; i<a/2; i++) {
            if (args[i] == args[b - i]) {
                pomocnicza = 0;
            } else {
                pomocnicza = 1;
            }
        }
            if(pomocnicza == 0){System.out.println("Hasło jest symetryczne");}
            if(pomocnicza == 1){System.out.println("Hasło nie jest symetryczne!");}

    }
}
