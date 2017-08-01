package page.OddzialPlusPage.NowyWniosekPage.DochodyPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import pomoc.CzekajNaElementPomoc;
import pomoc.PobierzTekstPomoc;

/**
 * Created by kamil on 11.07.17.
 */
public class UmowaOPracePage extends CzekajNaElementPomoc{
    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//button[@data-id='id_typu_dochodu']")
    private WebElement TypDochodu;
    @FindBy(how = How.XPATH, using = "//span[contains(.,'Umowa o pracę')]")
    private WebElement UmowaOPrace;
    @FindBy(how = How.XPATH, using = "//div[6]/div/div[2]/div[2]/div/button")
    private WebElement TypUmowy;
    @FindBy(how = How.XPATH, using = "//div[6]/div/div[2]/div[2]/div/div/ul/li[2]/a/span")
    private WebElement Nieokreslony;
    @FindBy(how = How.XPATH, using = "//input[@id='input-start']")
    private WebElement DataDochoduOd;
    @FindBy(how = How.XPATH, using = "//input[@id='input-end']")
    private WebElement DataDochoduDo;
    @FindBy(how = How.XPATH, using = "//div[4]/div/button")
    private WebElement Stanowisko;
    @FindBy(how = How.XPATH, using = "//div[4]/div/div/ul/li[4]/a/span")
    private WebElement Aktor;
    @FindBy(how = How.XPATH, using = "//div[5]/div/button")
    private WebElement Branza;
    @FindBy(how = How.XPATH, using = "//div[5]/div/div/ul/li[2]/a/span")
    private WebElement AdministracjaPanstwowa;
    @FindBy(how = How.XPATH, using = "//div[@id='div-dochod-glowny']/div[6]/div/button")
    private WebElement Wypowiedzenie;
    @FindBy(how = How.XPATH, using = "//div[6]/div/div[2]/div[6]/div/div/ul/li[2]/a/span")
    private WebElement Nie;
    @FindBy(how = How.XPATH, using = "//input[@id='input-last']")
    private WebElement DochodKwota;
    @FindBy(how = How.XPATH, using = "//input[@id='input-payday']")
    private WebElement TerminWyplaty;
    @FindBy(how = How.XPATH, using = "//input[@id='input-employer']")
    private WebElement NazwaFirmy;
    @FindBy(how = How.XPATH, using = "//input[@id='input-nip']")
    private WebElement Nip;
    @FindBy(how = How.XPATH, using = "//input[@id='input-employer-phone']")
    private WebElement NrTelDoFirmy;
    @FindBy(how = How.XPATH, using = "//span[@id='id_typu_umowy']")
    private WebElement NieWybranoOpcjiTypUmowy;
    @FindBy(how = How.XPATH, using = "//div[2]/span[2]")
    private WebElement NieWybranoOpcjiStanowisko;
    @FindBy(how = How.XPATH, using = "//span[3]")
    private WebElement NieWybranoOpcjiBranza;
    @FindBy(how = How.XPATH, using = "//span[4]")
    private WebElement NieWybranoOpcjiCzywOkresieWypowiedzenia;
    @FindBy(how = How.XPATH, using = "//span[5]")
    private WebElement NieWypelnionoPolaDochodZaOstatniMiesiac;
    @FindBy(how = How.XPATH, using = "//span[6]")
    private WebElement NieWypelnionoPolaTerminWyplaty;
    @FindBy(how = How.XPATH, using = "//span[3]")
    private WebElement NieWypelnionoPolaNazwaFirmy;
    @FindBy(how = How.XPATH, using = "//span[7]")
    private WebElement NieWypelnionoPolaNazwaPracodawcy;
    @FindBy(how = How.XPATH, using = "//span[8]")
    private WebElement NieWypelnionoPolaNip;
    @FindBy(how = How.XPATH, using = "//span[9]")
    private WebElement NieWypelnionoPolaNrTelefonuDoFirmy;
    @FindBy(how = How.XPATH, using = "//a[@step='7']")
    private WebElement Kontynuuj;
    
    public UmowaOPracePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public UmowaOPracePage typDochoduWybierzUmowaOPrace() {
        setWait(TypDochodu, driver);
        TypDochodu.click();
        UmowaOPrace.click();
        setWait(UmowaOPrace, driver);
        return this;
    }

