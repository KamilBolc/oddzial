package pomoc;

import generatory.DaneKlientaGenerator;
import org.openqa.selenium.WebDriver;
import page.CRM2.KlienciPage;
import page.OddzialPlusPage.MainPage;
import page.OddzialPlusPage.NowyWniosekPage.*;
import pomoc.dochody.UmowaOPrace;
import pomoc.encje.OddzialPlusWniosekEncjaCase1;

/**
 * Created by kamil on 21.06.17.
 */
public class UzupelnijDaneWnioskuOddzialPlusPomoc extends PomocClassTest {

    public UzupelnijDaneWnioskuOddzialPlusPomoc uzupelnijDaneWnioskuAdmin(OddzialPlusWniosekEncjaCase1 oddzialPlusWniosekEncjaCase1, WebDriver driver) {
        wejscieNowyWniosekOddzialPlus(driver);
        uzupelnienieDanychKlienta(oddzialPlusWniosekEncjaCase1.getPlec(), driver);
        uzupelnienieDanychAdresowych(oddzialPlusWniosekEncjaCase1.getKodPocztowy(), driver);
        uzupelnienieDanychKontaktowych(driver);
        uzupelnienieDanychUzupelniajacych(oddzialPlusWniosekEncjaCase1.getLiczbaDzieci(), driver);
        uzupelnienieDanychFormaWyplaty(driver);
        uzupelnienieDanychDochodowych(driver);
        wyslanieWniosku(driver);
        return this;
    }

    public UzupelnijDaneWnioskuOddzialPlusPomoc uzupelnijDaneWnioskuDk(OddzialPlusWniosekEncjaCase1 oddzialPlusWniosekEncjaCase1, WebDriver driver) {
        wejscieNowyWniosekOddzialPlus(driver);
        uzupelnienieDanychKlientaDk(oddzialPlusWniosekEncjaCase1.getPlec(), driver);
        uzupelnienieDanychAdresowych(oddzialPlusWniosekEncjaCase1.getKodPocztowy(), driver);
        uzupelnienieDanychKontaktowych(driver);
        uzupelnienieDanychUzupelniajacych(oddzialPlusWniosekEncjaCase1.getLiczbaDzieci(), driver);
        uzupelnienieDanychFormaWyplaty(driver);
        uzupelnienieDanychDochodowych(driver);
        wyslanieWniosku(driver);
        return this;
    }

    public void wyslanieWniosku(WebDriver driver) {
        NowyWniosek7Page nowyWniosek7Page = new NowyWniosek7Page(driver);
        nowyWniosek7Page.wyslijKlik();
    }

    public void uzupelnienieDanychDochodowych(WebDriver driver) {
        UmowaOPrace uop = new UmowaOPrace(driver);
        uop.uruchomUzupelnianiePolDochodu();
        NowyWniosek6Page nowyWniosek6Page = new NowyWniosek6Page(driver);
        nowyWniosek6Page.wydatkiIZobowiazaniaKredytoweWpisz("100", "100")
                .kontynuujKlik();
    }

    public void uzupelnienieDanychFormaWyplaty(WebDriver driver) {
        NowyWniosek5Page nowyWniosek5Page = new NowyWniosek5Page(driver);
        nowyWniosek5Page.formaWyplatyWybierz()
                .kontynuujKlik();
    }

    public void uzupelnienieDanychUzupelniajacych(String liczbaDzieci, WebDriver driver) {
        NowyWniosek4Page nowyWniosek4Page = new NowyWniosek4Page(driver);
        nowyWniosek4Page.wyksztalcenieWybierz()
                .stanCywilnyWybierz()
                .liczbaDzieciWpisz(liczbaDzieci)
                .kontynuujKlik();
    }

    public void uzupelnienieDanychKontaktowych(WebDriver driver) {
        NowyWniosek3Page nowyWniosek3Page = new NowyWniosek3Page(driver);
        nowyWniosek3Page.telefonKontaktowyWpisz("487987789")
                .telefonStacjonarnyWpisz("789654123")
                .emailWpisz("kamil.bolc@gg.pl")
                .kontynuujKlik();
    }

    public void uzupelnienieDanychAdresowych(String kodPocztowy, WebDriver driver) {
        NowyWniosek2Page nowyWniosek2Page = new NowyWniosek2Page(driver);
        nowyWniosek2Page.kodPocztowyWpisz(kodPocztowy)
                .miejscowoscWybierz()
                .ulicaWybierz()
                .numerBudynkuWpisz(liczba())
                .numerLokaluWpisz(liczba())
                .rodzajNieruchomosciWybierz()
                .statusWlascicielskiWybierz()
                .okresZamieszkaniaWybierz()
                .kontynuujKlik();
    }

    public void uzupelnienieDanychKlienta(int plec, WebDriver driver) {
        DaneKlientaGenerator daneKlientaGenerator = new DaneKlientaGenerator(plec);
        NowyWniosek1Page nowyWniosek1Page = new NowyWniosek1Page(driver);
        nowyWniosek1Page.oddzialWybierz()
                .peselWpisz(daneKlientaGenerator.pesel(6, 1))
                .imieWpisz(daneKlientaGenerator.imie())
                .nazwiskoWpisz(daneKlientaGenerator.nazwisko())
                .numerTelefonuKomWpisz("792217557")
                .numerDowoduOsobistego("AAA111111")
                .dowodBezterminowyKlik()
                .telewizjaKlik()
                .skadSieDowiedzialWybierz()
                .zaznaczZgodyWszystkieKlik()
                .wydrukujOswiadczeniaKlik()
                .zamknijOswiadczenia()
                .kontynuujKlik();
    }

    public void uzupelnienieDanychKlientaDk(int plec, WebDriver driver) {
        DaneKlientaGenerator daneKlientaGenerator = new DaneKlientaGenerator(plec);
        NowyWniosek1Page nowyWniosek1Page = new NowyWniosek1Page(driver);
        nowyWniosek1Page
                .peselWpisz(daneKlientaGenerator.pesel(6, 2))
                .imieWpisz(daneKlientaGenerator.imie())
                .nazwiskoWpisz(daneKlientaGenerator.nazwisko())
                .numerTelefonuKomWpisz("792217557")
                .numerDowoduOsobistego("AAA111111")
                .dowodBezterminowyKlik()
                .telewizjaKlik()
                .skadSieDowiedzialEspritWybierz()
                .zaznaczZgodyWszystkieKlik()
                .wydrukujOswiadczeniaKlik()
                .zamknijOswiadczenia()
                .kontynuujKlik();
    }

    public void wejscieNowyWniosekOddzialPlus(WebDriver driver) {
        MainPage mainPage = new MainPage(driver);
        mainPage.nowyWniosekKlik();
    }

    public void wejscieNaOddzialPlusPrzezCRM2(WebDriver driver) {
        KlienciPage klienciPage = new KlienciPage(driver);
        klienciPage.klienciKlik()
                .platformaOddzialPlusKlik();
    }

}
