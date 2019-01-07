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

        System.out.println("_______________________________");
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
        names.add("Natalia");
        //duplikuję
        for(String name: names){
            System.out.println(name + " " + name);
        }

        System.out.println("_______________________________");
        System.out.println("zad 3:");
        Map<Integer, Double> wartości = new TreeMap<>();
        wartości.put(12, 15.5);
        wartości.put(10, 16.4);
        wartości.put(20, 13.3);

        Set<Integer> keySet = wartości.keySet();
        System.out.println("Klucze:\n" + keySet);
        Collection<Double> values = wartości.values();
        System.out.println("Wartości:\n" + values);

        Set<Map.Entry<Integer, Double>> entrySet = wartości.entrySet();
        for(Map.Entry<Integer, Double> entry: entrySet){
        System.out.println(entry.getKey()+":"+entry.getValue());
       }

        System.out.println("_______________________________");
        System.out.println("zad 4:");
        Map<Integer, Map<Integer, Double>> nowe_wartości= new TreeMap<>();
        nowe_wartości.put(100, wartości);
        nowe_wartości.put(101, wartości);
        nowe_wartości.put(102, wartości);
        System.out.println(nowe_wartości);

        System.out.println("__________________________________________________________________________");
        System.out.println("zad 5:");

        Set<Integer> nowe_keySet = nowe_wartości.keySet();
        System.out.println("Wewnętrzne klucze:\n" + nowe_keySet);

        Integer nowe_klucze[] = new Integer[nowe_wartości.size()];
        nowe_wartości.keySet().toArray(nowe_klucze);

        Integer klucze[] = new Integer[wartości.size()];
        wartości.keySet().toArray(klucze);
        System.out.println(Arrays.toString(klucze));

        Double values2[] = new Double[nowe_wartości.size()];
        wartości.values().toArray(values2);
        System.out.println(Arrays.toString(values2));

        Map<Integer, Double> wartości2 = new TreeMap<>();
        for(int a=0; a<wartości.size(); a++){
            wartości2.put(nowe_klucze[a], values2[a]);
        }

        Set<Map.Entry<Integer, Double>> entrySet2 = wartości2.entrySet();
        for(Map.Entry<Integer, Double> entry: entrySet2){
            System.out.println(entry);
        }

        Map<Integer, Map<Integer, Double>> nowe_wartości2= new TreeMap<>();
        for(int a=0; a<wartości.size(); a++){
            nowe_wartości2.put(klucze[a], wartości2);
        }

        Set<Map.Entry<Integer, Map<Integer, Double>>> entrySet3 = nowe_wartości2.entrySet();
        for(Map.Entry<Integer, Map<Integer, Double>> entry: entrySet3){
            System.out.println(entry);
        }
        }
    }


