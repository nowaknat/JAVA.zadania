package JAVA3;

public class Dogs {
    String rasa; //POLA OBIEKTÓW - zad 1
    int wiek;
    String imię;
    String kolor;

    public Dogs() {
    }

    public Dogs(String rasa, int wiek, String imię, String kolor) { //konstruktor - zad 2
        this.rasa = rasa;
        this.kolor = kolor;
        this.wiek = wiek;
        this.imię = imię;
    }

    public void info() { //zad 3
        System.out.println(imię + ", " + wiek + ", " + kolor + ", " + rasa);
    }

    public int wiekpsa() {
        return wiek;
    }

    public int aktualizacja(int wiekNowy) {
        if (wiekNowy > 0) {
            wiek = wiekNowy;
        }
        return wiek;
    }
}

