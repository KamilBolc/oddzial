package pomoc;

import generatory.DaneKlientaGenerator;
import page.CRM2.KlienciPage;
import page.CRM2.Wniosek.*;
import org.openqa.selenium.WebDriver;

/**
 * Created by kamil on 18.04.17.
 */
public class UzupelnijDaneWnioskuPomoc {


    public UzupelnijDaneWnioskuPomoc wejdzIStworzNowyWniosek(WebDriver driver) {
        KlienciPage klienciPage = new KlienciPage(driver);
        klienciPage.klienciKlik()
                .nowyWniosekKlik();
        return this;
    }

    public UzupelnijDaneWnioskuPomoc nowyWniosek1WygenerujIWpiszPesel(int peselLiczba1, int peselLiczba2, int plec, WebDriver driver) {
        WniosekKrok1Page wniosekKrok1Page = new WniosekKrok1Page(driver);
        DaneKlientaGenerator daneKlientaGenerator = new DaneKlientaGenerator(plec);

        wniosekKrok1Page
                .peselUzupelnij(daneKlientaGenerator.pesel(peselLiczba1, peselLiczba2))
                .wyszukajKlik()
                .dalejKlik();
        return this;
    }

    public UzupelnijDaneWnioskuPomoc nowyWniosek2InformacjaOKwocie(String kwota, String produkt, String oddzial, int czyUbezpieczenie, WebDriver driver) {
        WniosekKrok2Page wniosekKrok2Page = new WniosekKrok2Page(driver);

        wniosekKrok2Page
                .wnioskowanaKwota(kwota)
                .oddzialWybierz(oddzial)
                .produktWybierz(produkt)
                .skadKlientDowiedzialSieOOfercie()
                .uszczegulowienieSkadKlientDowiedzialSieOOfercieWybierz(1)
                .czyZainteresowanyUbezpieczeniem(czyUbezpieczenie)
                .oddzialKlik()
                .dalejKlik();
        return this;

    }

    public UzupelnijDaneWnioskuPomoc nowyWniosek3DaneKlienta(String imie, String nazwisko, String imieOjca, String imieMatki, String nazwiskoMatki, String nrDowodu, WebDriver driver) {
        WniosekKrok3Page wniosekKrok3Page = new WniosekKrok3Page(driver);

        wniosekKrok3Page
                .imieWpisz(imie)
                .nazwiskoWpisz(nazwisko)
                .imieOjcaWpisz(imieOjca)
                .nazwiskoMatkiWpisz(nazwiskoMatki)
                .imieMatkiWpisz(imieMatki)
                .nrDowoduWpisz(nrDowodu)
                .brakWaznosciKlik()
                .dalejKlik();
        return this;
    }

    public UzupelnijDaneWnioskuPomoc nowyWniose4kAdresy(String kodpocztowy, int miejscowosc, String nrBudynku, String nrLokalu, int ustalonoNaPodstawie, WebDriver driver) {
        WniosekKrok4Page wniosekKrok4Page = new WniosekKrok4Page(driver);

        wniosekKrok4Page
                .kodPocztowyWpisz(kodpocztowy)
                .miejscowoscWybierz(miejscowosc)
                .uliceWybierz(1)
                .nrBudynkuWpisz(nrBudynku)
                .nrLokaluWpisz(nrLokalu)
                .naPodstawieWybierz(ustalonoNaPodstawie)
                .miejsceZamieszkaniaWybierz()
                .okresZamieszkaniaWybierz()
                .statusWlascicielskiWybierz()
                .dalejKlik();
        return this;
    }

    public UzupelnijDaneWnioskuPomoc nowyWniosek5Telefony(String komorka, String innyKomorka, String nrStacjonarny, String email, WebDriver driver) {
        WniosekKrok5Page wniosekKrok5Page = new WniosekKrok5Page(driver);

        wniosekKrok5Page
                .komorkowyWpisz(komorka)
                .innyTelWpisz(innyKomorka)
                .stracjonarnyWpisz(nrStacjonarny)
                .typTelWybierz()
                .czyPosiadaEmailWybierz()
                .emailWpisz(email)
                .dalejKlik();
        return this;
    }

    public UzupelnijDaneWnioskuPomoc nowyWniosek6DaneUzupelniajace(String ilosDzieci, WebDriver driver) {
        WniosekKrok6Page wniosekKrok6Page = new WniosekKrok6Page(driver);

        wniosekKrok6Page
                .brakKontaBankowgo()
                .modelRodzinyUstaw()
                .model2PlusRodzinyUstaw(ilosDzieci)
                .wyksztalcenieWybierz()
                .dalejKlik();
        return this;
    }

    public UzupelnijDaneWnioskuPomoc nowyWniosek7Oswiadczenia(WebDriver driver) {
        WniosekKrok7Page wniosekKrok7Page = new WniosekKrok7Page(driver);

        wniosekKrok7Page
                .zaznaczWszystkoKlik()
                .dalejKlik();
        return this;
    }

    public UzupelnijDaneWnioskuPomoc nowyWniosek8Dochody(int grupaDochodowa, int typDochodu, String dataOd, String kwota, String termin, int organWypelniajacy, WebDriver driver) {
        WniosekKrok8Page wniosekKrok8Page = new WniosekKrok8Page(driver);

        wniosekKrok8Page
                .dodajDochodKlik()
                .grupaDochodowWybierz(grupaDochodowa)
                .typDochodowWybierz(typDochodu)
                .dochodOdWpisz(dataOd)
                .wysokoscDochoduWpisz(kwota)
                .teminWyplatyWpisz(termin)
                .organWypelniajacyWybierz(organWypelniajacy)
                .zapiszDochodKlik()
                .dalejKlik();
        return this;
    }

    public UzupelnijDaneWnioskuPomoc nowyWniosek9Wydatki(String kwota, WebDriver driver) {
        WniosekKrok9Page wniosekKrok9Page = new WniosekKrok9Page(driver);

        wniosekKrok9Page
                .kategoriaWydatkuWybierz()
                .wydatiWpisz(kwota)
                .zapiszWydatkiKlik()
                .dalejKlik()
                .zapiszKlientaKlik();
        return this;
    }

    public UzupelnijDaneWnioskuPomoc nowyWniosek10Skany(WebDriver driver) {
        WniosekKrok10Page wniosekKrok10Page = new WniosekKrok10Page(driver);

        wniosekKrok10Page
                .dodajSkany()
                .wybierzTypSkanow()
                .dalejKlik();
        return this;
    }

    public UzupelnijDaneWnioskuPomoc nowyWniosek11Oferta(WebDriver driver) {
        OfertaPage ofertaPage = new OfertaPage(driver);

        ofertaPage
                .proceduryPlusKlik()
                .proceduryWybierz()
                .dalejKlik();
        return this;
    }

    public UzupelnijDaneWnioskuPomoc nowyWniosek12PrzygotowanieUmowy(WebDriver driver) {
        PrzygotowanieUmowyPage przygotowanieUmowyPage = new PrzygotowanieUmowyPage(driver);

        przygotowanieUmowyPage
                .mediumWyplatyWybierz(1)
                .generujKlik()
                .dalejKlik();
        return this;
    }

    public UzupelnijDaneWnioskuPomoc nowyWniosek13PodpisanieUmowy(WebDriver driver) {
        PodpisanieUmowyPage podpisanieUmowyPage = new PodpisanieUmowyPage(driver);

        podpisanieUmowyPage
                .potwierdzPodpisanieKlik()
                .okejKlik()
                .koniecKlik();
        return this;
    }

}
