package OddzialPlusTest;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import page.CRM2.LogowaniePage;
import page.OddzialPlusPage.NowyWniosekPage.DochodyPage.AlimentyPage;
import page.OddzialPlusPage.NowyWniosekPage.DochodyPage.DzialalnoscGospodarczaPage;
import page.OddzialPlusPage.NowyWniosekPage.DochodyPage.EmeryturaPage;
import page.OddzialPlusPage.NowyWniosekPage.DochodyPage.UmowaOPracePage;
import page.OddzialPlusPage.NowyWniosekPage.*;
import pomoc.UzupelnijDaneWnioskuOddzialPlusPomoc;
import pomoc.dochody.*;

/**
 * Created by kamil on 06.07.17.
 */

public class WymaganePolaOddzialPlusTest extends MainOddzialPlusTest {
    UzupelnijDaneWnioskuOddzialPlusPomoc uzupelnij = new UzupelnijDaneWnioskuOddzialPlusPomoc();

    @Test
    public void czyWymaganePolaSaPilnowanePrzezApi() {
        zalogujSieJakoAdmin();
        uzupelnij.wejscieNaOddzialPlusPrzezCRM2(driver);
        uzupelnij.wejscieNowyWniosekOddzialPlus(driver);
        CzySaWymaganePolaNaPierwszymKroku(uzupelnij);
        CzySaWymaganePolaNaDrugimKroku(uzupelnij);
        CzySaWymaganePolaNaTrzecimKroku(uzupelnij);
        CzySaWymaganePolaNaCzwartymKroku(uzupelnij);
        CzySaWymaganePolaNaPiatymKroku(uzupelnij);
        CzySaWymaganePolaNaSzostymKroku(uzupelnij);
    }

    @Test
    public void czyWymaganePolaSaPilnowaneWDochodach() {
        zalogujSieJakoAdmin();
        uzupelnij.wejscieNaOddzialPlusPrzezCRM2(driver);
        uzupelnij.wejscieNowyWniosekOddzialPlus(driver);
        uzupelnij.uzupelnienieDanychKlienta(2, driver);
        uzupelnij.uzupelnienieDanychAdresowych("65-012", driver);
        uzupelnij.uzupelnienieDanychKontaktowych(driver);
        uzupelnij.uzupelnienieDanychUzupelniajacych("2", driver);
        uzupelnij.uzupelnienieDanychFormaWyplaty(driver);
        czySaWymaganePolaWDochodzieEmerytura();
        czySaWymaganePolaWDochodzieAlimenty();
        czySaWymaganePolaWDochodzieDzialalnoscGospodarcza();
        czySaWymaganePolaWDochodzieUmowaOPrace();
    }

    private void czySaWymaganePolaWDochodzieUmowaOPrace() {
        (new UmowaOPrace(driver)).uruchomSprawdzanieWymagalnosciPolDlaDochodu();
        UmowaOPracePage umowaOPracePage = new UmowaOPracePage(driver);
        Assert.assertEquals(umowaOPracePage.wezTextPustyTypUmowy(), "Nie wybrano opcji typ umowy.");
        Assert.assertEquals(umowaOPracePage.wezTextPustyStanowisko(), "Nie wybrano opcji stanowisko.");
        Assert.assertEquals(umowaOPracePage.wezTextPustyBranza(), "Nie wybrano opcji branża.");
        Assert.assertEquals(umowaOPracePage.wezTextPustyWypowiedzenie(), "Nie wybrano opcji czy w okresie wypowiedzenia.");
        Assert.assertEquals(umowaOPracePage.wezTextPustyDochodZaOstatniMiesiac(), "Nie wypełniono pola dochód za ostatni miesiąc (zł).");
        Assert.assertEquals(umowaOPracePage.wezTextPustyTerminWyplaty(), "Nie wypełniono pola termin wypłaty.");
        Assert.assertEquals(umowaOPracePage.wezTextPustyNazwaFirmy(), "Nie wypełniono pola nazwa pracodawcy.");
        Assert.assertEquals(umowaOPracePage.wezTextPustyNip(), "Nie wypełniono pola nip.");
        Assert.assertEquals(umowaOPracePage.wezTextPustyTelDoFirmy(), "Nie wypełniono pola nr telefonu do firmy.");
    }

