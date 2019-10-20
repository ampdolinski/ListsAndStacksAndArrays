package _8zadankoZlozonoscTablice;

import java.util.Random;

public class main {

    public static void main(String[] args) {

    }

    public static Integer [] wylosujWartosci(int rozmiarTablicy, int gornyZakres){

        Integer tablica[] = new Integer[rozmiarTablicy];
        for (int i = 0; i < rozmiarTablicy; i++) {

            int losowaWartosc = 0;
            int ilePowtorek = 0;

            if ((losowaWartosc = new Random().nextInt(gornyZakres)) % 2 == 0){
                tablica[i] = losowaWartosc;
            } else {
                ilePowtorek++;

            }
        }
        return tablica;
    }

}
