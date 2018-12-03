package JAVA4;

public class Uczen {
    protected long pesel;  //protected trzeba robic, żeby potem można było generate "toString" : prawy przycisk -> generate -> toString -> zaznaczyć co
    protected String imię;
    protected String nazwisko;

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
    }

