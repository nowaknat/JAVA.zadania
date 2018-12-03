package JAVA4;

public class Uczen {
    private long pesel;
    private String imię;
    private String nazwisko;

    public void Ustaw_Imię(String imię) {
        this.imię=imię;
    }
    public void Ustaw_nazwisko(String nazwisko) {
        this.nazwisko=nazwisko;
    }
    public void Ustaw_pesel(long pesel) {
        this.pesel=pesel;
    }


    public String zwróćImię(){
        return imię;
    }
    public String zwróćNazwisko(){
        return nazwisko;
    }
    public long zwróćPesel(){
        return pesel;
    }

//    @Override
//    public String toString() {
//        return "Uczen{" +
//                "pesel=" + pesel +
//                ", imię='" + imię + '\'' +
//                ", nazwisko='" + nazwisko + '\'' +
//                '}';
    }

