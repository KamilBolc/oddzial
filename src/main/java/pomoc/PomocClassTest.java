package pomoc;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

/**
 * Created by kamil on 09.11.16.
 */
abstract public class PomocClassTest {

    public void nadpiszZawartoscPola(WebElement pole, String daneDoUzupelnienia) {
        // czekajAzElementBedzieDoKlikniecia(pole,driver);
        pole.sendKeys(Keys.LEFT_CONTROL + "a");
        pole.sendKeys(daneDoUzupelnienia);
    }

    protected void ustawWartoscWSelect(WebElement nazwa_pola, int wartosc_wybrana) {
        Select select = new Select(nazwa_pola);
        select.selectByIndex(wartosc_wybrana);
    }

    public String losowyNumerTelefonu() {
        Random random = new Random();
        int a = random.nextInt(4);
        int b = random.nextInt(4);
        int c = random.nextInt(4);
        int d = random.nextInt(4);
        int e = random.nextInt(4);
        int f = random.nextInt(4);
        int g = random.nextInt(4);
        int h = random.nextInt(4);
        int i = random.nextInt(4);

        return Integer.toString(a) + Integer.toString(b) + Integer.toString(c) + Integer.toString(d) + Integer.toString(e)
                + Integer.toString(f) + Integer.toString(g) + Integer.toString(h) + Integer.toString(i);
    }

    public double zaokraglanieLiczb(double liczbaDoZaokraglenia, int iloscMiejscPoPrzecinku) {
        java.text.NumberFormat nf = java.text.NumberFormat.getInstance();
        nf.setMaximumFractionDigits(iloscMiejscPoPrzecinku);
        nf.setMinimumFractionDigits(iloscMiejscPoPrzecinku);
        return Double.parseDouble((nf.format(liczbaDoZaokraglenia)).replaceAll(",", ".").replaceAll(" ", ""));
    }

    public String liczba() {
        Random random = new Random();
        int a = random.nextInt(100);
        String liczba = String.valueOf(a);
        return liczba;
    }
}