    public UmowaOPracePage typUmowyNieokreslonyWybierz() {
        setWait(TypUmowy, driver);
        TypUmowy.click();
        Nieokreslony.click();
        return this;
    }

    public UmowaOPracePage dochodOdWpisz(String data) {
        setWait(DataDochoduOd, driver);
        DataDochoduOd.sendKeys(data);
        return this;
    }

    public UmowaOPracePage dochodDoWpisz(String data) {
        setWait(DataDochoduDo, driver);
        DataDochoduDo.sendKeys(data);
        return this;
    }

    public UmowaOPracePage stanowiskoWybierz() {
        setWait(Stanowisko, driver);
        Stanowisko.click();
        Aktor.click();
        return this;
    }

    public UmowaOPracePage branzaWybierz() {
        setWait(Branza, driver);
        Branza.click();
        AdministracjaPanstwowa.click();
        return this;
    }

    public UmowaOPracePage wypowiedzenieWybierz() {
        setWait(Wypowiedzenie, driver);
        Wypowiedzenie.click();
        Nie.click();
        return this;
    }

    public UmowaOPracePage kwotaWpisz(String kwota) {
        setWait(DochodKwota, driver);
        DochodKwota.sendKeys(kwota);
        return this;
    }

    public UmowaOPracePage terminWyplatyWpisz(String termin) {
        setWait(TerminWyplaty, driver);
        TerminWyplaty.sendKeys(termin);
        return this;
    }

    public UmowaOPracePage nazwaPracodawcyWpisz(String txt) {
        setWait(NazwaFirmy, driver);
        NazwaFirmy.sendKeys(txt);
        return this;
    }

    public UmowaOPracePage NipWpisz(String txt) {
        setWait(Nip, driver);
        Nip.sendKeys(txt);
        return this;
    }

    public UmowaOPracePage NrTelFirmyWpisz(String txt) {
        setWait(NrTelDoFirmy, driver);
        NrTelDoFirmy.sendKeys(txt);
        return this;
    }

    public UmowaOPracePage kontynuujKlik() {
        setWaitVisible(1000);
        setWait(Kontynuuj, driver);
        Kontynuuj.click();
        return this;
    }

    PobierzTekstPomoc pobierzTekstPomoc = new PobierzTekstPomoc();

    public String wezTextPustyTypUmowy() {
        setWait(NieWybranoOpcjiTypUmowy, driver);
        return pobierzTekstPomoc.wezTekst(NieWybranoOpcjiTypUmowy);
    }

    public String wezTextPustyStanowisko() {
        setWait(NieWybranoOpcjiStanowisko, driver);
        return pobierzTekstPomoc.wezTekst(NieWybranoOpcjiStanowisko);
    }

    public String wezTextPustyWypowiedzenie() {
        setWait(NieWybranoOpcjiCzywOkresieWypowiedzenia, driver);
        return pobierzTekstPomoc.wezTekst(NieWybranoOpcjiCzywOkresieWypowiedzenia);
    }

    public String wezTextPustyDochodZaOstatniMiesiac() {
        setWait(NieWypelnionoPolaDochodZaOstatniMiesiac, driver);
        return pobierzTekstPomoc.wezTekst(NieWypelnionoPolaDochodZaOstatniMiesiac);
    }

    public String wezTextPustyTerminWyplaty() {
        setWait(NieWypelnionoPolaTerminWyplaty, driver);
        return pobierzTekstPomoc.wezTekst(NieWypelnionoPolaTerminWyplaty);
    }

    public String wezTextPustyBranza() {
        setWait(NieWybranoOpcjiBranza, driver);
        return pobierzTekstPomoc.wezTekst(NieWybranoOpcjiBranza);
    }

    public String wezTextPustyNip() {
        setWait(NieWypelnionoPolaNip, driver);
        return pobierzTekstPomoc.wezTekst(NieWypelnionoPolaNip);
    }

    public String wezTextPustyNazwaFirmy() {
        setWait(NieWypelnionoPolaNazwaPracodawcy, driver);
        return pobierzTekstPomoc.wezTekst(NieWypelnionoPolaNazwaPracodawcy);
    }

    public String wezTextPustyTelDoFirmy() {
        setWait(NieWypelnionoPolaNrTelefonuDoFirmy, driver);
        return pobierzTekstPomoc.wezTekst(NieWypelnionoPolaNrTelefonuDoFirmy);
    }

}
