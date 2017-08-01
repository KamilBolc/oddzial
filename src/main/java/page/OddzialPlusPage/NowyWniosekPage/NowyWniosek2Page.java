package page.OddzialPlusPage.NowyWniosekPage;

import pomoc.CzekajNaElementPomoc;
import pomoc.PobierzTekstPomoc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by kamil on 01.06.17.
 */
public class NowyWniosek2Page extends CzekajNaElementPomoc {
    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//input[@id='input-zip-code']")
    private WebElement KodPocztowy;
    @FindBy(how = How.XPATH, using = "//button[@data-id='input-city']")
    private WebElement Miejscowosc;
    @FindBy(how = How.XPATH, using = "//button[@data-id='input-city']")
    private WebElement WybierzMiejscowosc;
    @FindBy(how = How.XPATH, using = "//span[contains(.,'Zielona Góra')]")
    private WebElement Miasto;
    @FindBy(how = How.XPATH, using = "//button[@data-id='input-street']")
    private WebElement Ulica;
    @FindBy(how = How.XPATH, using = "//span[contains(.,'Agatowa')]")
    private WebElement WybierzUlica;
    @FindBy(how = How.XPATH, using = "//input[@id='input-building']")
    private WebElement NumerBudynku;
    @FindBy(how = How.XPATH, using = "//input[@id='input-flat']")
    private WebElement NumerLokalu;
    @FindBy(how = How.XPATH, using = "//button[@data-id='input-property']")
    private WebElement RodzajNieruchomosci;
    @FindBy(how = How.XPATH, using = "//span[contains(.,'Mieszkanie')]")
    private WebElement Mieszkanie;
    @FindBy(how = How.XPATH, using = "//button[@data-id='input-owner-property']")
    private WebElement StatusWlascicielski;
    @FindBy(how = How.XPATH, using = "//button[@data-id='input-long-residence']")
    private WebElement OkresZamieszkania;
    @FindBy(how = How.XPATH, using = "//span[contains(.,'Własne')]")
    private WebElement Wlasne;
    @FindBy(how = How.XPATH, using = "//span[contains(.,'powyżej 5 lat')]")
    private WebElement PiecLat;
    @FindBy(how = How.XPATH, using = "//label[@for='additional-address']")
    private WebElement CzyZgodnyAdresKorespondencyjny;
    @FindBy(how = How.XPATH, using = "//input[@id='input-zip-code-2']")
    private WebElement KodPocztowyKorespondencyjny;
    @FindBy(how = How.XPATH, using = "//button[@data-id='input-city-2']")
    private WebElement MiejscowoscKorespondencyjny;
    @FindBy(how = How.XPATH, using = "//span[contains(.,'Ostrolęka')]")
    private WebElement WybierzMiejscowoscKorespondencyjny;
    @FindBy(how = How.XPATH, using = "//button[@data-id='input-street-2']")
    private WebElement UlicaKorespondencyjny;
    @FindBy(how = How.XPATH, using = "//span[contains(.,'5 Pulku Ulanów')]")
    private WebElement WybierzUlicaKorespondencyjny;
    @FindBy(how = How.XPATH, using = "//input[@id='input-building-2']")
    private WebElement NumerBudynkuKorespondencyjny;
    @FindBy(how = How.XPATH, using = "//input[@id='input-flat-2']")
    private WebElement NumerLokaluKorespondencyjny;
    @FindBy(how = How.XPATH, using = "//a[@step='2']")
    private WebElement Kontynuuj;
    @FindBy(how = How.XPATH, using = "//div[@id='step-2']/div/div[2]/span")
    private WebElement NieWypelnionoPolaKodPocztowy;
    @FindBy(how = How.XPATH, using = "//div[@id='step-2']/div/div[2]/span[2]")
    private WebElement NieWybranoOpcjiMiejscowosć;
    @FindBy(how = How.XPATH, using = "//div[@id='step-2']/div/div[2]/span[3]")
    private WebElement NieWybranoOpcjiUlica;
    @FindBy(how = How.XPATH, using = "//div[@id='step-2']/div/div[2]/span[4]")
    private WebElement NieWypelnionoPolaNumerBudynku;
    @FindBy(how = How.XPATH, using = "//div[@id='step-2']/div/div[2]/span[5]")
    private WebElement NieWybranoOpcjiRodzajNieruchomosci;
    @FindBy(how = How.XPATH, using = "//div[@id='step-2']/div/div[2]/span[6]")
    private WebElement NieWybranoOpcjiStatusWlascicielski;
    @FindBy(how = How.XPATH, using = "//div[@id='step-2']/div/div[2]/span[7]")
    private WebElement NieWybranoOpcjiOkresZamieszkaniaPodAdresem;


    public NowyWniosek2Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public NowyWniosek2Page kodPocztowyWpisz(String kodPocztowy) {
        setWait(KodPocztowy, driver);
        KodPocztowy.sendKeys(kodPocztowy);
        setWaitVisible(500);
        return this;
    }

