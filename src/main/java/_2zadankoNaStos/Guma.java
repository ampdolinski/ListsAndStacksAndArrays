package _2zadankoNaStos;

public class Guma {

    private Smak smak;

    public Guma(Smak smak) {
        this.smak = smak;
    }

    public Smak getSmak() {
        return smak;
    }

    public void setSmak(Smak smak) {
        this.smak = smak;
    }

    @Override
    public String toString() {
        return smak.name();
    }
}
