package page.OddzialPlusPage.NowyWniosekPage;

import pomoc.CzekajNaElementPomoc;
import pomoc.PobierzTekstPomoc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by kamil on 05.06.17.
 */
public class NowyWniosek6Page extends CzekajNaElementPomoc {
    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//button[@data-id='id_typu_dochodu']")
    private WebElement TypDochodu;
    @FindBy(how = How.XPATH, using = "//span[contains(.,'Emerytura')]")
    private WebElement Emerytura;
    @FindBy(how = How.XPATH, using = "//label[@for='additional-income']")
    private WebElement DodatkoweZrodloDochodu;
    @FindBy(how = How.XPATH, using = "//input[@id='input-start']")
    private WebElement DataDochoduOd;
    @FindBy(how = How.XPATH, using = "//input[@id='input-last']")
    private WebElement DochodKwota;
    @FindBy(how = How.XPATH, using = "//input[@id='input-payday']")
    private WebElement TerminWyplaty;
    @FindBy(how = How.XPATH, using = "//input[@id='input-employer']")
    private WebElement OrganWypelniajacy;
    @FindBy(how = How.XPATH, using = "//button[@data-id='id_typu_dochodu_dodatkowego']")
    private WebElement TypDochoduDodatkowego;
    @FindBy(how = How.XPATH, using = "//button[@data-id='id_typu_umowy_dochodu_dodatkowego']")
    private WebElement TypUmowyDodatkowego;
    @FindBy(how = How.XPATH, using = "//input[@id='data_dochodu_dodatkowego_od']")
    private WebElement DataDochoduOdDodatkowego;
    @FindBy(how = How.XPATH, using = "//input[@id='data_dochodu_dodatkowego_do']")
    private WebElement DataDochoduDoDodatkowego;
    @FindBy(how = How.XPATH, using = "//button[@data-id='stanowisko_dochod_dodatkowy']")
    private WebElement StanowiskoDodatkowego;
    @FindBy(how = How.XPATH, using = "//button[@data-id='id_branza_dodatkowy']")
    private WebElement BranzaDodatkowego;
    @FindBy(how = How.XPATH, using = "//button[@data-id='czy_w_okresie_wypowiedzenia_dochodu_dodatkowego']")
    private WebElement CzyWOkresieWypowiedzeniaDodatkowego;
    @FindBy(how = How.XPATH, using = "//input[@id='kwota_dochodu_dodatkowego_netto']")
    private WebElement DochodKwotaDodatkowego;
    @FindBy(how = How.XPATH, using = "//input[@id='input-payday-additional']")
    private WebElement TerminWyplatyDodatkowego;
    @FindBy(how = How.XPATH, using = "//input[@id='pracodawca_dochodu_dodatkowego_nip']")
    private WebElement NIPDodatkowy;
    @FindBy(how = How.XPATH, using = "//input[@id='pracodawca_dochodu_dodatkowego_telefon']")
    private WebElement PracodawcaTelefonDodatkowego;
    @FindBy(how = How.XPATH, using = "//input[@id='pracodawca_dochodu_dodatkowego_nazwa']")
    private WebElement PracodawcaDodatkowego;
    @FindBy(how = How.XPATH, using = "//button[@data-id='id_typu_umowy']")
    private WebElement TypUmowyDochodu;
    @FindBy(how = How.XPATH, using = "//input[@id='input-end']")
    private WebElement DataDochoduDo;
    @FindBy(how = How.XPATH, using = "//button[@data-id='stanowisko']")
    private WebElement Stanowisko;
    @FindBy(how = How.XPATH, using = "//button[@data-id='id_branza']")
    private WebElement Branza;
    @FindBy(how = How.XPATH, using = "//button[@data-id='czy_w_okresie_wypowiedzenia']")
    private WebElement CzyWOkresieWypowiedzenia;
    @FindBy(how = How.XPATH, using = "//input[@id='input-nip']")
    private WebElement NIP;
    @FindBy(how = How.XPATH, using = "//input[@class='input__field other-fields-income']")
    private WebElement PracodawcaTelefon;
    @FindBy(how = How.XPATH, using = "//input[@id='input-wydatki']")
    private WebElement Wydatki;
    @FindBy(how = How.XPATH, using = "//input[@id='input-miesieczne_zobowiazania_kredytowe']")
    private WebElement ZobowiazaniaKredytowe;
    @FindBy(how = How.XPATH, using = "//a[@step='7']")
    private WebElement Kontynuuj;
    @FindBy(how = How.XPATH, using = "//div[@id='div-dochod-glowny']/span")
    private WebElement NieWybranoOpcjiTypDochodu;
    @FindBy(how = How.XPATH, using = "//div[@id='step-6']/div/div[5]/span")
    private WebElement NieWypelnionoPolaDeklarowanaKwotaWydatkowMiesiecznych;
    @FindBy(how = How.XPATH, using = "//div[@id='step-6']/div/div[5]/span[2]")
    private WebElement NieWypelnionoPolaMiesieczneZobowiazaniaKredytowe;


    public NowyWniosek6Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public NowyWniosek6Page typDochoduWybierz() {
        setWait(TypDochodu, driver);
        TypDochodu.click();
        Emerytura.click();
        setWait(Emerytura, driver);
        return this;
    }

    public NowyWniosek6Page dochodOdWpisz(String data) {
        setWait(DataDochoduOd, driver);
        DataDochoduOd.sendKeys(data);
        return this;
    }

    public NowyWniosek6Page kwotaWpisz(String kwota) {
        setWait(DochodKwota, driver);
        DochodKwota.sendKeys(kwota);
        return this;
    }

    public NowyWniosek6Page terminWyplatyWpisz(String termin) {
        setWait(TerminWyplaty, driver);
        TerminWyplaty.sendKeys(termin);
        return this;
    }

    public NowyWniosek6Page organWypelniajacyWpisz(String txt) {
        setWait(OrganWypelniajacy, driver);
        OrganWypelniajacy.sendKeys(txt);
        return this;
    }

    public NowyWniosek6Page wydatkiIZobowiazaniaKredytoweWpisz(String wydatki, String zobowiazaniaKredytowe) {
        setWait(Wydatki, driver);
        Wydatki.sendKeys(wydatki);
        setWait(ZobowiazaniaKredytowe, driver);
        ZobowiazaniaKredytowe.sendKeys(zobowiazaniaKredytowe);
        return this;
    }

    public NowyWniosek6Page kontynuujKlik() {
        setWaitVisible(1000);
        setWait(Kontynuuj, driver);
        Kontynuuj.click();
        return this;
    }

    PobierzTekstPomoc pobierzTekstPomoc = new PobierzTekstPomoc();

    public String wezTextPustyZobowiazanieKredytowe() {
        setWait(NieWypelnionoPolaMiesieczneZobowiazaniaKredytowe, driver);
        return pobierzTekstPomoc.wezTekst(NieWypelnionoPolaMiesieczneZobowiazaniaKredytowe);
    }

    public String wezTextPustyWydatki() {
        setWait(NieWypelnionoPolaDeklarowanaKwotaWydatkowMiesiecznych, driver);
        return pobierzTekstPomoc.wezTekst(NieWypelnionoPolaDeklarowanaKwotaWydatkowMiesiecznych);
    }

    public String wezTextPustyTypDochodu() {
        setWait(NieWybranoOpcjiTypDochodu, driver);
        return pobierzTekstPomoc.wezTekst(NieWybranoOpcjiTypDochodu);
    }




}

