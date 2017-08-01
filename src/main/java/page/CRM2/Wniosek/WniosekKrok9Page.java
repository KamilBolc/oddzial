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
public class WniosekKrok9Page extends CzekajNaElementPomoc {
    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//input[@name='kwota']")
    public WebElement Wydatki;
    @FindBy(how = How.XPATH, using = "//div[2]/div/table/tbody/tr/td[2]/div")
    public WebElement Zapisz_Wydatki;
    @FindBy(how = How.XPATH, using = "//div[@class='dhtmlx_popup_button']")
    public WebElement Zapisz_Klienta;
    @FindBy(how = How.XPATH, using = "//div[2]/div/div/div/div/fieldset/div/div/div/div/div")
    public WebElement CzynszGaz;
    @FindBy(how = How.XPATH, using = "//div[@class='btn_txt btn_txt_fixed_size' and contains(., 'Dalej')]")
    public WebElement Dalej;

    public WniosekKrok9Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WniosekKrok9Page wydatiWpisz(String kwota) {
        setWait(Wydatki, driver);
        Wydatki.sendKeys(kwota);
        return this;
    }

    public WniosekKrok9Page kategoriaWydatkuWybierz() {
        setWait(CzynszGaz, driver);
        CzynszGaz.click();
        return this;
    }

    public WniosekKrok9Page zapiszWydatkiKlik() {
        setWait(Zapisz_Wydatki, driver);
        Zapisz_Wydatki.click();
        return this;
    }

    public WniosekKrok9Page zapiszKlientaKlik() {
        setWait(Zapisz_Klienta, driver);
        Zapisz_Klienta.click();
        return this;
    }

    public WniosekKrok9Page dalejKlik() {
        setWait(Dalej, driver);
        Dalej.click();
        return this;
    }
}
