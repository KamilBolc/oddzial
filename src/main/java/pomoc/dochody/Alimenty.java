package pomoc.dochody;

import org.openqa.selenium.WebDriver;
import page.OddzialPlusPage.NowyWniosekPage.DochodyPage.AlimentyPage;

/**
 * Created by kamil on 10.07.17.
 */
public class Alimenty extends DochodyAbstract {

    public Alimenty(WebDriver driver) {
        super(driver);
    }
    AlimentyPage alimentyPage = new AlimentyPage(driver);

    public void uruchomSprawdzanieWymagalnosciPolDlaDochodu() {
        alimentyPage.typDochoduWybierzAlimenty()
                .kontynuujKlik();
    }

    public void uruchomUzupelnianiePolDochodu(){
        alimentyPage.typDochoduWybierzAlimenty()
                .dochodOdWpisz("2014-06-25")
                .dochodDoWpisz("2018-12-25")
                .kwotaWpisz("5000")
                .terminWyplatyWpisz("21")
                .kontynuujKlik();
    }
}