    private void czySaWymaganePolaWDochodzieDzialalnoscGospodarcza() {
        (new DzialalnoscGospodarcza(driver)).uruchomSprawdzanieWymagalnosciPolDlaDochodu();
        DzialalnoscGospodarczaPage dzialalnoscGospodarczaPage = new DzialalnoscGospodarczaPage(driver);
        Assert.assertEquals(dzialalnoscGospodarczaPage.wezTextPustyBranza(), "Nie wybrano opcji branża.");
        Assert.assertEquals(dzialalnoscGospodarczaPage.wezTextPustyDochodZaOstatniMiesiac(), "Nie wypełniono pola dochód za ostatni miesiąc (zł).");
        Assert.assertEquals(dzialalnoscGospodarczaPage.wezTextPustyNazwaFirmy(), "Nie wypełniono pola nazwa firmy.");
        Assert.assertEquals(dzialalnoscGospodarczaPage.wezTextPustyNip(), "Nie wypełniono pola nip.");
        Assert.assertEquals(dzialalnoscGospodarczaPage.wezTextPustyTelDoFirmy(), "Nie wypełniono pola nr telefonu do firmy.");
    }

    @AfterTest
    public void zakonczTest() {
        driver.close();
    }


    private void czySaWymaganePolaWDochodzieAlimenty() {
        (new Alimenty(driver)).uruchomSprawdzanieWymagalnosciPolDlaDochodu();
        AlimentyPage alimentyPage = new AlimentyPage(driver);
        Assert.assertEquals(alimentyPage.wezTextPustyDochodZaOstatniMiesiac(), "Nie wypełniono pola dochód za ostatni miesiąc (zł).");
        Assert.assertEquals(alimentyPage.wezTextPustyTerminWyplaty(), "Nie wypełniono pola termin wypłaty.");
    }

    private void czySaWymaganePolaWDochodzieEmerytura() {
        (new Emerytura(driver)).uruchomSprawdzanieWymagalnosciPolDlaDochodu();
        EmeryturaPage emeryturaPage = new EmeryturaPage(driver);
        Assert.assertEquals(emeryturaPage.wezTextPustyDochodZaOstatniMiesiac(), "Nie wypełniono pola dochód za ostatni miesiąc (zł).");
        Assert.assertEquals(emeryturaPage.wezTextPustyTerminWyplaty(), "Nie wypełniono pola termin wypłaty.");
        Assert.assertEquals(emeryturaPage.wezTextPustyOrganWyplacajacy(), "Nie wypełniono pola organ wypłacający.");
    }

    private void CzySaWymaganePolaNaSzostymKroku(UzupelnijDaneWnioskuOddzialPlusPomoc uzupelnij) {
        NowyWniosek6Page nowyWniosek6Page = new NowyWniosek6Page(driver);
        nowyWniosek6Page.kontynuujKlik();
        Assert.assertEquals(nowyWniosek6Page.wezTextPustyTypDochodu(), "Nie wybrano opcji typ dochodu.");
        Assert.assertEquals(nowyWniosek6Page.wezTextPustyWydatki(), "Nie wypełniono pola deklarowana kwota wydatków miesięcznych.");
        Assert.assertEquals(nowyWniosek6Page.wezTextPustyZobowiazanieKredytowe(), "Nie wypełniono pola miesięczne zobowiązania kredytowe.");
        uzupelnij.uzupelnienieDanychDochodowych(driver);
    }

    private void CzySaWymaganePolaNaPiatymKroku(UzupelnijDaneWnioskuOddzialPlusPomoc uzupelnij) {
        NowyWniosek5Page nowyWniosek5Page = new NowyWniosek5Page(driver);
        nowyWniosek5Page.kontynuujKlik();
        Assert.assertEquals(nowyWniosek5Page.wezTextPustyFormaWyplaty(), "Nie wybrano opcji forma wypłaty pożyczki.");
        uzupelnij.uzupelnienieDanychFormaWyplaty(driver);
    }

