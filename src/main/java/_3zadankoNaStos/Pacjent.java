package _3zadankoNaStos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Stack;

public class Pacjent {

    private Integer numer;

    private LocalDateTime czasPrzyjecia;

    private StanPacjenta stan;

//    public Integer getPriorytetStanu() {
//        return this.stan.getPriorytet();
//    }
//
//    public Pacjent(Integer numer) {
//        this.numer = numer;
//        this.czasPrzyjecia = LocalDateTime.now();
//        this.stan = StanPacjenta.wylosuj();
//    }

    public Pacjent(Integer numer, LocalDateTime czasPrzyjecia, StanPacjenta stan) {
        this.numer = numer;
        this.czasPrzyjecia = czasPrzyjecia;
        this.stan = stan;
    }

    public Integer getNumer() {
        return numer;
    }

    public void setNumer(Integer numer) {
        this.numer = numer;
    }

    public StanPacjenta getStan() {
        return stan;
    }


    public LocalDateTime getCzasPrzyjecia() {
        return czasPrzyjecia;
    }

    public void setCzasPrzyjecia(LocalDateTime czasPrzyjecia) {
        this.czasPrzyjecia = czasPrzyjecia;
    }

    public void setStan(StanPacjenta stan) {
        this.stan = stan;
    }

    public String toString() {
        return "[" + this.getNumer()
                + "], stan: [" + this.getStan()
                + "], czas rejestracji: [" +  DateTimeFormatter.ofPattern("HH:mm:ss").format(this.czasPrzyjecia) + "]";
    }
}