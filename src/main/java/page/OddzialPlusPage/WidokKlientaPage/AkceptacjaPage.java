package page.OddzialPlusPage.WidokKlientaPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import pomoc.CzekajNaElementPomoc;

/**
 * Created by kamil on 26.07.17.
 */
public class AkceptacjaPage extends CzekajNaElementPomoc {
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
    @FindBy(how = How.XPATH, using = "//a[contains(.,' Wyloguj')]")
    public WebElement LewoOferta;
    @FindBy(how = How.XPATH, using = "//a[contains(.,' Wyloguj')]")
    public WebElement PrawoOferta;
    @FindBy(how = How.XPATH, using = "//a[@onclick='SelectOffer.RefreshOffersTable(95);']")
    public WebElement Pjm;
    @FindBy(how = How.XPATH, using = "//a[@onclick='SelectOffer.RefreshOffersTable(125);']")
    public WebElement Pr5;
    @FindBy(how = How.XPATH, using = "//a[@onclick='SelectOffer.RefreshOffersTable(63);']")
    public WebElement Szp;
    @FindBy(how = How.XPATH, using = "//a[contains(.,'Generuj dokumenty')]")
    public WebElement GenerujDokumenty;
    @FindBy(how = How.XPATH, using = "//a[contains(.,'Zmień formę wypłaty')]")
    public WebElement ZmienFormeWyplaty;
    @FindBy(how = How.XPATH, using = "//a[contains(.,'Rezygnacja Klienta')]")
    public WebElement RezygnacjaKlienta;
    @FindBy(how = How.XPATH, using = "//div[@id='modal-document']/div/div/div/button")
    private WebElement ZamknijDruk;



    public AkceptacjaPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public AkceptacjaPage historiaWnioskuKlik() {
        setWait(HistoriaWniosku, driver);
        HistoriaWniosku.click();
        return this;
    }

    public AkceptacjaPage pulpitKlik() {
        setWait(Pulpit, driver);
        Pulpit.click();
        return this;
    }

    public AkceptacjaPage wnioskiKlik() {
        setWait(Wnioski, driver);
        Wnioski.click();
        return this;
    }

    public AkceptacjaPage nowyWniosekKlik() {
        setWait(NowyWniosek, driver);
        NowyWniosek.click();
        return this;
    }

    public AkceptacjaPage loginCrmKlik() {
        setWait(LoginCRM, driver);
        LoginCRM.click();
        return this;
    }

    public AkceptacjaPage wylogujKlik() {
        setWait(Wyloguj, driver);
        Wyloguj.click();
        return this;
    }

    public AkceptacjaPage lewaOfertaKlik() {
        setWait(LewoOferta, driver);
        LewoOferta.click();
        return this;
    }

    public AkceptacjaPage prawaOfertaKlik() {
        setWait(PrawoOferta, driver);
        PrawoOferta.click();
        return this;
    }

    public AkceptacjaPage pjmKlik() {
        setWaitVisible(800);
        setWait(Pjm, driver);
        Pjm.click();
        return this;
    }

    public AkceptacjaPage szpKlik() {
        setWaitVisible(800);
        setWait(Szp, driver);
        Szp.click();
        return this;
    }

    public AkceptacjaPage pr5Klik() {
        setWaitVisible(800);
        setWait(Pr5, driver);
        Pr5.click();
        return this;
    }

    public AkceptacjaPage OfertaWybierz(String rata, String kwota) {
        WebElement Kwota = driver.findElement(By.xpath("//div[@class='inner']" + "//td[@name='"+ rata +"-"+ kwota +"']"));
        setWait(Kwota, driver);
        Kwota.click();
        return this;
    }

    public AkceptacjaPage generujDokumentyKlik() {
        setWait(GenerujDokumenty, driver);
        GenerujDokumenty.click();
        return this;
    }

    public AkceptacjaPage zmienMediumWyplatyKlik() {
        setWait(ZmienFormeWyplaty, driver);
        ZmienFormeWyplaty.click();
        return this;
    }

    public AkceptacjaPage rezygnacjaKlientaKlik() {
        setWait(RezygnacjaKlienta, driver);
        RezygnacjaKlienta.click();
        return this;
    }

    public AkceptacjaPage zamknijDrukKlik() {
        setWaitVisible(5000);
        setWait(ZamknijDruk, driver);
        ZamknijDruk.click();
        return this;
    }
}

