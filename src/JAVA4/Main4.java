package JAVA4;

public class Main4 {
    public static void main(String[] args) {

        UczeńKlasy uczeń = new UczeńKlasy();
        uczeń.Ustaw_Imię("Natalia");
        uczeń.Ustaw_nazwisko("Nowak");
        uczeń.Ustaw_pesel(95021498778L);
        uczeń.Ustaw_szkołę("LO2");
        uczeń.Ustaw_klasę("3b");

        System.out.println("Zadanie 1,2,3 sposób 1:");

        System.out.println(uczeń.zwróćImię());
        System.out.println(uczeń.zwróćNazwisko());
        System.out.println(uczeń.zwróćPesel());
        System.out.println(uczeń.zwróćSzkołę());
        System.out.println(uczeń.zwrócKlasę());

        System.out.println("Zadanie 1,2,3 sposób 2:");

        System.out.println(uczeń);

        System.out.println("Zadanie 4:");

        Goldfish ryba1 = new Goldfish();
        ryba1.Ustaw_imię_rybki("Nemo");
        System.out.println(ryba1);
        Human człowiek1 = new Human();
        człowiek1.Ustaw_imię_człowieka("Natalia");
        System.out.println(człowiek1);
    }
}

