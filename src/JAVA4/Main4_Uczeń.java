package JAVA4;

public class Main4_Uczeń {
    public static void main(String[] args) {
        Uczeń_metody uczen1 = new Uczeń_metody();

        System.out.println("Zadanie 1:");
        uczen1.Ustaw_Imię("Natalia");
        uczen1.Ustaw_nazwisko("Nowak");
        uczen1.Ustaw_pesel(93222111111L);
        System.out.println(uczen1.getPesel());
        System.out.println(uczen1.getImię());
        System.out.println(uczen1.getNazwisko());
    }
}
