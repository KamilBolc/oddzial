package pomoc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.OddzialPlusPage.NowyWniosekPage.NowyWniosek7Page;

/**
 * Created by kamil on 12.04.17.
 */
public class CzekajNaElementPomoc {

    WebDriverWait wait;

    public boolean setWait(WebElement element, WebDriver driver) {
        wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        return false;
    }

    public synchronized void setWaitVisible(int time) {
        try {
            wait(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void czekajNaTekst(String Tekst, WebDriver driver){
        NowyWniosek7Page nowyWniosek7Page = new NowyWniosek7Page(driver);
        for (int i=0; i<2; i++) {
            setWaitVisible(26000);
        String wynikwniosk = nowyWniosek7Page.wezTextWynikWniosku();
        if (Tekst.equals(wynikwniosk)) {
            nowyWniosek7Page.akceptacjaKlik();
            break;
        } else {
            nowyWniosek7Page.wyslijPonownieWniosekKlik();
            setWaitVisible(10000);
        }
    }
    }
}

