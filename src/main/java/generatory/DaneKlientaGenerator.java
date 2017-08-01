package generatory;

import java.util.Random;

/**
 * Created by kamil on 19.04.17.
 */
public class DaneKlientaGenerator {
    String[] kobieceImie = {"Paulina", "Zuzanna", "Anna", "Magdalena", "Beata", "Katarzyna"};
    String[] meskieImie = {"Kamil", "Bartek", "Maciej", "Wojciech", "Mariusz", "Paweł", "Igor", "Konrad", "Przemysław"};
    String[] nazwisko = {"Bolc", "Augustyniak", "Polkowski", "Pilecki", "Trzaska", "Filipkowski", "Zalewski"};
    PeselGenerator peselGenerator = new PeselGenerator();


    int plec;

    public DaneKlientaGenerator(int plec) {
        this.plec = plec;
    }

    public String imie() {
        if (plec == 0) {
            return wylosujElementZTablicy(meskieImie);
        } else if (plec == 1) {
            return wylosujElementZTablicy(kobieceImie);
        } else {
            System.out.println("WTF");
        }
        return imie();
    }

    public String nazwisko() {
        String lastName = wylosujElementZTablicy(nazwisko);
        if (plec == 1) {
            return zrobKobieceNazwisko(lastName);
        } else {
            return lastName;
        }
    }

    public String pesel(int pierwszaLiczba, int drugaLiczba) {
        if (plec == 1) {
            return peselGenerator.generujPesel(pierwszaLiczba, drugaLiczba, plec);
        } else {
            return peselGenerator.generujPesel(pierwszaLiczba, drugaLiczba, 0);
        }
    }

    private String zrobKobieceNazwisko(String lastName) {
        return lastName.replace("ski", "ska").replace("cki", "cka").replace("ły", "ła");
    }

    private String wylosujElementZTablicy(String[] array) {
        int idx = new Random().nextInt(array.length);
        return array[idx];
    }


}
