package pomoc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by kamil on 07.07.17.
 */
public class PobierzTekstPomoc {

    public String wezTekst(WebElement element) {
        String txt = element.getText();
        return txt;
    }

    public void ustawWXpathZmienneDynamiczne(WebElement element, WebDriver driver, String pierwszyElement, String drugiElement){
        WebElement Kwota = driver.findElement(By.xpath("//div[@class='inner']" + "//td[@name='"+ pierwszyElement +"-"+ drugiElement +"']"));
    }
}
