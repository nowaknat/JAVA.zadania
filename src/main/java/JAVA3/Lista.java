package JAVA3;

public class Lista {

    int[] tablica = new int[15];
    int rozmiar;


    public void dodawanie(int nr) {
        tablica[rozmiar] = nr;
        rozmiar++;
    }

    public void wyświetlanie() {
        System.out.println("To jest twoja tablica:");
        for (int i = 0; i < rozmiar; i++) {
            System.out.println(tablica[i]);
        }
    }

    public void usuwanie(int x) {
        int d = x + 1;
        System.out.println("To jest tablica z usuniętym elementem nr: " + d);
        for (int i = 0; i < rozmiar; i++) {
            if (i == x) {
                tablica[i] = tablica[i + 1];
            }

            if (i > x) {
                tablica[i] = tablica[i + 1];
               }
         }
        rozmiar = rozmiar - 1;
        for (int i = 0; i < rozmiar; i++) {
            System.out.println(tablica[i]);
        }
    }

    public void szukanie(int y) {
        System.out.println("Sprawdzę, czy element: " + y + " jest w tablicy:");
        int pomocnik = 0;
        for (int i = 0; i < rozmiar; i++) {
            if (tablica[i] == y) {
                System.out.println("Element " + y + " jest w tablicy");
                pomocnik = 1;
            }
        }
        if (pomocnik == 0) {
            System.out.println("Elementu " + y + " nie ma w tablicy");
        }
    }


    public void duplikaty() { //troszke oszukany sposób - działa tylko jeśli z góry określam rozmiar
        System.out.println("To jest tablica z usuniętymi duplikatami:");
        for (int i = 0; i < rozmiar; i++) {
            for (int z = 0; z < rozmiar; z++) {
                if (i != z && tablica[i] == tablica[z]) {
                    for (int t =z; t<rozmiar; t++) {
                        tablica[t] = tablica [t+1];
                    }
//                    tablica[z] = tablica[z+1];
//                    tablica[z+1] = tablica[z+2];
//                    tablica[z+2] = tablica[z+3];
//                    tablica[z+3] = tablica[z+4];

                    rozmiar = rozmiar -1;

                }
            }
        }
    }
}

