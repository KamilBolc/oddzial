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
public class WniosekKrok4Page extends CzekajNaElementPomoc {
    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//input[@name='z_kod_pocztowy']")
    public WebElement Kod_Pocztowy;
    @FindBy(how = How.XPATH, using = "//select[@name='z_miejscowosc']")
    public WebElement Miejscowosc;
    @FindBy(how = How.XPATH, using = "//select[@name='z_ulica']")
    public WebElement Ulica;
    @FindBy(how = How.XPATH, using = "//input[@name='z_nr_budynku']")
    public WebElement Nr_Budynku;
    @FindBy(how = How.XPATH, using = "//input[@name='z_nr_lokalu']")
    public WebElement Nr_Lokalu;
    @FindBy(how = How.XPATH, using = "//select[@name='z_id_ustalono_na_podstawie']")
    public WebElement Na_Podstawie;
    @FindBy(how = How.XPATH, using = "//div[4]/div/div/div/div/fieldset/div/div/div/div/div")
    public WebElement rodzajLokalu;
    @FindBy(how = How.XPATH, using = "//div[2]/div/fieldset/div/div/div/div/div")
    public WebElement StatusWlascicielski;
    @FindBy(how = How.XPATH, using = "//div[3]/div/fieldset/div/div/div[5]/div/div")
    public WebElement OkresZamieszkania;
    @FindBy(how = How.XPATH, using = "//div[@class='btn_txt btn_txt_fixed_size' and contains(., 'Dalej')]")
    public WebElement Dalej;

    public WniosekKrok4Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WniosekKrok4Page kodPocztowyWpisz(String kodPocztowy) {
        setWait(Kod_Pocztowy, driver);
        Kod_Pocztowy.sendKeys(kodPocztowy);
        return this;
    }

    public WniosekKrok4Page miejscowoscWybierz(int id) {
        setWait(Miejscowosc, driver);
        new Select(Miejscowosc).selectByIndex(id);
        return this;
    }

    public WniosekKrok4Page uliceWybierz(int id) {
        setWait(Ulica, driver);
        new Select(Ulica).selectByIndex(id);
        return this;
    }

    public WniosekKrok4Page nrBudynkuWpisz(String nrBudynku) {
        setWait(Nr_Budynku, driver);
        Nr_Budynku.sendKeys(nrBudynku);
        return this;
    }

    public WniosekKrok4Page nrLokaluWpisz(String nrLokalu) {
        setWait(Nr_Lokalu, driver);
        Nr_Lokalu.sendKeys(nrLokalu);
        return this;
    }

    public WniosekKrok4Page naPodstawieWybierz(int id) {
        setWait(Na_Podstawie, driver);
        new Select(Na_Podstawie).selectByIndex(id);
        return this;
    }

    public WniosekKrok4Page miejsceZamieszkaniaWybierz() {
        setWait(rodzajLokalu, driver);
        rodzajLokalu.click();
        return this;
    }

    public WniosekKrok4Page okresZamieszkaniaWybierz() {
        setWait(OkresZamieszkania, driver);
        OkresZamieszkania.click();
        return this;
    }

    public WniosekKrok4Page statusWlascicielskiWybierz() {
        setWait(StatusWlascicielski, driver);
        StatusWlascicielski.click();
        return this;
    }

    public WniosekKrok4Page dalejKlik() {
        setWait(Dalej, driver);
        Dalej.click();
        return this;
    }
}
