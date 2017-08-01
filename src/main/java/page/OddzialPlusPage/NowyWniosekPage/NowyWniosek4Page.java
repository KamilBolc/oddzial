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
public class NowyWniosek4Page extends CzekajNaElementPomoc {
    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//button[@data-id='id_wyksztalcenie']")
    private WebElement Wyksztalcenie;
    @FindBy(how = How.XPATH, using = "//span[contains(.,'Wyższe licencjat')]")
    private WebElement WyzszeLicencjat;
    @FindBy(how = How.XPATH, using = "//button[@data-id='id_stan_cywilny']")
    private WebElement StanCywilny;
    @FindBy(how = How.XPATH, using = "//span[contains(.,'Mężatka/Żonaty')]")
    private WebElement MezatkaZonaty;
    @FindBy(how = How.XPATH, using = "//input[@id='input-children']")
    private WebElement LiczbaDzieci;
    @FindBy(how = How.XPATH, using = "//a[@step='4']")
    private WebElement Kontynuuj;
    @FindBy(how = How.XPATH, using = "//div[@id='step-4']/div/div[2]/span")
    private WebElement NieWybranoOpcjiWyksztalcenie;
    @FindBy(how = How.XPATH, using = "//div[@id='step-4']/div/div[2]/span[2]")
    private WebElement NieWybranoOpcjiStanCywilny;
    @FindBy(how = How.XPATH, using = "//div[@id='step-4']/div/div[2]/span[3]")
    private WebElement NieWypelnionoPolaLiczbaDzieci;

    public NowyWniosek4Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public NowyWniosek4Page wyksztalcenieWybierz() {
        setWait(Wyksztalcenie, driver);
        Wyksztalcenie.click();
        WyzszeLicencjat.click();
        setWait(WyzszeLicencjat, driver);
        return this;
    }

    public NowyWniosek4Page stanCywilnyWybierz() {
        setWait(StanCywilny, driver);
        StanCywilny.click();
        MezatkaZonaty.click();
        setWait(MezatkaZonaty, driver);
        return this;
    }

    public NowyWniosek4Page liczbaDzieciWpisz(String liczba) {
        setWait(LiczbaDzieci, driver);
        LiczbaDzieci.sendKeys(liczba);
        return this;
    }

    public NowyWniosek4Page kontynuujKlik() {
        setWait(Kontynuuj, driver);
        Kontynuuj.click();
        return this;
    }

    PobierzTekstPomoc pobierzTekstPomoc = new PobierzTekstPomoc();

    public String wezTextPustyWyksztalcenie() {
        setWait(NieWybranoOpcjiWyksztalcenie , driver);
        return pobierzTekstPomoc.wezTekst(NieWybranoOpcjiWyksztalcenie);
    }

    public String wezTextPustyStanCywilny() {
        setWait(NieWybranoOpcjiStanCywilny , driver);
        return pobierzTekstPomoc.wezTekst(NieWybranoOpcjiStanCywilny);
    }

    public String wezTextPustyLiczbaDzieci() {
        setWait(NieWypelnionoPolaLiczbaDzieci , driver);
        return pobierzTekstPomoc.wezTekst(NieWypelnionoPolaLiczbaDzieci);
    }

}
