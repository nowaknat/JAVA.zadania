package CODEWARS;

public class Remove_first_and_last_character {
    public static String usuwanieLiter(String word){

        // pierwszy sposób:
        String[] ary = word.split("");
        for(int i=1; i<ary.length-1; i++){
            System.out.println(ary[i]);
            }
         //drugi sposób:

        String a = word.substring(1, word.length()-1);
        return a;
    }
}
