package pomoc.dochody;

import org.openqa.selenium.WebDriver;

/**
 * Created by kamil on 10.07.17.
 */
public abstract class DochodyAbstract {
    protected WebDriver driver;

    public DochodyAbstract(WebDriver driver) {
        this.driver = driver;
    }

    public abstract void uruchomSprawdzanieWymagalnosciPolDlaDochodu();

    public abstract void uruchomUzupelnianiePolDochodu();
}
