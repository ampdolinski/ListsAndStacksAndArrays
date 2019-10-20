package _5zadankoZlozonoscTablice1;

import java.util.Random;

public class main {
    public static void main(String[] args) {

        sumowanie(wylosuj(10, 10));

    }

    public static Integer [] wylosuj(int rozmiarTablicy, int gornyZakres){

        Integer tablica[] = new Integer[rozmiarTablicy];
        for (int i = 0; i < rozmiarTablicy; i++) {
            tablica[i] = new Random().nextInt(gornyZakres);
            }
        return tablica;
    }


    public static Integer sumowanie(Integer tablica[]){

        int suma = 0;

        for (int i = 0; i < tablica.length; i++) {
            suma = suma + tablica[i];

        }
        return suma;
    }

}
