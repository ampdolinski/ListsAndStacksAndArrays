package _7zadankoZlozonoscTablice3;

import java.util.Random;

public class main {

    public static void main(String[] args) {

        Integer tabliczka[] = wylosuj(4, 10);

        System.out.println(tabliczka[0]);
        System.out.println(tabliczka[1]);
        System.out.println(tabliczka[2]);
        System.out.println(tabliczka[3]);

        System.out.println(mnozenie(tabliczka));

    }

    public static Integer [] wylosuj(int rozmiarTablicy, int gornyZakres){

        Integer tablica[] = new Integer[rozmiarTablicy];
        for (int i = 0; i < rozmiarTablicy; i++) {
            tablica[i] = new Random().nextInt(gornyZakres);
        }
        return tablica;
    }


    public static Integer mnozenie(Integer tablica[]){

        int suma = 0;

        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica.length; j++) {
                suma = suma + tablica[i] * tablica[j];
            }
        }
        return suma;
    }

}
