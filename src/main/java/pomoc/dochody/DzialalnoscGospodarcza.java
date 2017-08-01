package pomoc.dochody;

import org.openqa.selenium.WebDriver;
import page.OddzialPlusPage.NowyWniosekPage.DochodyPage.DzialalnoscGospodarczaPage;

/**
 * Created by kamil on 11.07.17.
 */
public class DzialalnoscGospodarcza extends DochodyAbstract{

    public DzialalnoscGospodarcza (WebDriver driver) {
        super(driver);
    }

    DzialalnoscGospodarczaPage dzialalnoscGospodarczaPage = new DzialalnoscGospodarczaPage(driver);

    public void uruchomSprawdzanieWymagalnosciPolDlaDochodu() {
        dzialalnoscGospodarczaPage.typDochoduWybierzDzialalnoscGospodarcza()
                .kontynuujKlik();
    }

    public void uruchomUzupelnianiePolDochodu(){
        dzialalnoscGospodarczaPage.typDochoduWybierzDzialalnoscGospodarcza()
                .dochodOdWpisz("2015-05-05")
                .kwotaWpisz("5000")
                .branzaWybierz()
                .NazwaFirmyWpisz("Wowek")
                .NipWpisz("9261015755")
                .NrTelFirmyWpisz("789456417");
    }
}
