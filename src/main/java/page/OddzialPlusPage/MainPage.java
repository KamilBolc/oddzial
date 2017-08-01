package page.OddzialPlusPage;

import pomoc.CzekajNaElementPomoc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by kamil on 24.05.17.
 */
public class MainPage extends CzekajNaElementPomoc {
    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'Pulpit')]")
    public WebElement Pulpit;
    @FindBy(how = How.XPATH, using = "//a[contains(.,'Wnioski')]")
    public WebElement Wnioski;
    @FindBy(how = How.XPATH, using = "//a[contains(.,'Nowy Wniosek')]")
    public WebElement NowyWniosek;
    @FindBy(how = How.XPATH, using = "//a[contains(.,'Kalkulator')]")
    public WebElement Kalkulator;
    @FindBy(how = How.XPATH, using = "//a[contains(.,'2')]")
    public WebElement StronaDruga;
    @FindBy(how = How.XPATH, using = "//a[contains(.,'Następna')]")
    public WebElement StronaNastepna;
    @FindBy(how = How.XPATH, using = "//a[contains(.,'Ostatnia')]")
    public WebElement StronaOstatnia;
    @FindBy(how = How.XPATH, using = "//a[contains(.,' Wyloguj')]")
    public WebElement Wyloguj;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public MainPage pulpitKlik() {
        setWait(Pulpit, driver);
        Pulpit.click();
        return this;
    }

    public MainPage wnioskiKlik() {
        setWait(Wnioski, driver);
        Wnioski.click();
        return this;
    }

    public MainPage nowyWniosekKlik() {
        setWait(NowyWniosek, driver);
        setWaitVisible(500);
        NowyWniosek.click();
        return this;
    }

    public MainPage kalkulatorKlik() {
        setWait(Kalkulator, driver);
        Kalkulator.click();
        return this;
    }

    public MainPage stronaDrugaKlik() {
        setWait(StronaDruga, driver);
        StronaDruga.click();
        return this;
    }

    public MainPage stronaNastepnaKlik() {
        setWait(StronaNastepna, driver);
        StronaNastepna.click();
        return this;
    }

    public MainPage stronaOstatniaKlik() {
        setWait(StronaOstatnia, driver);
        StronaOstatnia.click();
        return this;
    }

    public MainPage wylogujKlik() {
        setWait(Wyloguj, driver);
        Wyloguj.click();
        return this;
    }
}
