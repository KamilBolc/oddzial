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
public class WniosekKrok2Page extends CzekajNaElementPomoc {
    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//select[@name='id_oddzialu']")
    public WebElement Oddzial;
    @FindBy(how = How.XPATH, using = "//input[@name='kwota_zadana']")
    public WebElement Kwota_wnioskowana;
    @FindBy(how = How.XPATH, using = "//select[@name='id_grupy_produktu']")
    public WebElement id_produktu;
    @FindBy(how = How.XPATH, using = "//div[@class='dhxform_label_nav_link' and contains(text(), 'Telewizja')]")
    public WebElement skadKlientDowiedzialSieOOfercie;
    @FindBy(how = How.XPATH, using = "//select[@name='id_zrodla_pozyskania_szczegol']")
    public WebElement Uszczegulowienie_skad_klient;
    @FindBy(how = How.XPATH, using = "//div[18]/div/div/div/div/fieldset/div/div/div/div[2]/div")
    public WebElement Miejsce_Oddzial;
    @FindBy(how = How.XPATH, using = "//select[@name=\'czy_zainteresowany_ubezpieczeniem\']")
    public WebElement CzyZainteresowanyUbezpieczeniem;
    @FindBy(how = How.XPATH, using = "//div[@class='btn_txt btn_txt_fixed_size' and contains(., 'Dalej')]")
    public WebElement Dalej;

    public WniosekKrok2Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WniosekKrok2Page oddzialWybierz(String oddzial) {
        setWait(Oddzial, driver);
        Oddzial.sendKeys(oddzial);
        return this;
    }

    public WniosekKrok2Page wnioskowanaKwota(String kwota) {
        setWait(Kwota_wnioskowana, driver);
        Kwota_wnioskowana.clear();
        Kwota_wnioskowana.sendKeys(kwota);
        return this;
    }

    public WniosekKrok2Page produktWybierz(String produkt) {
        setWait(id_produktu, driver);
        new Select(id_produktu).selectByVisibleText(produkt);
        return this;
    }

    public WniosekKrok2Page skadKlientDowiedzialSieOOfercie() {
        setWait(skadKlientDowiedzialSieOOfercie, driver);
        skadKlientDowiedzialSieOOfercie.click();
        return this;
    }

    public WniosekKrok2Page uszczegulowienieSkadKlientDowiedzialSieOOfercieWybierz(int id) {
        setWait(Uszczegulowienie_skad_klient, driver);
        new Select(Uszczegulowienie_skad_klient).selectByIndex(id);
        return this;
    }

    public WniosekKrok2Page czyZainteresowanyUbezpieczeniem(int id) {
        setWait(CzyZainteresowanyUbezpieczeniem, driver);
        new Select(CzyZainteresowanyUbezpieczeniem).selectByIndex(id);
        return this;
    }

    public WniosekKrok2Page oddzialKlik() {
        setWait(Miejsce_Oddzial, driver);
        Miejsce_Oddzial.click();
        return this;
    }

    public WniosekKrok2Page dalejKlik() {
        setWait(Dalej, driver);
        Dalej.click();
        return this;
    }
}
