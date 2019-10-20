package _11zadankoZlozonoscTablice;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        Integer tabliczka[] = {5, 3, 2, 4};
        System.out.println(tabliczka[0]);
        System.out.println(tabliczka[1]);
        System.out.println(tabliczka[2]);
        System.out.println(tabliczka[3]);
        System.out.println();

        wstawianie(tabliczka);
        System.out.println(tabliczka[0]);
        System.out.println(tabliczka[1]);
        System.out.println(tabliczka[2]);
        System.out.println(tabliczka[3]);

    }

    public static void wstawianie(Integer tablica[]) {
        for (int i = 1; i < tablica.length; i++) {
            int klucz = tablica[i];

            int indeksDoSprawdzenia = i - 1;

            while (indeksDoSprawdzenia > -1) {
                if (klucz < tablica[indeksDoSprawdzenia]) {
                    tablica[indeksDoSprawdzenia + 1] = tablica[indeksDoSprawdzenia];
                    tablica[indeksDoSprawdzenia] = klucz;
                } else {
                    break;
                }
                indeksDoSprawdzenia--;
                            }

        }

    }

    public static void sortowaniePrzezWstawianie(Integer tablica[]) {

        int klucz;


//        for (int j = 0; j < tablica.length; j++) {
//            for (int i = 1; i < tablica.length - 1; i++) {
//                if (tablica[i] < tablica[i - 1]) {
//                    int zapamietaj = tablica[i];
//                    tablica[i-1] = tablica[i];
//                    tablica[i] = zapamietaj;
//                }

    }
}