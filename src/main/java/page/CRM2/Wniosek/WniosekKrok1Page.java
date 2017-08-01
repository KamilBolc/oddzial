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
public class WniosekKrok1Page extends CzekajNaElementPomoc {
    public WebDriver driver;

    @FindBy(how = How.XPATH, using = "//input[@name='pesel']")
    public WebElement PeselIn;

    @FindBy(how = How.XPATH, using = "//div[@class='btn_txt']")
    public WebElement WyszukajButton;

    @FindBy(how = How.XPATH, using = "//div/div[@class='dhxform_item_template']")
    public WebElement komunikat;

    @FindBy(how = How.XPATH, using = "//div[@class='btn_txt btn_txt_fixed_size' and contains(., 'Dalej')]")
    public WebElement Dalej;

    public WniosekKrok1Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WniosekKrok1Page peselUzupelnij(String pesel) {
        setWait(PeselIn, driver);
        PeselIn.sendKeys(pesel);
        return this;
    }

    public WniosekKrok1Page wyszukajKlik() {
        setWait(WyszukajButton, driver);
        WyszukajButton.click();
        setWaitVisible(250);
        return this;
    }

    public WniosekKrok1Page dalejKlik() {
        setWait(komunikat, driver);
        setWait(Dalej, driver);
        Dalej.click();
        return this;
    }

}