    public NowyWniosek2Page miejscowoscWpisz(String miejscowosc) {
        setWait(Miejscowosc, driver);
        Miejscowosc.sendKeys(miejscowosc);
        return this;
    }

    public NowyWniosek2Page miejscowoscWybierz() {
        setWait(WybierzMiejscowosc, driver);
        WybierzMiejscowosc.click();
        setWait(Miasto, driver);
        Miasto.click();
        return this;
    }

    public NowyWniosek2Page ulicaWybierz() {
        setWait(Ulica, driver);
        Ulica.click();
        setWait(WybierzUlica, driver);
        WybierzUlica.click();
        return this;
    }

    public NowyWniosek2Page numerBudynkuWpisz(String nrBudynku) {
        setWait(NumerBudynku, driver);
        NumerBudynku.sendKeys(nrBudynku);
        return this;
    }

    public NowyWniosek2Page numerLokaluWpisz(String nrLokalu) {
        setWait(NumerLokalu, driver);
        NumerLokalu.sendKeys(nrLokalu);
        return this;
    }

    public NowyWniosek2Page rodzajNieruchomosciWybierz() {
        setWait(RodzajNieruchomosci, driver);
        RodzajNieruchomosci.click();
        Mieszkanie.click();
        setWait(Mieszkanie, driver);
        return this;
    }

    public NowyWniosek2Page statusWlascicielskiWybierz() {
        setWait(StatusWlascicielski, driver);
        StatusWlascicielski.click();
        Wlasne.click();
        setWait(Wlasne, driver);
        return this;
    }

    public NowyWniosek2Page okresZamieszkaniaWybierz() {
        setWait(OkresZamieszkania, driver);
        OkresZamieszkania.click();
        PiecLat.click();
        setWait(PiecLat, driver);
        return this;
    }

    public NowyWniosek2Page czyZgodnyAdresKorespondencyjnyKlik() {
        setWait(CzyZgodnyAdresKorespondencyjny, driver);
        CzyZgodnyAdresKorespondencyjny.click();
        return this;
    }

    public NowyWniosek2Page kodPocztowyKorespondencyjnyWpisz(String kodPocztowy) {
        setWait(KodPocztowy, driver);
        KodPocztowyKorespondencyjny.sendKeys(kodPocztowy);
        return this;
    }

    public NowyWniosek2Page miejscowoscKorespondencyjnyWpisz(String miejscowosc) {
        setWait(Miejscowosc, driver);
        MiejscowoscKorespondencyjny.sendKeys(miejscowosc);
        return this;
    }

    public NowyWniosek2Page numerBudynkuKorespondencyjnyWpisz(String nrBudynku) {
        setWait(NumerBudynku, driver);
        NumerBudynkuKorespondencyjny.sendKeys(nrBudynku);
        return this;
    }

    public NowyWniosek2Page numerLokaluKorespondencyjnyWpisz(String nrLokalu) {
        setWait(NumerLokalu, driver);
        NumerLokaluKorespondencyjny.sendKeys(nrLokalu);
        return this;
    }

    public NowyWniosek2Page kontynuujKlik() {
        setWaitVisible(500);
        setWait(Kontynuuj, driver);
        Kontynuuj.click();
        return this;
    }

    PobierzTekstPomoc pobierzTekstPomoc = new PobierzTekstPomoc();

    public String wezTextPustyKodPocztowy() {
        setWait(NieWypelnionoPolaKodPocztowy, driver);
        return pobierzTekstPomoc.wezTekst(NieWypelnionoPolaKodPocztowy);
    }

    public String wezTextPustyMiejscowosc() {
        setWait(NieWybranoOpcjiMiejscowosć, driver);
        return pobierzTekstPomoc.wezTekst(NieWybranoOpcjiMiejscowosć);
    }

    public String wezTextPustyUlica() {
        setWait(NieWybranoOpcjiUlica, driver);
        return pobierzTekstPomoc.wezTekst(NieWybranoOpcjiUlica);
    }

    public String wezTextPustyNumer() {
        setWait(NieWypelnionoPolaNumerBudynku, driver);
        return pobierzTekstPomoc.wezTekst(NieWypelnionoPolaNumerBudynku);
    }

    public String wezTextPustyNieruchomosc() {
        setWait(NieWybranoOpcjiRodzajNieruchomosci, driver);
        return pobierzTekstPomoc.wezTekst(NieWybranoOpcjiRodzajNieruchomosci);
    }

    public String wezTextPustyStatuswlascicielski() {
        setWait(NieWybranoOpcjiStatusWlascicielski, driver);
        return pobierzTekstPomoc.wezTekst(NieWybranoOpcjiStatusWlascicielski);
    }

    public String wezTextPustyOkresZamieszkania() {
        setWait(NieWybranoOpcjiOkresZamieszkaniaPodAdresem, driver);
        return pobierzTekstPomoc.wezTekst(NieWybranoOpcjiOkresZamieszkaniaPodAdresem);
    }


}
