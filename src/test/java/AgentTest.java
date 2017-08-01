import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by kamil on 28.04.17.
 */
public class AgentTest {

    WebDriver driver;

    @BeforeMethod
    public void zaloguj() {
        driver = new ChromeDriver();
    }

    @Test
    public void wypełnijWniosek() {

    }
}
