import page.CRM2.LogowaniePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.util.Random;

/**
 * Created by kamil on 11.04.17.
 */
public class MainTest {
    WebDriver driver;

    @BeforeClass
    public void zalogujSie() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/lib/chromedriver");
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/lib/geckodriver");
        driver = new ChromeDriver();
        LogowaniePage logowaniePage = new LogowaniePage(driver);
        driver.manage().window().maximize();
        logowaniePage.otworzUrl("https://dev1.capitalservice.pl/auth")
                .wpiszHasloAdmin()
                .wpiszLoginAdmin()
                .wcisnijZaloguj();
    }

    Random random = new Random();

    public String liczba() {
        int a = random.nextInt(100);
        String liczba = String.valueOf(a);
        return liczba;
    }

}