package JAVA4;

public class UczeńKlasy extends UczeńSzkoły {
    // ta klasa ma dziedziczyc z UczeńSzkoły, zawiera dodatkowe pole: klasa, zawiera dodatkową metodę: Ustaw_klasę, gdzie użytkownik może wstawić numer klasy

    private String nazwa_klasy;


    public void Ustaw_klasę(String nazwa_klasy){
        this.nazwa_klasy = nazwa_klasy;
    }

    public String zwrócKlasę(){
        return nazwa_klasy;
    }

    @Override
    public String toString() {
        return "UczeńKlasy{" +
                "nazwa_klasy='" + nazwa_klasy + '\'' +
                ", nazwa_szkoły='" + nazwa_szkoły + '\'' +
                ", pesel=" + pesel +
                ", imię='" + imię + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }

//PYTANIE: GDZIE MAM WPISAĆ DANE(IMIE, NAZWISKO, SZKOŁĘ I KLASĘ). MYŚLĘ, ZE TU, TYLKO JAK?

}
