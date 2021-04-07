package factoryBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Chrome implements IBrowser {
    @Override
    public WebDriver create() {
        String driverChrome="src/test/resources/chromeDriver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverChrome);
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }
}