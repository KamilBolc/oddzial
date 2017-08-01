package page.CRM2;

import pomoc.CzekajNaElementPomoc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by kamil on 11.04.17.
 */
public class KlienciPage extends CzekajNaElementPomoc {
    private WebDriver driver;

    @FindBy(how = How.XPATH, using = ".//*[@id='3']")
    public WebElement Klienci;
    @FindBy(how = How.XPATH, using = ".//*[@id='236']")
    public WebElement Monitoring;
    @FindBy(how = How.XPATH, using = ".//*[@id='163']")
    public WebElement Nowy_Wniosek;
    @FindBy(how = How.XPATH, using = ".//*[@id='372']")
    public WebElement Przenies_Klienta;
    @FindBy(how = How.XPATH, using = ".//*[@id='388']")
    public WebElement Zmien_Status_Klienta;
    @FindBy(how = How.XPATH, using = ".//*[@id='707']")
    public WebElement Zgłos_Upadlosc;
    @FindBy(how = How.XPATH, using = ".//*[@id='387']")
    public WebElement Zapytanie_O_Ofertę;
    @FindBy(how = How.XPATH, using = ".//*[@id='432']")
    public WebElement Wniosek_Brelok;
    @FindBy(how = How.XPATH, using = ".//*[@id='520']")
    public WebElement Szukaj_Brelok;
    @FindBy(how = How.XPATH, using = ".//*[@id='727']")
    public WebElement Ubezpieczenia_AXA;
    @FindBy(how = How.XPATH, using = ".//*[@id='dhxtoolbar_EXFL1LAixrAC']/div[5]/div[4]")
    public WebElement Szukaj;
    @FindBy(how = How.XPATH, using = "//span[@id='764']")
    public WebElement PlatformaOddzial;


    public KlienciPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public KlienciPage klienciKlik() {
        setWait(Klienci, driver);
        Klienci.click();
        return this;
    }

    public KlienciPage nowyWniosekKlik() {
        setWait(Nowy_Wniosek, driver);
        Nowy_Wniosek.click();
        return this;
    }

    public KlienciPage platformaOddzialPlusKlik() {
        setWait(PlatformaOddzial, driver);
        PlatformaOddzial.click();
        return this;
    }

}
