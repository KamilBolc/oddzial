package page.CRM2.Wniosek;

import pomoc.CzekajNaElementPomoc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by kamil on 11.04.17.
 */
public class PrzygotowanieUmowyPage extends CzekajNaElementPomoc {
    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//div[@class='btn_txt btn_txt_fixed_size' and contains(., 'Generuj')]")
    public WebElement Generuj;
    @FindBy(how = How.XPATH, using = "//select[@name='id_medium_wyplaty']")
    public WebElement Medium_wyplaty;
    @FindBy(how = How.XPATH, using = "//div[@class='btn_txt btn_txt_fixed_size' and contains(., 'Dalej')]")
    public WebElement Dalej;

    public PrzygotowanieUmowyPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public PrzygotowanieUmowyPage generujKlik() {
        setWait(Generuj, driver);
        Generuj.click();
        setWaitVisible(5000);
        return this;
    }

    public PrzygotowanieUmowyPage mediumWyplatyWybierz(int id) {
        setWait(Medium_wyplaty, driver);
        new Select(Medium_wyplaty).selectByIndex(id);
        return this;
    }

    public PrzygotowanieUmowyPage dalejKlik() {
        setWait(Dalej, driver);
        Dalej.click();
        return this;
    }
}
