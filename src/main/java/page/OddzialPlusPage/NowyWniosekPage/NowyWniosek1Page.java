package page.OddzialPlusPage.NowyWniosekPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pomoc.CzekajNaElementPomoc;
import pomoc.PobierzTekstPomoc;

/**
 * Created by kamil on 24.05.17.
 */
public class NowyWniosek1Page extends CzekajNaElementPomoc {
    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//div[@id='modal-document']/div/div/div/button")
    private WebElement ZamknijOswiadczenia;
    @FindBy(how = How.XPATH, using = "//button[@data-id='department-id']")
    private WebElement Oddzial;
    @FindBy(how = How.XPATH, using = "//li[34]/a/span")
    private WebElement Centrala;
    @FindBy(how = How.XPATH, using = "//div[@aria-valuenow='6450']")
    private WebElement KwotaPozyczki;
    @FindBy(how = How.XPATH, using = "//input[@id='input-pesel']")
    private WebElement Pesel;
    @FindBy(how = How.XPATH, using = "//input[@id='input-name']")
    private WebElement Imie;
    @FindBy(how = How.XPATH, using = "//input[@id='input-surname']")
    private WebElement Nazwisko;
    @FindBy(how = How.XPATH, using = "//input[@name='telefon_komorkowy']")
    private WebElement NrTelKomorka;
    @FindBy(how = How.XPATH, using = "//input[@id='input-id']")
    private WebElement NrDowoduOsobistego;
    @FindBy(how = How.XPATH, using = "//input[@id='input-id-date']")
    private WebElement DataWaznosciDowodu;
    @FindBy(how = How.XPATH, using = "//label[contains(.,'Czy dowód ważny bezterminowo: ')]")
    private WebElement DowodWaznyBezterminowo;
    @FindBy(how = How.XPATH, using = "//input[@id='input-zpg-1']")
    private WebElement Telewizja;
    @FindBy(how = How.XPATH, using = "//input[@id='uwagi']")
    private WebElement Uwagi;
    @FindBy(how = How.XPATH, using = "//button[contains(.,'Wybierz')]")
    private WebElement SkadDowiedzialSieKlient;
    @FindBy(how = How.XPATH, using = "//span[contains(.,'dami')]")
    private WebElement SkadDowiedzialSieKlientSzczegoly;
    @FindBy(how = How.XPATH, using = "//span[contains(.,'Esprit')]")
    private WebElement SkadDowiedzialEsprit;
    @FindBy(how = How.XPATH, using = "//label[@for='check-all-consents']")
    private WebElement WszystkieZgody;
    @FindBy(how = How.XPATH, using = "//label[@for='zgoda_komunikacja_elektroniczna']")
    private WebElement ZogdaElektronicznaKomunikacja;
    @FindBy(how = How.XPATH, using = "//label[@for='zgoda_marketing']")
    private WebElement ZogdaMarketing;
    @FindBy(how = How.XPATH, using = "//label[@for='zgoda_zwrot_nadplaty_na_rachunek']")
    private WebElement ZogdaZwrotNadplaty;
    @FindBy(how = How.XPATH, using = "//label[@for='zgoda_potwierdzenie_prawdziwosci']")
    private WebElement ZogdaPotwierdzeniePrawdziwosci;
    @FindBy(how = How.XPATH, using = "//label[@for='zgoda_bazy_zewnetrzne']")
    private WebElement ZogdaBazyZewnetrzne;
    @FindBy(how = How.XPATH, using = "//label[@for='zgoda_udostepnianie_informacji_BIK']")
    private WebElement ZogdaUdostepnienieInformacjiBik;
    @FindBy(how = How.XPATH, using = "//a[contains(.,'Wydrukuj oświadczenia')]")
    private WebElement WydrukujOswiadczenia;
    @FindBy(how = How.XPATH, using = "//a[contains(.,'Zaznacz\n" + "                            oswiadczenia SMSem')]")
    private WebElement ZaznaczOswiadczeniaSms;
    @FindBy(how = How.XPATH, using = "//a[@step='1']")
    private WebElement Kontynuuj;
    @FindBy(how = How.XPATH, using = "//div[3]/button")
    private WebElement Ok;
    @FindBy(how = How.XPATH, using = "//div[@id='step-1']/div[3]/div[2]/span[6]")
    private WebElement NieWypelnionoPolaDataWaznosciDowodu;
    @FindBy(how = How.XPATH, using = "//div[@id='step-1']/div[3]/div[2]/span[5]")
    private WebElement NieWypelnionoPolaNumerDowodu;
    @FindBy(how = How.XPATH, using = "//div[@id='step-1']/div[3]/div[2]/span[3]")
    private WebElement NieWypelnionoPolaNazwisko;
    @FindBy(how = How.XPATH, using = "//div[@id='step-1']/div[3]/div[2]/span[2]")
    private WebElement NieWypelnionoPolaImie;
    @FindBy(how = How.XPATH, using = "//div[@id='step-1']/div[3]/div[2]/span")
    private WebElement NieWypelnionoPesel;


