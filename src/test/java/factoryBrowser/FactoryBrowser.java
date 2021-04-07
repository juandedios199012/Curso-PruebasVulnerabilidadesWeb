
package factoryBrowser;

public class FactoryBrowser {

    public static final String CHROME="chrome";
    public static final String FIREFOX="firefox";
    public static final String CHROME_OWASP="chromeowasp";


    public static IBrowser make(String typeBrowser){
        IBrowser browser;

        switch (typeBrowser){
            case CHROME:
                browser= new Chrome();
                break;
            case FIREFOX:
                browser= new FireFox();
                break;
            case CHROME_OWASP:
                browser= new ChromeOwasp();
                break;
            default:
                browser= new Chrome();
                break;
        }
        return browser;
    }

}