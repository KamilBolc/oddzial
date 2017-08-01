package OddzialPlusTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import page.CRM2.LogowaniePage;
import ustawienia.Ustawienia;
import ustawienia.UstawieniaLoader;

/**
 * Created by kamil on 12.06.17.
 */
public class MainOddzialPlusTest {

    protected WebDriver driver;


    UstawieniaLoader ustawieniaLoader = new UstawieniaLoader(System.getProperty("user.dir") + "/configuration/auth_properties.properties");
    Ustawienia ustaw = ustawieniaLoader.zaladuj();

    @BeforeClass
    public void otworzPrzegladarke(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + ustaw.getCHROME());
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + ustaw.getGECKO());
        driver = new ChromeDriver();
        LogowaniePage logowaniePage = new LogowaniePage(driver);
        driver.manage().window().maximize();
        logowaniePage.otworzUrl(ustaw.getURL());
    }


}
