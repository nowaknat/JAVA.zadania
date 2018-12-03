package JAVA4;

public class Main4 {
    public static void main(String[] args) {

        UczeńKlasy uczeń = new UczeńKlasy();
        uczeń.Ustaw_Imię("Natalia");
        uczeń.Ustaw_nazwisko("Nowak");
        uczeń.Ustaw_pesel(95021498778L);
        uczeń.Ustaw_szkołę("LO2");
        uczeń.Ustaw_klasę("3b");

        System.out.println(uczeń.zwróćImię());
        System.out.println(uczeń.zwróćNazwisko());
        System.out.println(uczeń.zwróćPesel());
        System.out.println(uczeń.zwróćSzkołę());
        System.out.println(uczeń.zwrócKlasę());
    }
}

