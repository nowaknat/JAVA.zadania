package JAVA4;

public class UczeńSzkoły extends Uczen {
    // ta klasa ma dziedziczyc z klasu Uczeń, zawiera dodatkowe pole: Nazwa_szkoły, zawiera dodatkową metodę: Ustaw_szkołę, gdzie użytkownik może wstawić nazwę szkoły
    protected String nazwa_szkoły;
    public void Ustaw_szkołę(String nazwa_szkoły){
        this.nazwa_szkoły = nazwa_szkoły;
    }

    public String zwróćSzkołę(){
        return nazwa_szkoły;
    }

}
