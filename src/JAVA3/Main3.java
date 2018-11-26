package JAVA3;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main3 {
    public static void main(String[] args) {

        //ZADANIE 1
        System.out.println("Zadanie 1:");
        Dogs dog1 = new Dogs();
        dog1.imię = "burek";
        dog1.wiek = 3;
        dog1.rasa = "pudel";
        dog1.kolor = "czarny";
        System.out.println(dog1.imię + ", " + dog1.kolor + ", " + dog1.wiek + " lata, " + dog1.rasa);

        //ZADANIE 2
        System.out.println("Zadanie 2:");
        Dogs dog2 = new Dogs("Owczarek", 12, "Lola", "zielony");
        System.out.println(dog2.imię+ ", " + dog2.rasa + ", " +dog2.wiek + ", " + dog2.kolor);


        //ZADANIE 3 i 5
        System.out.println("Zadanie 3 i 5:");
        dog2.info();
        System.out.println(dog2.wiekpsa());
        dog2.aktualizacja(5);
        System.out.println(dog2.wiekpsa());


        //ZADANIE 4
        System.out.println("Zadanie 4:");
        Dogs[] array1 = {dog1,dog2};
        for(Dogs i : array1) { //działam na obiektach typu Dogs, dla każdego argumentu i z tablicy array1
            i.info();
        }

        //ZADANIE 6
        System.out.println("Zadanie 6:");
        Lista lista = new Lista(); //lista to obiekt (tak jak dog1)
        lista.dodawanie(4);
        lista.dodawanie(5);
        lista.dodawanie(5);
        lista.dodawanie(6);
        lista.dodawanie(7);
        lista.dodawanie(5);
        lista.duplikaty();
        lista.wyświetlanie();

        }




    }
