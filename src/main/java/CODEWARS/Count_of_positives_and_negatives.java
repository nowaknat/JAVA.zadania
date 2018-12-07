package CODEWARS;

//SUMUJE DODATNIE I UJEMNE

public class Count_of_positives_and_negatives {
    public static int countOfPositivesAndNegatives(int[] args) {
        int n = 0;
        int p = 0;
       // Arrays.sort(args);
        for (int i = 0; i < args.length; i++) {
            if (args[i] < 0) {
                n = n + args[i];
            }
            if (args[i] > 0) {
                p = p + args[i];
            }
        }
        System.out.println("suma negatywnych: " + n);
        System.out.println("suma pozytywnych:" + p);
    return 0;
    }
}