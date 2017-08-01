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
public class WniosekKrok10Page extends CzekajNaElementPomoc {
    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//input[@class='dhx_uploader_input']")
    public WebElement Dodaj_Skany;
    @FindBy(how = How.XPATH, using = ".//*[@class='dhx_file_uploader_button button_info']")
    public WebElement Dodaj_Skany_Button;
    @FindBy(how = How.XPATH, using = "//div[@title='Upload']")
    public WebElement Upload_Skany;
    @FindBy(how = How.XPATH, using = "//div[@class='dhx_file_uploader_button button_clear']")
    public WebElement Usun_Skan;
    @FindBy(how = How.XPATH, using = "//select")
    public WebElement Skany_Select1;
    @FindBy(how = How.XPATH, using = "//div[2]/div/select")
    public WebElement Skany_Select2;
    @FindBy(how = How.XPATH, using = "//div[3]/div/select")
    public WebElement Skany_Select3;
    @FindBy(how = How.XPATH, using = "//div[4]/div/select")
    public WebElement Skany_Select4;
    @FindBy(how = How.XPATH, using = "//div[@class='btn_txt btn_txt_fixed_size' and contains(., 'Dalej')]")
    public WebElement Dalej;

    public WniosekKrok10Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WniosekKrok10Page wrzucSkanyKlik() {
        setWait(Upload_Skany, driver);
        Upload_Skany.click();
        return this;
    }

    public WniosekKrok10Page dodajSkany() {
        setWait(Dodaj_Skany_Button, driver);
        Dodaj_Skany.sendKeys("/home/kamil/Obrazy/3_43274604.jpg");
        Dodaj_Skany.sendKeys("/home/kamil/Obrazy/index.jpeg");
        Dodaj_Skany.sendKeys("/home/kamil/Obrazy/index1.jpeg");
        Dodaj_Skany.sendKeys("/home/kamil/Obrazy/index2.jpeg");
        Upload_Skany.click();
        return this;
    }

    public WniosekKrok10Page wybierzTypSkanow() {
        setWait(Skany_Select1, driver);
        setWait(Skany_Select4, driver);
        new Select(Skany_Select1).selectByIndex(0);
        new Select(Skany_Select2).selectByIndex(1);
        new Select(Skany_Select3).selectByIndex(2);
        new Select(Skany_Select4).selectByIndex(6);
        return this;
    }

    public WniosekKrok10Page dalejKlik() {
        setWait(Dalej, driver);
        Dalej.click();
        return this;
    }

}
