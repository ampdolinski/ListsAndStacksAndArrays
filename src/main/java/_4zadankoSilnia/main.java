package _4zadankoSilnia;

public class main {
    public static void main(String[] args) {
        System.out.println(silnia(30));
    }

    public static long silnia(int i){

        return i == 1 ? 1 : i * silnia(i - 1);

//        if (i == 1) {
//            return 1;
//        }
//        else {
//            return (i * silnia(i - 1));
//        }
    }

}
