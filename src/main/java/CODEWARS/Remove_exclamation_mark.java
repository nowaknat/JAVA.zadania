package CODEWARS;

public class Remove_exclamation_mark {
    public static void usuwanieWykrzyknika(String word) {
        String[] ary = word.split("");
        for(int i=0; i<ary.length; i++){
            if(!ary[i].equals("!")){
                System.out.println(ary[i]);
            }
        }

    }
}
