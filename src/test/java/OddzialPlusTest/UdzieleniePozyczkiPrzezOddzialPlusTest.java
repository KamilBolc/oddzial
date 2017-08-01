package OddzialPlusTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.CRM2.LogowaniePage;
import page.OddzialPlusPage.NowyWniosekPage.NowyWniosek7Page;
import page.OddzialPlusPage.WidokKlientaPage.AkceptacjaPage;
import page.OddzialPlusPage.WidokKlientaPage.AkceptacjaWygenerowanoDokumentyPage;
import pomoc.CzekajNaElementPomoc;
import pomoc.UzupelnijDaneWnioskuOddzialPlusPomoc;
import pomoc.encje.OddzialPlusWniosekEncjaCase1;

/**
 * Created by kamil on 12.06.17.
 */
public class UdzieleniePozyczkiPrzezOddzialPlusTest extends MainOddzialPlusTest {



    @Test
    public void czyMogeStworzycNowegoKlientaPrzezModolOddzialPlusJakoAdmin() {
        zalogujSieJakoAdmin();
        NowyWniosek7Page nowyWniosek7Page = uzupelnijDaneWnioskuOddzialPlusAdmin();
        Assert.assertEquals(nowyWniosek7Page.wezText(), "Oczekiwanie na decyzję kredytową");
    }

    @Test
    public void czyMogeStworzycNowegoKlientaPrzezModolOddzialPlusJakoDK() {
        zalogujSieJakoDK();
        NowyWniosek7Page nowyWniosek7Page = uzupelnijDaneWnioskuOddzialPlusDk();
        Assert.assertEquals(nowyWniosek7Page.wezText(), "Oczekiwanie na decyzję kredytową");
    }

    @Test
    public void czyMogeUdzielicPozyczkiSzp() {
        zalogujSieJakoDK();
        uzupelnijDaneWnioskuOddzialPlusDk();
        CzekajNaElementPomoc czekajNaElementPomoc = new CzekajNaElementPomoc();
        czekajNaElementPomoc.czekajNaTekst("AKCEPTACJA", driver);
        AkceptacjaPage akceptacjaPage = new AkceptacjaPage(driver);
        AkceptacjaWygenerowanoDokumentyPage akceptacjaWygenerowanoDokumentyPage = new AkceptacjaWygenerowanoDokumentyPage(driver);
        akceptacjaPage.szpKlik()
                .OfertaWybierz("1","600")
                .generujDokumentyKlik()
                .zamknijDrukKlik();
//        akceptacjaWygenerowanoDokumentyPage.dodajSkany();
    }

    @Test
    public void czyMogeUdzielicPozyczkiPjm(){
        zalogujSieJakoAdmin();
        uzupelnijDaneWnioskuOddzialPlusAdmin();
        CzekajNaElementPomoc czekajNaElementPomoc = new CzekajNaElementPomoc();
        czekajNaElementPomoc.czekajNaTekst("AKCEPTACJA", driver);
        AkceptacjaPage akceptacjaPage = new AkceptacjaPage(driver);
        AkceptacjaWygenerowanoDokumentyPage akceptacjaWygenerowanoDokumentyPage = new AkceptacjaWygenerowanoDokumentyPage(driver);
        if (akceptacjaPage.Pjm.isDisplayed()) {
            akceptacjaPage.pjmKlik();
        }
        akceptacjaPage.OfertaWybierz("24","4000")
                .generujDokumentyKlik()
                .zamknijDrukKlik();
//        akceptacjaWygenerowanoDokumentyPage.dodajSkany();
    }

    @Test
    public void czyMogeUdzielicPozyczkiPr5() {
        zalogujSieJakoDK();
        uzupelnijDaneWnioskuOddzialPlusDk();
        CzekajNaElementPomoc czekajNaElementPomoc = new CzekajNaElementPomoc();
        czekajNaElementPomoc.czekajNaTekst("AKCEPTACJA", driver);
        AkceptacjaPage akceptacjaPage = new AkceptacjaPage(driver);
        AkceptacjaWygenerowanoDokumentyPage akceptacjaWygenerowanoDokumentyPage = new AkceptacjaWygenerowanoDokumentyPage(driver);
        if (akceptacjaPage.Pr5.isDisplayed()) {
            akceptacjaPage.pr5Klik();
        }
        akceptacjaPage.OfertaWybierz("24", "4000")
                .generujDokumentyKlik()
                .zamknijDrukKlik();
    }

    private NowyWniosek7Page uzupelnijDaneWnioskuOddzialPlusAdmin() {
        UzupelnijDaneWnioskuOddzialPlusPomoc uzupelnij = new UzupelnijDaneWnioskuOddzialPlusPomoc();
        uzupelnij.wejscieNaOddzialPlusPrzezCRM2(driver);
        uzupelnij.uzupelnijDaneWnioskuAdmin(new OddzialPlusWniosekEncjaCase1(1, "65-012", "0"), driver);
        return new NowyWniosek7Page(driver);
    }

    private NowyWniosek7Page uzupelnijDaneWnioskuOddzialPlusDk() {
        UzupelnijDaneWnioskuOddzialPlusPomoc uzupelnij = new UzupelnijDaneWnioskuOddzialPlusPomoc();
        uzupelnij.wejscieNaOddzialPlusPrzezCRM2(driver);
        uzupelnij.uzupelnijDaneWnioskuDk(new OddzialPlusWniosekEncjaCase1(1, "65-012", "0"), driver);
        return new NowyWniosek7Page(driver);
    }

    private void zalogujSieJakoAdmin() {
        LogowaniePage logowaniePage = new LogowaniePage(driver);
        logowaniePage.wpiszHasloAdmin()
                .wpiszLoginAdmin()
                .wcisnijZaloguj();
    }

    private void zalogujSieJakoDK() {
        LogowaniePage logowaniePage = new LogowaniePage(driver);
        logowaniePage.wpiszHasloDK()
                .wpiszLoginDK()
                .wcisnijZaloguj();
    }
}