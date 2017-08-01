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
public class WniosekKrok8Page extends CzekajNaElementPomoc {
    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//div[2]/div/div[5]/div/img")
    public WebElement Dodaj_Dochod;
    @FindBy(how = How.XPATH, using = "//select[@name='id_grupa_dochodu']")
    public WebElement Grupa_Dochodawa;
    @FindBy(how = How.XPATH, using = "//select[@name='id_typ_dochodu']")
    public WebElement Typ_Dochodu;
    @FindBy(how = How.XPATH, using = "//input[@name='dochod_od']")
    public WebElement Dochod_Od;
    @FindBy(how = How.XPATH, using = "//input[@name='zarobki']")
    public WebElement Zarobki;
    @FindBy(how = How.XPATH, using = "//input[@name='wyplata_dn']")
    public WebElement Dzien_Wyplaty;
    @FindBy(how = How.XPATH, using = "//select[@name='id_organ_wyplacajacy']")
    public WebElement Organ_Wypelniajacy;
    @FindBy(how = How.XPATH, using = "//div[@class='btn_txt btn_txt_fixed_size' and contains(., 'Zapisz')]")
    public WebElement Zapisz_Dochod;
    @FindBy(how = How.XPATH, using = ".//*[@class = ' ev_dhx_skyblue']'")
    public WebElement CzyJestDochod;
    @FindBy(how = How.XPATH, using = "//div[@class='btn_txt btn_txt_fixed_size' and contains(., 'Dalej')]")
    public WebElement Dalej;

    public WniosekKrok8Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WniosekKrok8Page dodajDochodKlik() {
        setWait(Dodaj_Dochod, driver);
        setWait(Dalej, driver);
        Dodaj_Dochod.click();
        return this;
    }

    public WniosekKrok8Page grupaDochodowWybierz(int id) {
        setWait(Grupa_Dochodawa, driver);
        new Select(Grupa_Dochodawa).selectByIndex(id);
        return this;
    }

    public WniosekKrok8Page typDochodowWybierz(int id) {
        setWait(Typ_Dochodu, driver);
        new Select(Typ_Dochodu).selectByIndex(id);
        return this;
    }

    public WniosekKrok8Page dochodOdWpisz(String data) {
        setWait(Dochod_Od, driver);
        Dochod_Od.sendKeys(data);
        return this;
    }

    public WniosekKrok8Page teminWyplatyWpisz(String dataTerminu) {
        setWait(Dzien_Wyplaty, driver);
        Dzien_Wyplaty.sendKeys(dataTerminu);
        return this;
    }

    public WniosekKrok8Page wysokoscDochoduWpisz(String dochod) {
        setWait(Zarobki, driver);
        Zarobki.sendKeys(dochod);
        return this;
    }

    public WniosekKrok8Page organWypelniajacyWybierz(int id) {
        setWait(Organ_Wypelniajacy, driver);
        new Select(Organ_Wypelniajacy).selectByIndex(id);
        return this;
    }

    public WniosekKrok8Page zapiszDochodKlik() {
        setWait(Zapisz_Dochod, driver);
        Zapisz_Dochod.click();
        return this;
    }

    public WniosekKrok8Page dalejKlik() {
        setWait(Dalej, driver);
        Dalej.click();
        return this;
    }
}
