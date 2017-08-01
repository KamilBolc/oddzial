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
public class WniosekKrok3Page extends CzekajNaElementPomoc {
    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//input[@name='nazwisko']")
    public WebElement Nazwisko;
    @FindBy(how = How.XPATH, using = "//input[@name='imie']")
    public WebElement Imie;
    @FindBy(how = How.XPATH, using = "//input[@name='imie_ojca']")
    public WebElement Imie_Ojca;
    @FindBy(how = How.XPATH, using = "//input[@name='imie_matki']")
    public WebElement Imie_Matki;
    @FindBy(how = How.XPATH, using = "//input[@name='nazwisko_rodowe_matki']")
    public WebElement Nazwisko_Matki;
    @FindBy(how = How.XPATH, using = "//input[@name='nr_dowodu_osobistego']")
    public WebElement Numer_Dowodu;
    @FindBy(how = How.XPATH, using = ".//*[@name='waznosc_nr_dowodu_osobistego']")
    public WebElement WaznoscDowoduOsobistego;
    @FindBy(how = How.XPATH, using = "//div[7]/div/div/div[3]/div/div[2]/div")
    public WebElement Brak_Ważności;
    @FindBy(how = How.XPATH, using = "//div[@class='btn_txt btn_txt_fixed_size' and contains(., 'Dalej')]")
    public WebElement Dalej;

    public WniosekKrok3Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WniosekKrok3Page nazwiskoWpisz(String nazwisko) {
        setWait(Nazwisko, driver);
        Nazwisko.sendKeys(nazwisko);
        return this;
    }

    public WniosekKrok3Page imieWpisz(String imie) {
        setWait(Imie, driver);
        Imie.sendKeys(imie);
        return this;
    }

    public WniosekKrok3Page imieOjcaWpisz(String imieOjca) {
        setWait(Imie_Ojca, driver);
        Imie_Ojca.sendKeys(imieOjca);
        return this;
    }

    public WniosekKrok3Page imieMatkiWpisz(String imieMatki) {
        setWait(Imie_Matki, driver);
        Imie_Matki.sendKeys(imieMatki);
        return this;
    }

    public WniosekKrok3Page nazwiskoMatkiWpisz(String nazwiskoMatki) {
        setWait(Nazwisko_Matki, driver);
        Nazwisko_Matki.sendKeys(nazwiskoMatki);
        return this;
    }

    public WniosekKrok3Page nrDowoduWpisz(String nrDowodu) {
        setWait(Numer_Dowodu, driver);
        Numer_Dowodu.sendKeys(nrDowodu);
        return this;
    }

    public WniosekKrok3Page waznoscDowoduWpisz(String waznoscDowodu) {
        setWait(WaznoscDowoduOsobistego, driver);
        WaznoscDowoduOsobistego.sendKeys(waznoscDowodu);
        return this;
    }

    public WniosekKrok3Page brakWaznosciKlik() {
        setWait(Brak_Ważności, driver);
        Brak_Ważności.click();
        return this;
    }

    public WniosekKrok3Page dalejKlik() {
        setWait(Dalej, driver);
        Dalej.click();
        return this;
    }

}
