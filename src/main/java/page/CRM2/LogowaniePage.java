package page.CRM2;

import ustawienia.Ustawienia;
import ustawienia.UstawieniaLoader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by kamil on 11.04.17.
 */
public class LogowaniePage {
    private WebDriver driver;

    UstawieniaLoader ustawieniaLoader = new UstawieniaLoader(System.getProperty("user.dir") + "/configuration/user_properties.properties");
    Ustawienia ustaw = ustawieniaLoader.zaladuj();

    @FindBy(how = How.XPATH, using = ".//*[@id='login']")
    public WebElement Login;
    @FindBy(how = How.XPATH, using = ".//*[@id='password']")
    public WebElement Haslo;
    @FindBy(how = How.XPATH, using = ".//*[@id='login-box']/a/img")
    public WebElement Zaloguj;

    public LogowaniePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public LogowaniePage otworzUrl(String url) {
        driver.get(url);
        return this;
    }

    public LogowaniePage wpiszHasloAdmin() {
        Haslo.sendKeys(ustaw.getHasloCentrala().toString());
        return this;
    }

    public LogowaniePage wpiszLoginAdmin() {
        Login.sendKeys(ustaw.getLoginAdmina().toString());
        return this;
    }

    public LogowaniePage wpiszHasloDK() {
        Haslo.sendKeys(ustaw.getHasloOdzial().toString());
        return this;
    }

    public LogowaniePage wpiszLoginDK() {
        Login.sendKeys(ustaw.getDoradca().toString());
        return this;
    }

    public LogowaniePage wcisnijZaloguj() {
        Zaloguj.click();
        return this;
    }

}
