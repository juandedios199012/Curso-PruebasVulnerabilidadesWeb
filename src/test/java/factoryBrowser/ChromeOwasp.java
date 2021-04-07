
package factoryBrowser;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ChromeOwasp implements IBrowser {
    String proxyValue=System.getProperty("proxyValue")==null?"127.0.0.1:8080":System.getProperty("proxyValue");

    @Override
    public WebDriver create() {
        String driverChrome="src/test/resources/chromeDriver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverChrome);
        //Proxy
        Map<String,Object> pref= new HashMap<>();
        pref.put("credentials_enable_service",false);
        Proxy proxy= new Proxy();
        //Manejar PORT
        proxy.setHttpProxy(proxyValue);
        proxy.setSslProxy(proxyValue);
        //ChromeDriver
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability("proxy",proxy);

        ChromeOptions options= new ChromeOptions();
        options.addArguments("ignore-certificate-errors");
        options.setExperimentalOption("prefs",pref);

        capabilities.setCapability(ChromeOptions.CAPABILITY,options);

        ChromeDriver driver = new ChromeDriver(capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        return driver;
    }
}
