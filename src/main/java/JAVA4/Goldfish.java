package JAVA4;

public class Goldfish extends Fish {
    protected String imię_rybki;
    public void Ustaw_imię_rybki(String imię_rybki){
        this.imię_rybki = imię_rybki;
    }

    @Override
    public String toString() {
        return "Goldfish{" +
                "imię_rybki='" + imię_rybki + '\'' +
                '}';
    }
}
