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
public class WniosekKrok7Page extends CzekajNaElementPomoc {
    WebDriver driver;

    @FindBy(how = How.XPATH, using = ".//*[contains(text(),'Zaznacz wszystkie')]")
    public WebElement Oswiadczenia_Zaznacz_Wszystkie;
    @FindBy(how = How.XPATH, using = "//div[@class='btn_txt btn_txt_fixed_size' and contains(., 'Dalej')]")
    public WebElement Dalej;

    public WniosekKrok7Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WniosekKrok7Page zaznaczWszystkoKlik() {
        setWait(Oswiadczenia_Zaznacz_Wszystkie, driver);
        Oswiadczenia_Zaznacz_Wszystkie.click();
        return this;
    }

    public WniosekKrok7Page dalejKlik() {
        setWait(Dalej, driver);
        Dalej.click();
        return this;
    }
}