    public NowyWniosek1Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public NowyWniosek1Page oddzialWybierz() {
        setWait(Oddzial, driver);
        Select dr = new Select(driver.findElement(By.xpath("//select[@id='department-id']")));
        dr.selectByVisibleText("CENTRALA");
        return this;
    }

    public NowyWniosek1Page kwotaPozyczkiWybierz() {
        setWait(KwotaPozyczki, driver);
        KwotaPozyczki.click();
        return this;
    }

    public NowyWniosek1Page peselWpisz(String pesel) {
        setWait(Pesel, driver);
        Pesel.sendKeys(pesel);
        return this;
    }

    public NowyWniosek1Page zamknijOswiadczenia() {
        setWaitVisible(2500);
        setWait(ZamknijOswiadczenia, driver);
        ZamknijOswiadczenia.click();
        return this;
    }

    public NowyWniosek1Page imieWpisz(String imie) {
        setWait(Imie, driver);
        Imie.sendKeys(imie);
        return this;
    }

    public NowyWniosek1Page nazwiskoWpisz(String nazwisko) {
        setWait(Nazwisko, driver);
        Nazwisko.sendKeys(nazwisko);
        return this;
    }

    public NowyWniosek1Page numerTelefonuKomWpisz(String numer) {
        setWait(NrTelKomorka, driver);
        NrTelKomorka.clear();
        NrTelKomorka.sendKeys(numer);
        return this;
    }

    public NowyWniosek1Page numerDowoduOsobistego(String numer) {
        setWait(NrDowoduOsobistego, driver);
        NrDowoduOsobistego.clear();
        NrDowoduOsobistego.sendKeys(numer);
        return this;
    }

    public NowyWniosek1Page dataWaznosciDowoduOsobistegoWpisz(String data) {
        setWait(DataWaznosciDowodu, driver);
        DataWaznosciDowodu.sendKeys(data);
        return this;
    }

    public NowyWniosek1Page dowodBezterminowyKlik() {
        setWaitVisible(2000);
        setWait(DowodWaznyBezterminowo, driver);
        DowodWaznyBezterminowo.click();
        return this;
    }

    public NowyWniosek1Page telewizjaKlik() {
        setWait(Telewizja, driver);
        Telewizja.click();
        return this;
    }

    public NowyWniosek1Page uwagiWpisz(String uwagi) {
        setWait(Uwagi, driver);
        Uwagi.sendKeys(uwagi);
        return this;
    }

    public NowyWniosek1Page skadSieDowiedzialWybierz() {
        setWait(SkadDowiedzialSieKlient, driver);
        SkadDowiedzialSieKlient.click();
        setWait(SkadDowiedzialSieKlientSzczegoly, driver);
        SkadDowiedzialSieKlientSzczegoly.click();
        return this;
    }

