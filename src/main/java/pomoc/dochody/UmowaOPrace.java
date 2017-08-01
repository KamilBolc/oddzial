package pomoc.dochody;

import org.openqa.selenium.WebDriver;
import page.OddzialPlusPage.NowyWniosekPage.DochodyPage.UmowaOPracePage;

/**
 * Created by kamil on 11.07.17.
 */
public class UmowaOPrace extends DochodyAbstract{

    public UmowaOPrace(WebDriver driver) {
        super(driver);
    }

    public void uruchomSprawdzanieWymagalnosciPolDlaDochodu() {
        UmowaOPracePage umowaOPracePage= new UmowaOPracePage(driver);
        umowaOPracePage.typDochoduWybierzUmowaOPrace()
                .kontynuujKlik();
    }

    public void uruchomUzupelnianiePolDochodu(){
        UmowaOPracePage UoP = new UmowaOPracePage(driver);
            UoP.typDochoduWybierzUmowaOPrace()
                    .typUmowyNieokreslonyWybierz()
                    .dochodOdWpisz("2015-05-05")
                    .stanowiskoWybierz()
                    .branzaWybierz()
                    .wypowiedzenieWybierz()
                    .kwotaWpisz("5000")
                    .terminWyplatyWpisz("25")
                    .nazwaPracodawcyWpisz("Wowek")
                    .NipWpisz("9261015755")
                    .NrTelFirmyWpisz("792217558");
    }
}
