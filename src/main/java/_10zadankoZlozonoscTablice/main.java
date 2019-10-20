package _10zadankoZlozonoscTablice;

public class main {

    public static void main(String[] args) {

        Integer tabliczka[] = {5, 3, 2, 4};
        System.out.println(tabliczka[0]);
        System.out.println(tabliczka[1]);
        System.out.println(tabliczka[2]);
        System.out.println(tabliczka[3]);
        System.out.println();

        sortowanieBabelkowe(tabliczka);
        System.out.println(tabliczka[0]);
        System.out.println(tabliczka[1]);
        System.out.println(tabliczka[2]);
        System.out.println(tabliczka[3]);

    }


    public static void sortowanieBabelkowe(Integer tablica[]) {

        for (int j = 0; j < tablica.length; j++) {
            for (int i = 0; i < tablica.length - 1 - j; i++) {
                if (tablica[i] > tablica[i + 1]) {
                    int zapamietaj = tablica[i];
                    tablica[i] = tablica[i + 1];
                    tablica[i + 1] = zapamietaj;
                }
            }

        }

    }

}


