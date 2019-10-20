package _2zadankoNaStos;

public class main {
    public static void main(String[] args) {

        Guma guma1 = new Guma(Smak.cytrynowa);
        Guma guma2 = new Guma(Smak.jagodowa);
        Guma guma3 = new Guma(Smak.arbuzowa);
        Guma guma4 = new Guma(Smak.malinowa);
        Guma guma5 = new Guma(Smak.pomaranczowa);

        Tuba<Guma> tubaGum = new Tuba<>();

        tubaGum.dodajElement(guma1);
        tubaGum.dodajElement(guma2);
        tubaGum.dodajElement(guma3);
        tubaGum.dodajElement(guma4);
        tubaGum.wyciagnijElement();
        tubaGum.wyciagnijElement();
        tubaGum.wyciagnijElement();
        tubaGum.dodajElement(guma5);
        tubaGum.wyciagnijElement();
        tubaGum.wyciagnijElement();

    }
}
