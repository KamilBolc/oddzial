package page.CRM2.Wniosek;

import pomoc.CzekajNaElementPomoc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by kamil on 11.04.17.
 */
public class WniosekKrok5Page extends CzekajNaElementPomoc {
    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//input[@name='stac_numer']")
    public WebElement Stacjonarny_Nr;
    @FindBy(how = How.XPATH, using = "//input[@name='kom_numer']")
    public WebElement Komorkowy_Nr;
    @FindBy(how = How.XPATH, using = "//input[@name='kont1_numer']")
    public WebElement Inny_Telefon;
    @FindBy(how = How.XPATH, using = "//div[3]/div/div/div[2]/div/fieldset/div/div[2]/div/div/div")
    public WebElement Typ;
    @FindBy(how = How.XPATH, using = "//div[5]/div/div/div/div/div/div/table/tbody/tr/td/div/div[2]/div/div/div/div[9]/div/div/div/div[2]/div/div/div[3]/div/div/div")
    public WebElement CzyAdresEmail;
    @FindBy(how = How.XPATH, using = "//input[@name='email']")
    public WebElement Email;
    @FindBy(how = How.XPATH, using = "//div[@class='btn_txt btn_txt_fixed_size' and contains(., 'Dalej')]")
    public WebElement Dalej;

    public WniosekKrok5Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WniosekKrok5Page stracjonarnyWpisz(String StacjonarnyNr) {
        setWait(Stacjonarny_Nr, driver);
        Stacjonarny_Nr.sendKeys(StacjonarnyNr);
        return this;
    }

    public WniosekKrok5Page komorkowyWpisz(String KomorkowyNr) {
        setWait(Komorkowy_Nr, driver);
        Komorkowy_Nr.sendKeys(KomorkowyNr);
        return this;
    }

    public WniosekKrok5Page innyTelWpisz(String InnyNr) {
        setWait(Inny_Telefon, driver);
        Inny_Telefon.sendKeys(InnyNr);
        return this;
    }

    public WniosekKrok5Page typTelWybierz() {
        setWait(Typ, driver);
        Typ.click();
        return this;
    }

    public WniosekKrok5Page czyPosiadaEmailWybierz() {
        setWait(CzyAdresEmail, driver);
        CzyAdresEmail.click();
        return this;
    }

    public WniosekKrok5Page emailWpisz(String EmailZmienna) {
        setWait(Email, driver);
        Email.sendKeys(EmailZmienna);
        return this;
    }

    public WniosekKrok5Page dalejKlik() {
        setWait(Dalej, driver);
        Dalej.click();
        return this;
    }
}
