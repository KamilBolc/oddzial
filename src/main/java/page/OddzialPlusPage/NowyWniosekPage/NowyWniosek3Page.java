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
public class NowyWniosek3Page extends CzekajNaElementPomoc {
    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//input[@id='inupt-home-phone']")
    private WebElement TelefonStc;
    @FindBy(how = How.XPATH, using = "//input[@id='input-contact-phone-1']")
    private WebElement TelefonKontaktowy;
    @FindBy(how = How.XPATH, using = "//input[@id='input-email']")
    private WebElement Email;
    @FindBy(how = How.XPATH, using = "//a[@step='3']")
    private WebElement Kontynuuj;
    @FindBy(how = How.XPATH, using = "//div[@id='step-3']/div/div[2]/span")
    private WebElement NieWypelnionoPolaTelefonKontaktowy;


    public NowyWniosek3Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public NowyWniosek3Page telefonStacjonarnyWpisz(String numerTele) {
        setWait(TelefonStc, driver);
        TelefonStc.sendKeys(numerTele);
        return this;
    }

    public NowyWniosek3Page telefonKontaktowyWpisz(String numerTele) {
        setWait(TelefonKontaktowy, driver);
        TelefonKontaktowy.clear();
        TelefonKontaktowy.sendKeys(numerTele);
        return this;
    }

    public NowyWniosek3Page emailWpisz(String email) {
        setWait(Email, driver);
        Email.sendKeys(email);
        return this;
    }

    public NowyWniosek3Page kontynuujKlik() {
        setWait(Kontynuuj, driver);
        Kontynuuj.click();
        return this;
    }

    PobierzTekstPomoc pobierzTekstPomoc = new PobierzTekstPomoc();

    public String wezTextPustyTelKontaktowy() {
        setWait(NieWypelnionoPolaTelefonKontaktowy , driver);
        return pobierzTekstPomoc.wezTekst(NieWypelnionoPolaTelefonKontaktowy);
    }
}

