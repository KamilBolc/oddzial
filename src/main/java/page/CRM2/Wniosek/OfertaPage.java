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
public class OfertaPage extends CzekajNaElementPomoc {
    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//div[@class='jslider-pointer']")
    public WebElement Punkt_Kwota;
    @FindBy(how = How.XPATH, using = "//div[@class='jslider-bg']/i[2]")
    public WebElement Tor_Kwota;
    @FindBy(how = How.XPATH, using = "//div[2]/div/div[5]/div/div")
    public WebElement Zbadaj_Zdolnosc_Emeryta;
    @FindBy(how = How.XPATH, using = "//div[5]/div/div/div/div/div/div/table/tbody/tr/td/div/div[2]/div/div/div/div[2]/div/table/tbody/tr/td[2]/div")
    public WebElement Zbadaj_Zdolnosc_Rozpocznij_Weryfikacje;
    @FindBy(how = How.XPATH, using = "//div[@class='dhtmlx_popup_button']")
    public WebElement Zbadaj_Zdolnosc_OK;
    @FindBy(how = How.XPATH, using = "//td/div/img")
    public WebElement Plusik;
    @FindBy(how = How.XPATH, using = "//td[6]/img")
    public WebElement Oferta_Radio;
    @FindBy(how = How.XPATH, using = "//tr/td[5][@valign='middle' and contains(., 'Tak')]")
    public WebElement CzyDostepnyTak;
    @FindBy(how = How.XPATH, using = "//div[@class='btn_txt btn_txt_fixed_size' and contains(., 'Dalej')]")
    public WebElement Dalej;

    public OfertaPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public OfertaPage proceduryPlusKlik() {
        setWait(Plusik, driver);
        setWait(Punkt_Kwota, driver);
        setWait(Tor_Kwota, driver);
        setWait(Plusik, driver);
        setWait(CzyDostepnyTak, driver);
        Plusik.click();
        return this;
    }

    public OfertaPage proceduryWybierz() {
        setWait(Oferta_Radio, driver);
        Oferta_Radio.click();
        setWaitVisible(2000);
        return this;
    }

    public OfertaPage dalejKlik() {
        setWait(Dalej, driver);
        Dalej.click();
        return this;
    }

}
