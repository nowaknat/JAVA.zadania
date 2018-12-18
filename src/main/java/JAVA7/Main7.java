package JAVA7;

import java.util.*;

public class Main7 {
    public static void main(String[] args) {
        //tworzę listę
        List<String> lista = new ArrayList<String>();
        //dodaje elementy typu Object - czyli dowolne, u mnie ciągi znaków
        lista.add("Arek");
        lista.add("Alek");
        lista.add("Krzyś");
        lista.add("Bartek");
        lista.add("Bartek");
        lista.add("Patrycja");
        lista.add("Adrian");
        lista.add("Natlia");

        System.out.println("zad 1:");
        System.out.println("Rozmiar listy to: " + lista.size());

        //usuwam developerów
        lista.remove("Arek");
        lista.remove("Alek");
        lista.remove("Krzyś");
        lista.remove("Bartek");
        lista.remove("Bartek");

        //wyswietlam zawartość tablicy
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        System.out.println("zad 2:");
        //tworzę bazę
        Set<String> names = new TreeSet<>();
        //dodaje elementy do bazy
        names.add("Arek");
        names.add("Alek");
        names.add("Krzyś");
        names.add("Bartek");
        names.add("Bartek");
        names.add("Patrycja");
        names.add("Adrian");
        names.add("Natlia");
        //duplikuję
        for(String name: names){
            System.out.println(name + " " + name);
        }

        System.out.println("zad 3:");
        Map<Integer, Double> wartości = new TreeMap<>();
        wartości.put(12, 15.5);
        wartości.put(10, 16.4);
        wartości.put(20, 13.3);

        Set<Map.Entry<Integer, Double>> entrySet = wartości.entrySet();
        for(Map.Entry<Integer, Double> entry: entrySet){
        System.out.println(entry.getKey()+":"+entry.getValue());
       }
    }
}