    private void CzySaWymaganePolaNaCzwartymKroku(UzupelnijDaneWnioskuOddzialPlusPomoc uzupelnij) {
        NowyWniosek4Page nowyWniosek4Page = new NowyWniosek4Page(driver);
        nowyWniosek4Page.kontynuujKlik();
        Assert.assertEquals(nowyWniosek4Page.wezTextPustyWyksztalcenie(), "Nie wybrano opcji wykształcenie.");
        Assert.assertEquals(nowyWniosek4Page.wezTextPustyStanCywilny(), "Nie wybrano opcji stan cywilny.");
        Assert.assertEquals(nowyWniosek4Page.wezTextPustyLiczbaDzieci(), "Nie wypełniono pola liczba dzieci.");
        uzupelnij.uzupelnienieDanychUzupelniajacych("2", driver);
    }

    private void CzySaWymaganePolaNaTrzecimKroku(UzupelnijDaneWnioskuOddzialPlusPomoc uzupelnij) {
        NowyWniosek3Page nowyWniosek3Page = new NowyWniosek3Page(driver);
        nowyWniosek3Page.kontynuujKlik();
        Assert.assertEquals(nowyWniosek3Page.wezTextPustyTelKontaktowy(), "Nie wypełniono pola telefon kontaktowy.");
        uzupelnij.uzupelnienieDanychKontaktowych(driver);
    }

    private void CzySaWymaganePolaNaDrugimKroku(UzupelnijDaneWnioskuOddzialPlusPomoc uzupelnij) {
        NowyWniosek2Page nowyWniosek2Page = new NowyWniosek2Page(driver);
        nowyWniosek2Page.kontynuujKlik();
        Assert.assertEquals(nowyWniosek2Page.wezTextPustyKodPocztowy(), "Nie wypełniono pola kod pocztowy.");
        Assert.assertEquals(nowyWniosek2Page.wezTextPustyMiejscowosc(), "Nie wybrano opcji miejscowość.");
        Assert.assertEquals(nowyWniosek2Page.wezTextPustyUlica(), "Nie wybrano opcji ulica.");
        Assert.assertEquals(nowyWniosek2Page.wezTextPustyNumer(), "Nie wypełniono pola numer budynku.");
        Assert.assertEquals(nowyWniosek2Page.wezTextPustyNieruchomosc(), "Nie wybrano opcji rodzaj nieruchomości.");
        Assert.assertEquals(nowyWniosek2Page.wezTextPustyStatuswlascicielski(), "Nie wybrano opcji status właścicielski.");
        Assert.assertEquals(nowyWniosek2Page.wezTextPustyOkresZamieszkania(), "Nie wybrano opcji okres zamieszkania pod adresem.");
        uzupelnij.uzupelnienieDanychAdresowych("65-012", driver);
    }

    private void CzySaWymaganePolaNaPierwszymKroku(UzupelnijDaneWnioskuOddzialPlusPomoc uzupelnij) {
        NowyWniosek1Page nowyWniosek1Page = new NowyWniosek1Page(driver);
        nowyWniosek1Page.kontynuujKlik();
        nowyWniosek1Page.OkKlik();
        Assert.assertEquals(nowyWniosek1Page.wezTextPustyPesel(), "Nie wypełniono pola pesel.");
        Assert.assertEquals(nowyWniosek1Page.wezTextPustyImie(), "Nie wypełniono pola imię.");
        Assert.assertEquals(nowyWniosek1Page.wezTextPustyNazwisko(), "Nie wypełniono pola nazwisko.");
        Assert.assertEquals(nowyWniosek1Page.wezTextPustyDowod(), "Nie wypełniono pola numer dowodu osobistego.");
        Assert.assertEquals(nowyWniosek1Page.wezTextPustyWaznoscDowod(), "Nie wypełniono pola data ważności dowodu osobistego.");
        uzupelnij.uzupelnienieDanychKlienta(2, driver);
    }

    private void zalogujSieJakoAdmin() {
        LogowaniePage logowaniePage = new LogowaniePage(driver);
        logowaniePage.wpiszHasloAdmin()
                .wpiszLoginAdmin()
                .wcisnijZaloguj();
    }
}
