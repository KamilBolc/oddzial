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
public class DzialalnoscGospodarczaPage extends CzekajNaElementPomoc{
    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//button[@data-id='id_typu_dochodu']")
    private WebElement TypDochodu;
    @FindBy(how = How.XPATH, using = "//span[contains(.,'Działalność gospodarcza')]")
    private WebElement DzialalnoscGospodarcza;
    @FindBy(how = How.XPATH, using = "//input[@id='input-start']")
    private WebElement DataDochoduOd;
    @FindBy(how = How.XPATH, using = "//div[5]/div/button")
    private WebElement Branza;
    @FindBy(how = How.XPATH, using = "//div[5]/div/div/ul/li[2]/a/span")
    private WebElement AdministracjaPanstwowa;
    @FindBy(how = How.XPATH, using = "//input[@id='input-last']")
    private WebElement DochodKwota;
    @FindBy(how = How.XPATH, using = "//input[@id='input-employer']")
    private WebElement NazwaFirmy;
    @FindBy(how = How.XPATH, using = "//input[@id='input-nip']")
    private WebElement Nip;
    @FindBy(how = How.XPATH, using = "//input[@id='input-employer-phone']")
    private WebElement NrTelDoFirmy;
    @FindBy(how = How.XPATH, using = "//div[2]/span[2]")
    private WebElement NieWypelnionoPolaDochodZaOstatniMiesiac;
    @FindBy(how = How.XPATH, using = "//div[6]/div/div[2]/span")
    private WebElement NieWybranoOpcjiBranza;
    @FindBy(how = How.XPATH, using = "//span[3]")
    private WebElement NieWypelnionoPolaNazwaFirmy;
    @FindBy(how = How.XPATH, using = "//span[4]")
    private WebElement NieWypelnionoPolaNip;
    @FindBy(how = How.XPATH, using = "//span[5]")
    private WebElement NieWypelnionoPolaNrTelefonuDoFirmy;
    @FindBy(how = How.XPATH, using = "//a[@step='7']")
    private WebElement Kontynuuj;


    public DzialalnoscGospodarczaPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public DzialalnoscGospodarczaPage typDochoduWybierzDzialalnoscGospodarcza() {
        setWait(TypDochodu, driver);
        setWaitVisible(500);
        TypDochodu.click();
        DzialalnoscGospodarcza.click();
        setWait(DzialalnoscGospodarcza, driver);
        return this;
    }

    public DzialalnoscGospodarczaPage dochodOdWpisz(String data) {
        setWait(DataDochoduOd, driver);
        DataDochoduOd.sendKeys(data);
        return this;
    }

    public DzialalnoscGospodarczaPage branzaWybierz() {
        setWait(Branza, driver);
        Branza.click();
        AdministracjaPanstwowa.click();
        setWait(AdministracjaPanstwowa, driver);
        return this;
    }

    public DzialalnoscGospodarczaPage kwotaWpisz(String kwota) {
        setWait(DochodKwota, driver);
        DochodKwota.sendKeys(kwota);
        return this;
    }

    public DzialalnoscGospodarczaPage NazwaFirmyWpisz(String txt) {
        setWait(NazwaFirmy, driver);
        NazwaFirmy.sendKeys(txt);
        return this;
    }

    public DzialalnoscGospodarczaPage NipWpisz(String txt) {
        setWait(Nip, driver);
        Nip.sendKeys(txt);
        return this;
    }

    public DzialalnoscGospodarczaPage NrTelFirmyWpisz(String txt) {
        setWait(NrTelDoFirmy, driver);
        NrTelDoFirmy.sendKeys(txt);
        return this;
    }

    public DzialalnoscGospodarczaPage kontynuujKlik() {
        setWaitVisible(1000);
        setWait(Kontynuuj, driver);
        Kontynuuj.click();
        return this;
    }

    PobierzTekstPomoc pobierzTekstPomoc = new PobierzTekstPomoc();

    public String wezTextPustyDochodZaOstatniMiesiac() {
        setWait(NieWypelnionoPolaDochodZaOstatniMiesiac, driver);
        return pobierzTekstPomoc.wezTekst(NieWypelnionoPolaDochodZaOstatniMiesiac);
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
        setWait(NieWypelnionoPolaNazwaFirmy, driver);
        return pobierzTekstPomoc.wezTekst(NieWypelnionoPolaNazwaFirmy);
    }

    public String wezTextPustyTelDoFirmy() {
        setWait(NieWypelnionoPolaNrTelefonuDoFirmy, driver);
        return pobierzTekstPomoc.wezTekst(NieWypelnionoPolaNrTelefonuDoFirmy);
    }

}
