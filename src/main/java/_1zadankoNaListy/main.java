package _1zadankoNaListy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        List<Integer> listaArray = new ArrayList<Integer>();
        wypelnij(10000000, listaArray);

        List<Integer> listaLinked = new LinkedList<Integer>();
        wypelnij(10000000, listaLinked);

        pobierz10zesrodka(10, listaArray);
        pobierz10zesrodka(10, listaLinked);

        dodaj10dosrodka(10, listaArray);
        dodaj10dosrodka(10, listaLinked);

        dodaj10napoczatek(10, listaArray);
        dodaj10napoczatek(10, listaLinked);

    }

    public static void wypelnij(int rozmiar, List<Integer> lista) {
        System.out.println();
        System.out.println("wypełniam " + lista.getClass().getSimpleName());
        final long start = System.currentTimeMillis();
        for (int i = 0; i < rozmiar; i++) {
            lista.add(i);
        }
        final long end = System.currentTimeMillis();
        System.out.println("wypełniłem");
        System.out.println("czas wypełnienia = " + (end - start));
    }

    public static void pobierz10zesrodka(int ile, List<Integer> lista){
        System.out.println();
        System.out.println("pobieram");
        final long start = System.currentTimeMillis();
        for (int i = ((lista.size() - ile) / 2); i < ((lista.size() + ile) / 2); i++) {
            System.out.println(lista.get(i));
        }
        final long end = System.currentTimeMillis();
        System.out.println("pobrałem");
        System.out.println("czas pobrania = " + (end - start));
    }

    public static void dodaj10dosrodka(int ile, List<Integer> lista){
        System.out.println();
        System.out.println("dodaję w środku");
        final long start = System.currentTimeMillis();

        for (int i = (lista.size() / 2); i < ((lista.size() / 2) + ile); i++) {
            lista.add(i, 1);
            System.out.println(lista.get(i));
            }

        final long end = System.currentTimeMillis();
        System.out.println("dodałem w środku");
        System.out.println("czas dodania = " + (end - start));
    }

    public static void dodaj10napoczatek(int ile, List<Integer> lista){
        System.out.println();
        System.out.println("dodaję na początku");
        final long start = System.currentTimeMillis();

        for (int i = 0; i < ile; i++) {
            lista.add(i, 1);
            System.out.println(lista.get(i));
        }

        final long end = System.currentTimeMillis();
        System.out.println("dodałem na początku");
        System.out.println("czas dodania = " + (end - start));
    }

}
