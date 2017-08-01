
package page.OddzialPlusPage.NowyWniosekPage.DochodyPage;

import pomoc.CzekajNaElementPomoc;
import pomoc.PobierzTekstPomoc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


/*
Created by kamil on 07.07.17.
 **/

public class EmeryturaPage extends CzekajNaElementPomoc{
    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//button[@data-id='id_typu_dochodu']")
    private WebElement TypDochodu;
    @FindBy(how = How.XPATH, using = "//span[contains(.,'Emerytura')]")
    private WebElement Emerytura;
    @FindBy(how = How.XPATH, using = "//input[@id='input-start']")
    private WebElement DataDochoduOd;
    @FindBy(how = How.XPATH, using = "//input[@id='input-last']")
    private WebElement DochodKwota;
    @FindBy(how = How.XPATH, using = "//input[@id='input-payday']")
    private WebElement TerminWyplaty;
    @FindBy(how = How.XPATH, using = "//input[@id='input-employer']")
    private WebElement OrganWypelniajacy;
    @FindBy(how = How.XPATH, using = "//input[@id='input-miesieczne_zobowiazania_kredytowe']")
    private WebElement ZobowiazaniaKredytowe;
    @FindBy(how = How.XPATH, using = "//div[6]/div/div[2]/span")
    private WebElement NieWypelnionoPolaDochodZaOstatniMiesiac;
    @FindBy(how = How.XPATH, using = "//div[2]/span[2]")
    private WebElement NieWypelnionoPolaTerminWyplaty;
    @FindBy(how = How.XPATH, using = "//div[@id='div-dochod-glowny']/span[3]")
    private WebElement NieWypelnionoPolaOrganWyplacajacy;
    @FindBy(how = How.XPATH, using = "//a[@step='7']")
    private WebElement Kontynuuj;


    public EmeryturaPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public EmeryturaPage typDochoduWybierzEmerytura() {
        setWait(TypDochodu, driver);
        TypDochodu.click();
        Emerytura.click();
        setWait(Emerytura, driver);
        return this;
    }

    public EmeryturaPage dochodOdWpisz(String data) {
        setWait(DataDochoduOd, driver);
        DataDochoduOd.sendKeys(data);
        return this;
    }

    public EmeryturaPage kwotaWpisz(String kwota) {
        setWait(DochodKwota, driver);
        DochodKwota.sendKeys(kwota);
        return this;
    }

    public EmeryturaPage terminWyplatyWpisz(String termin) {
        setWait(TerminWyplaty, driver);
        TerminWyplaty.sendKeys(termin);
        return this;
    }

    public EmeryturaPage organWypelniajacyWpisz(String txt) {
        setWait(OrganWypelniajacy, driver);
        OrganWypelniajacy.sendKeys(txt);
        return this;
    }

    public EmeryturaPage kontynuujKlik() {
        setWaitVisible(1000);
        setWait(Kontynuuj, driver);
        Kontynuuj.click();
        return this;
    }

    PobierzTekstPomoc pobierzTekstPomoc = new PobierzTekstPomoc();

    public String wezTextPustyDochodZaOstatniMiesiac() {
        setWait(NieWypelnionoPolaDochodZaOstatniMiesiac, driver);
        return pobierzTekstPomoc.wezTekst(NieWypelnionoPolaDochodZaOstatniMiesiac);
    }

    public String wezTextPustyTerminWyplaty() {
        setWait(NieWypelnionoPolaTerminWyplaty, driver);
        return pobierzTekstPomoc.wezTekst(NieWypelnionoPolaTerminWyplaty);
    }

    public String wezTextPustyOrganWyplacajacy() {
        setWait(NieWypelnionoPolaOrganWyplacajacy, driver);
        return pobierzTekstPomoc.wezTekst(NieWypelnionoPolaOrganWyplacajacy);
    }
}

