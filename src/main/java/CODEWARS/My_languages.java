package CODEWARS;

import java.util.*;
import java.lang.*;

public class My_languages {
    public static void languages() {
        Map<String, Integer> mapa_languages = new TreeMap<>();
        mapa_languages.put("Java", 67);
        mapa_languages.put("Python", 40);
        mapa_languages.put("SQL", 30);
        mapa_languages.put("C++", 70);
        mapa_languages.put("C", 62);
        System.out.println();
        System.out.println("To wszystkie testy: " + mapa_languages);

        Collection<Integer> values = mapa_languages.values();
        System.out.println("Wartości jako obiekty:\n" + values);

        Set<String> keySety = mapa_languages.keySet();
        System.out.println("Wewnętrzne klucze:\n" + keySety);

        Set<Map.Entry<String,Integer>> keySet = mapa_languages.entrySet();
        List<String> keyList = new ArrayList<>();

        for(Map.Entry var : keySet){
           if((int) var.getValue() > 60){
                keyList.add((String) var.getKey());
            }
        }
        System.out.println("Moja lista: " + keyList);
    }
}
