package pomoc.dochody;

import org.openqa.selenium.WebDriver;
import page.OddzialPlusPage.NowyWniosekPage.DochodyPage.EmeryturaPage;

/**
 * Created by kamil on 10.07.17.
 */
public class Emerytura extends DochodyAbstract {

    public Emerytura(WebDriver driver) {
        super(driver);
    }

    EmeryturaPage emeryturaPage = new EmeryturaPage(driver);

    public void uruchomSprawdzanieWymagalnosciPolDlaDochodu() {

        emeryturaPage.typDochoduWybierzEmerytura()
                .kontynuujKlik();
    }

    public void uruchomUzupelnianiePolDochodu(){
        emeryturaPage.typDochoduWybierzEmerytura()
                .dochodOdWpisz("2014-06-25")
                .kwotaWpisz("5000")
                .terminWyplatyWpisz("21")
                .organWypelniajacyWpisz("wow");
    }
}
