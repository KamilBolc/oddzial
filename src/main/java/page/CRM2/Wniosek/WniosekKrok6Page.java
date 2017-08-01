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
public class WniosekKrok6Page extends CzekajNaElementPomoc {
    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//div[2]/div/div/div/div/div/fieldset/div/div/div/div/div")
    public WebElement Konto_Bankowe_Nie;
    @FindBy(how = How.XPATH, using = "//div[@class='dhxform_label_nav_link' and contains(text(), 'Średnie')]")
    public WebElement wyksztalcenie;
    @FindBy(how = How.XPATH, using = "//input[@name='model_rodziny_dwa_plus']")
    public WebElement modelRodzinyDwa_Plus;
    @FindBy(how = How.XPATH, using = "//div/div/div/div/div/div/div/div/div/div/div[2]/fieldset/div/div/div[2]/div/div")
    public WebElement MezatkaZonaty;
    @FindBy(how = How.XPATH, using = "//div[@class='btn_txt btn_txt_fixed_size' and contains(., 'Dalej')]")
    public WebElement Dalej;

    public WniosekKrok6Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WniosekKrok6Page wyksztalcenieWybierz() {
        setWait(wyksztalcenie, driver);
        wyksztalcenie.click();
        return this;
    }

    public WniosekKrok6Page brakKontaBankowgo() {
        setWait(Konto_Bankowe_Nie, driver);
        Konto_Bankowe_Nie.click();
        return this;
    }

    public WniosekKrok6Page model2PlusRodzinyUstaw(String liczba) {
        setWait(modelRodzinyDwa_Plus, driver);
        modelRodzinyDwa_Plus.sendKeys(liczba);
        return this;
    }

    public WniosekKrok6Page modelRodzinyUstaw() {
        setWait(MezatkaZonaty, driver);
        MezatkaZonaty.click();
        return this;
    }

    public WniosekKrok6Page dalejKlik() {
        setWait(Dalej, driver);
        Dalej.click();
        return this;
    }
}
