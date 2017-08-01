package page.CRM2.Wniosek;

import pomoc.CzekajNaElementPomoc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by kamil on 11.04.17.
 */
public class PodpisanieUmowyPage extends CzekajNaElementPomoc {
    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//div[3]/div/div/table/tbody/tr/td[2]/div")
    public WebElement Potwierdz_Podpisanie;
    @FindBy(how = How.XPATH, using = "//div[@class='dhtmlx_popup_button']")
    public WebElement Podpisanie_Umowy_Ok;
    @FindBy(how = How.XPATH, using = "//div[@class='btn_txt btn_txt_fixed_size' and contains(., 'Koniec')]")
    public WebElement Koniec;
    @FindBy(how = How.XPATH, using = "//div/div[@class='dhtmlx_popup_title' and contains(text(), 'Podpisanie umowy - błąd')]")
    public WebElement Brak_kasy;

    public PodpisanieUmowyPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public PodpisanieUmowyPage koniecKlik() {
        setWait(Koniec, driver);
        Koniec.click();
        return this;
    }

    public PodpisanieUmowyPage okejKlik() {
        setWait(Podpisanie_Umowy_Ok, driver);
        Podpisanie_Umowy_Ok.click();
        return this;
    }

    public PodpisanieUmowyPage potwierdzPodpisanieKlik() {
        setWait(Potwierdz_Podpisanie, driver);
        Potwierdz_Podpisanie.click();
        return this;
    }


}
