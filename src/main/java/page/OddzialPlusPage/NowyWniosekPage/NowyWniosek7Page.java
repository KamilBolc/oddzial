package page.OddzialPlusPage.NowyWniosekPage;

import pomoc.CzekajNaElementPomoc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by kamil on 13.06.17.
 */
public class NowyWniosek7Page extends CzekajNaElementPomoc {
    private WebDriver driver;


    @FindBy(how = How.XPATH, using = "//button[@data-type='ok']")
    public WebElement OK;
    @FindBy(how = How.XPATH, using = "//button[@id='print_documents']")
    public WebElement GenerujDokumenty;
    @FindBy(how = How.XPATH, using = "//div[6]/button")
    public WebElement WyslijPonownieWniosek;
    @FindBy(how = How.XPATH, using = "//p[3]/b")
    public WebElement WynikWniosku;
    @FindBy(how = How.XPATH, using = "//button[contains(.,'Wyślij wniosek')]")
    public WebElement Wyslij;
    @FindBy(how = How.XPATH, using = "//h4")
    public WebElement OczekiwanieNaDecyzje;

    public NowyWniosek7Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public NowyWniosek7Page okKlik() {
        setWaitVisible(700);
        setWait(OK, driver);
        OK.click();
        return this;
    }

    public String wezText() {
        setWait(OczekiwanieNaDecyzje, driver);
        String txt = OczekiwanieNaDecyzje.getText();
        return txt;
    }

    public NowyWniosek7Page wyslijKlik() {
        setWaitVisible(1000);
        setWait(Wyslij, driver);
        Wyslij.click();
        return this;
    }
    public NowyWniosek7Page akceptacjaKlik() {
        setWaitVisible(900);
        setWait(GenerujDokumenty, driver);
        GenerujDokumenty.click();
        return this;
    }

    public NowyWniosek7Page wyslijPonownieWniosekKlik() {
        setWaitVisible(500);
        WyslijPonownieWniosek.click();
        return this;
    }

    public String wezTextWynikWniosku() {
        setWait(WynikWniosku, driver);
        String txt = WynikWniosku.getText();
        return txt;
    }
}
