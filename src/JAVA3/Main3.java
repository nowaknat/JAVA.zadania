package JAVA3;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main3 {
    public static void main(String[] args) {

        //ZADANIE 1
        System.out.println("Oto zadanie 1:");
        Dogs dog1 = new Dogs();
        dog1.imię="burek";
        dog1.wiek=3;
        dog1.rasa="pudel";
        dog1.kolor="czarny";
        System.out.println(dog1.imię+", "+dog1.kolor);
    }
}
