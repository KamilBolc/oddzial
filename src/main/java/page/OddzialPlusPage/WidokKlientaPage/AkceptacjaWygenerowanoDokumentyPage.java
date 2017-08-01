package page.OddzialPlusPage.WidokKlientaPage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import pomoc.CzekajNaElementPomoc;

/**
 * Created by kamil on 27.07.17.
 */
public class AkceptacjaWygenerowanoDokumentyPage extends CzekajNaElementPomoc{
    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//a[contains(.,' Historia Wniosku')]")
    public WebElement HistoriaWniosku;
    @FindBy(how = How.XPATH, using = "//a[contains(.,'Pulpit')]")
    public WebElement Pulpit;
    @FindBy(how = How.XPATH, using = "//a[contains(.,'Wnioski')]")
    public WebElement Wnioski;
    @FindBy(how = How.XPATH, using = "//a[contains(.,'+ Nowy Wniosek')]")
    public WebElement NowyWniosek;
    @FindBy(how = How.XPATH, using = "//a[contains(.,'LoginCRM')]")
    public WebElement LoginCRM;
    @FindBy(how = How.XPATH, using = "//i[@class='icon-logout']")
    public WebElement Wyloguj;
    @FindBy(how = How.XPATH, using = "//a[contains(.,'dokumenty')]")
    public WebElement Dokumenty;
    @FindBy(how = How.XPATH, using = "//input[@id='file-do']")
    public WebElement DowodOsobisty;
    @FindBy(how = How.XPATH, using = "//input[@id='file-4']")
    public WebElement SkanDochodowy;
    @FindBy(how = How.XPATH, using = "//input[@id='file-6']")
    public WebElement Harmonogram;
    @FindBy(how = How.XPATH, using = "//input[@id='file-3']")
    public WebElement PotwierdzenieAdresuZamieszkania;
    @FindBy(how = How.XPATH, using = "//input[@id='file-5']")
    public WebElement Umowa;
    @FindBy(how = How.XPATH, using = "//input[@id='file-7']")
    public WebElement WniosekOPozyczke;
    @FindBy(how = How.XPATH, using = "//button[@id='upload-files']")
    public WebElement wyslijZalaczoneDokumenty;
    @FindBy(how = How.XPATH, using = "//a[contains(.,'Rezygnacja Klienta')]")
    public WebElement RezygnacjaKlienta;
    @FindBy(how = How.XPATH, using = "//span[contains(.,'Dodaj plik')]")
    public WebElement DodajPlik;

    public AkceptacjaWygenerowanoDokumentyPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public AkceptacjaWygenerowanoDokumentyPage historiaWnioskuKlik() {
        setWait(HistoriaWniosku, driver);
        HistoriaWniosku.click();
        return this;
    }

    public AkceptacjaWygenerowanoDokumentyPage pulpitKlik() {
        setWait(Pulpit, driver);
        Pulpit.click();
        return this;
    }

    public AkceptacjaWygenerowanoDokumentyPage wnioskiKlik() {
        setWait(Wnioski, driver);
        Wnioski.click();
        return this;
    }

    public AkceptacjaWygenerowanoDokumentyPage nowyWniosekKlik() {
        setWait(NowyWniosek, driver);
        NowyWniosek.click();
        return this;
    }

    public AkceptacjaWygenerowanoDokumentyPage loginCrmKlik() {
        setWait(LoginCRM, driver);
        LoginCRM.click();
        return this;
    }

    public AkceptacjaWygenerowanoDokumentyPage wylogujKlik() {
        setWait(Wyloguj, driver);
        Wyloguj.click();
        return this;
    }

    public AkceptacjaWygenerowanoDokumentyPage dokumentyKlik() {
        setWait(Dokumenty, driver);
        Dokumenty.click();
        return this;
    }

    public AkceptacjaWygenerowanoDokumentyPage dodajSkany() {
        if (driver instanceof JavascriptExecutor) {
            ((JavascriptExecutor)driver).executeScript("$('#file-do').show();");
        } else {
            throw new IllegalStateException("This driver does not support JavaScript!");
        }
        setWait(Dokumenty, driver);
        DowodOsobisty.clear();
        DowodOsobisty.sendKeys("/home/kamil/Obrazy/index.jpeg");
        DodajPlik.click();
        SkanDochodowy.sendKeys("/home/kamil/Obrazy/index.jpeg");
        Harmonogram.sendKeys("/home/kamil/Obrazy/index1.jpeg");
        PotwierdzenieAdresuZamieszkania.sendKeys("/home/kamil/Obrazy/index2.jpeg");
        Umowa.sendKeys("/home/kamil/Obrazy/index2.jpeg");
        WniosekOPozyczke.sendKeys("/home/kamil/Obrazy/index2.jpeg");
        return this;
    }


    public AkceptacjaWygenerowanoDokumentyPage rezygnacjaKlientaKlik() {
        setWait(RezygnacjaKlienta, driver);
        RezygnacjaKlienta.click();
        return this;
    }

}
