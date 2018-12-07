package JAVA4;

public class Human extends Mammal {
    protected String imię_człowieka;
    public void Ustaw_imię_człowieka(String imię_człowieka){
        this.imię_człowieka = imię_człowieka;
    }

    @Override
    public String toString() {
        return "Human{" +
                "imię_człowieka='" + imię_człowieka + '\'' +
                '}';
    }
}
