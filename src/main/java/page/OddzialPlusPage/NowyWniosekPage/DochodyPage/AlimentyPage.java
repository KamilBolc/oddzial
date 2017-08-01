package page.OddzialPlusPage.NowyWniosekPage.DochodyPage;

import pomoc.CzekajNaElementPomoc;
import pomoc.PobierzTekstPomoc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by kamil on 10.07.17.
 */
public class AlimentyPage extends CzekajNaElementPomoc{
    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//button[@data-id='id_typu_dochodu']")
    private WebElement TypDochodu;
    @FindBy(how = How.XPATH, using = "//span[contains(.,'Alimenty')]")
    private WebElement Alimenty;
    @FindBy(how = How.XPATH, using = "//input[@id='input-start']")
    private WebElement DataDochoduOd;
    @FindBy(how = How.XPATH, using = "//input[@id='input-start']")
    private WebElement DataDochoduDo;
    @FindBy(how = How.XPATH, using = "//input[@id='input-last']")
    private WebElement DochodKwota;
    @FindBy(how = How.XPATH, using = "//input[@id='input-payday']")
    private WebElement TerminWyplaty;
    @FindBy(how = How.XPATH, using = "//div[6]/div/div[2]/span")
    private WebElement NieWypelnionoPolaDochodZaOstatniMiesiac;
    @FindBy(how = How.XPATH, using = "//div[2]/span[2]")
    private WebElement NieWypelnionoPolaTerminWyplaty;
    @FindBy(how = How.XPATH, using = "//a[@step='7']")
    private WebElement Kontynuuj;


    public AlimentyPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public AlimentyPage typDochoduWybierzAlimenty() {
        setWait(TypDochodu, driver);
        TypDochodu.click();
        Alimenty.click();
        setWait(Alimenty, driver);
        return this;
    }

    public AlimentyPage dochodOdWpisz(String data) {
        setWait(DataDochoduOd, driver);
        DataDochoduOd.sendKeys(data);
        return this;
    }

    public AlimentyPage dochodDoWpisz(String data) {
        setWait(DataDochoduDo, driver);
        DataDochoduDo.sendKeys(data);
        return this;
    }

    public AlimentyPage kwotaWpisz(String kwota) {
        setWait(DochodKwota, driver);
        DochodKwota.sendKeys(kwota);
        return this;
    }

    public AlimentyPage terminWyplatyWpisz(String termin) {
        setWait(TerminWyplaty, driver);
        TerminWyplaty.sendKeys(termin);
        return this;
    }

    public AlimentyPage kontynuujKlik() {
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

    public String wezTextPustyTerminWyplaty() {
        setWait(NieWypelnionoPolaTerminWyplaty, driver);
        return pobierzTekstPomoc.wezTekst(NieWypelnionoPolaTerminWyplaty);
    }
}
