package generatory;

import java.util.Random;

/**
 * Created by kamil on 11.04.17.
 */
public class PeselGenerator {

    public String generujPesel(int pierwszaLiczbaRokuUrodzenia, int drugaLiczbaRokuUrodzenia, int plec) {
        if (!(plec != 0 || plec != 1)) {
            System.out.println("Błędna wartość płci. Poprawne wartosci to 1 kobieta 0 meszczyzna a podana to " + plec);
            System.exit(0);
        }
        int a = pierwszaLiczbaRokuUrodzenia;
        int b = drugaLiczbaRokuUrodzenia;
        int c = 1;
        int d = Math.abs(new Random().nextInt() % 2);
        int e = Math.abs(new Random().nextInt() % 3);
        int f = Math.abs(new Random().nextInt() % 10);
        int g = Math.abs(new Random().nextInt() % 10);
        int h = Math.abs(new Random().nextInt() % 10);
        int i = Math.abs(new Random().nextInt() % 10);
        int j;

        do {
            j = Math.abs(new Random().nextInt() % 10);
        } while (j % 2 == plec);


        int sum = 1 * a + 3 * b + 7 * c + 9 * d + 1 * e + 3 * f + 7 * g + 9 * h + 1 * i + 3 * j;

        int mod = sum % 10;

        int lastChar = (10 - mod) % 10;

        String pesel = String.valueOf(a) + String.valueOf(b) + String.valueOf(c) + String.valueOf(d) + String.valueOf(e) + String.valueOf(f) + String.valueOf(g) + String.valueOf(h) + String.valueOf(i) + String.valueOf(j) + String.valueOf(lastChar);
        System.out.println("pesel: " + pesel);
        return pesel;
    }
}
