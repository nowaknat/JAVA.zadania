package JAVA4;

public class Uczeń_metody {
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

    public long getPesel(){
        return pesel;
    }
    public String getNazwisko(){
        return nazwisko;
    }
    public String getImię(){
        return imię;
    }

}
