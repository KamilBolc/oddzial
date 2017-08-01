package page.OddzialPlusPage.NowyWniosekPage;

import pomoc.CzekajNaElementPomoc;
import pomoc.PobierzTekstPomoc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by kamil on 05.06.17.
 */
public class NowyWniosek5Page extends CzekajNaElementPomoc {
    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//button[@data-id='id_medium_wyplaty']")
    private WebElement FormaWyplaty;
    @FindBy(how = How.XPATH, using = "//span[contains(.,'Gotówka')]")
    private WebElement Gotowka;
    @FindBy(how = How.XPATH, using = "//a[@step='5']")
    public WebElement Kontynuuj;
    @FindBy(how = How.XPATH, using = "//span[contains(@class,'error')]")
    public WebElement NieWybranoOpcjiFormaWyplatyPozyczki;


    public NowyWniosek5Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public NowyWniosek5Page formaWyplatyWybierz() {
        setWait(FormaWyplaty, driver);
        FormaWyplaty.click();
        Gotowka.click();
        setWait(Gotowka, driver);
        return this;
    }

    public NowyWniosek5Page kontynuujKlik() {
        setWait(Kontynuuj, driver);
        Kontynuuj.click();
        return this;
    }

    PobierzTekstPomoc pobierzTekstPomoc = new PobierzTekstPomoc();

    public String wezTextPustyFormaWyplaty() {
        setWait(NieWybranoOpcjiFormaWyplatyPozyczki, driver);
        return pobierzTekstPomoc.wezTekst(NieWybranoOpcjiFormaWyplatyPozyczki);
    }

}

