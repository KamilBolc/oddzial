import generatory.DaneKlientaGenerator;
import page.CRM2.WidokKlienta.WidokKlientaPage;
import pomoc.UzupelnijDaneWnioskuPomoc;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by kamil on 11.04.17.
 */
public class NowyKlientPR5 extends MainTest {
    public int plec = 1;
    UzupelnijDaneWnioskuPomoc uzupelnijDaneWnioskuPomoc = new UzupelnijDaneWnioskuPomoc();
    DaneKlientaGenerator daneKlientaGenerator = new DaneKlientaGenerator(plec);

    @BeforeMethod
    public void stworzKlienta() {
        uzupelnijDaneWnioskuPomoc.wejdzIStworzNowyWniosek(driver)
                .nowyWniosek1WygenerujIWpiszPesel(8, 1, plec, driver)
                .nowyWniosek2InformacjaOKwocie("1500", "Pożyczka Ratalna 5", "Białystok", 1, driver)
                .nowyWniosek3DaneKlienta(daneKlientaGenerator.imie(), daneKlientaGenerator.nazwisko(), "Dariusz", "Beata", "Nowak", "AAA111111", driver)
                .nowyWniose4kAdresy("07-401", 2, liczba(), liczba(), 1, driver)
                .nowyWniosek5Telefony("792217557", "111111111", "222222222", "Kamil@kamil.pl", driver)
                .nowyWniosek6DaneUzupelniajace("2", driver)
                .nowyWniosek7Oswiadczenia(driver)
                .nowyWniosek8Dochody(2, 2, "2015-04-04", "3500", "15", 1, driver)
                .nowyWniosek9Wydatki("500", driver)
                .nowyWniosek10Skany(driver)
                .nowyWniosek11Oferta(driver)
                .nowyWniosek12PrzygotowanieUmowy(driver)
                .nowyWniosek13PodpisanieUmowy(driver);
    }

    @Test
    public void splacMKS() {
        WidokKlientaPage widokKlientaPage = new WidokKlientaPage(driver);
        widokKlientaPage.MKSWezWartość();
    }


}
