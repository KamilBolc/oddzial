package page.CRM2.WidokKlienta;

import pomoc.CzekajNaElementPomoc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by kamil on 19.04.17.
 */
public class WidokKlientaPage extends CzekajNaElementPomoc {
    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//tr[3]/td[7][contains(text(),.)]")
    public WebElement MKS;
    @FindBy(how = How.XPATH, using = ".//*[@id='password']")
    public WebElement Haslo;
    @FindBy(how = How.XPATH, using = ".//*[@id='login-box']/a/img")
    public WebElement Zaloguj;

    public WidokKlientaPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String MKSWezWartość() {
        setWait(MKS, driver);
        String mks = MKS.getText();
        System.out.println(mks);
        return mks;
    }
}
