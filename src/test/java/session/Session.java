package session;

import factoryBrowser.FactoryBrowser;
import org.openqa.selenium.WebDriver;

public class Session {
    // attributo del mismo tipo de la clases
    private static Session session = null;
    private WebDriver driver;

    // constructor privado
    private Session(){
        //driver= FactoryBrowser.make(FactoryBrowser.CHROME).create();
        driver= FactoryBrowser.make(FactoryBrowser.CHROME_OWASP).create();
    }

    // metodo estativo publico para devolver la sesion
    public static Session getInstance(){
        if (session == null)
            session= new Session();
        return session;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void closeSession(){
        driver.quit();
        session=null;
    }
}

