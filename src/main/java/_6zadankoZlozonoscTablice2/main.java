package _6zadankoZlozonoscTablice2;

import java.util.Random;

public class main {

    public static void main(String[] args) {

        Integer tabliczka[] = wylosuj(10, 10);

        System.out.println(tabliczka);

        pozycja(tabliczka);

    }

    public static Integer [] wylosuj(int rozmiarTablicy, int gornyZakres){

        Integer tablica[] = new Integer[rozmiarTablicy];
        for (int i = 0; i < rozmiarTablicy; i++) {
            tablica[i] = new Random().nextInt(gornyZakres);
        }
        return tablica;
    }


    public static Integer pozycja(Integer tablica[]){

        int pozycja = 0;

        for (int i = 0; i < tablica.length; i++) {
            if (tablica[pozycja] < tablica[i]) {
                pozycja = i;
            }
        }
        return pozycja;
    }

}
