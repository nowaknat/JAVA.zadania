package CODEWARS;

public class DNA_to_RNA {
    public static void konwersja(String[] args) {


        for (int i = 0; i < args.length; i++) {
            if(args[i].equals("T")){
                args[i] = "U";
            }
        }
        System.out.println("Oto RNA:");
        for (String item : args) {
            System.out.println(item);

    }
}}