    public NowyWniosek1Page skadSieDowiedzialEspritWybierz() {
        setWait(SkadDowiedzialSieKlient, driver);
        SkadDowiedzialSieKlient.click();
        setWait(SkadDowiedzialEsprit, driver);
        SkadDowiedzialEsprit.click();
        return this;
    }

    public NowyWniosek1Page zaznaczZgodyWszystkieKlik() {
        setWait(WszystkieZgody, driver);
        WszystkieZgody.click();
        return this;
    }

    public NowyWniosek1Page zgodaElektronicznaKomunikacjaKlik() {
        setWait(ZogdaElektronicznaKomunikacja, driver);
        ZogdaElektronicznaKomunikacja.click();
        return this;
    }

    public NowyWniosek1Page zgodaBazyZewnetrzneKlik() {
        setWait(ZogdaBazyZewnetrzne, driver);
        ZogdaBazyZewnetrzne.click();
        return this;
    }

    public NowyWniosek1Page zgodaMarketingKlik() {
        setWait(ZogdaMarketing, driver);
        ZogdaMarketing.click();
        return this;
    }

    public NowyWniosek1Page zgodaPotwierdzeniePrawdziwosciKlik() {
        setWait(ZogdaPotwierdzeniePrawdziwosci, driver);
        ZogdaPotwierdzeniePrawdziwosci.click();
        return this;
    }

    public NowyWniosek1Page zgodaBikKlik() {
        setWait(ZogdaUdostepnienieInformacjiBik, driver);
        ZogdaUdostepnienieInformacjiBik.click();
        return this;
    }

    public NowyWniosek1Page zgodaZwrotNadplatyKlik() {
        setWait(ZogdaZwrotNadplaty, driver);
        ZogdaZwrotNadplaty.click();
        return this;
    }

    public NowyWniosek1Page wydrukujOswiadczeniaKlik() {
        setWait(WydrukujOswiadczenia, driver);
        WydrukujOswiadczenia.click();
        setWaitVisible(500);
        return this;
    }

    public NowyWniosek1Page oswiadczeniaSmsKlik() {
        setWait(ZaznaczOswiadczeniaSms, driver);
        ZaznaczOswiadczeniaSms.click();
        return this;
    }

    public NowyWniosek1Page OkKlik() {
        setWaitVisible(1000);
        setWait(Ok, driver);
        Ok.click();
        return this;
    }

    public NowyWniosek1Page kontynuujKlik() {
        setWaitVisible(500);
        setWait(Kontynuuj, driver);
        Kontynuuj.click();
        return this;
    }

    PobierzTekstPomoc pobierzTekstPomoc = new PobierzTekstPomoc();

    public String wezTextOK() {
        setWait(Ok, driver);
        return pobierzTekstPomoc.wezTekst(Ok);
    }

    public String wezTextPustyWaznoscDowod() {
        setWait(NieWypelnionoPolaDataWaznosciDowodu, driver);
        return pobierzTekstPomoc.wezTekst(NieWypelnionoPolaDataWaznosciDowodu);
    }

    public String wezTextPustyDowod() {
        setWait(NieWypelnionoPolaNumerDowodu, driver);
        return pobierzTekstPomoc.wezTekst(NieWypelnionoPolaNumerDowodu);
    }

    public String wezTextPustyNazwisko() {
        setWait(NieWypelnionoPolaNazwisko, driver);
        return pobierzTekstPomoc.wezTekst(NieWypelnionoPolaNazwisko);
    }

    public String wezTextPustyImie() {
        setWait(NieWypelnionoPolaImie, driver);
        return pobierzTekstPomoc.wezTekst(NieWypelnionoPolaImie);
    }

    public String wezTextPustyPesel() {
        setWait(NieWypelnionoPesel, driver);
        return pobierzTekstPomoc.wezTekst(NieWypelnionoPesel);
    }

}
