import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;

@CucumberOptions(
        features = {"src/test/resources/MultipleProductPageObje.feature"},
        plugin= {"pretty","json:target/e2epageobject_json_result.json","html:target/site/e2epageobject_html_result"})

@RunWith(Cucumber.class)

public class TestRunner
{
    public static final String USERNAME = "valarmathi7";
    public static final String AUTOMATE_KEY = "5fJP7A7kscdpsQvqxVbp";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
   static WebDriver driver;
   @BeforeClass
    public static void startBrowser()throws InterruptedException
   {
       //WebDriverManager.chromedriver().setup();
       //driver=new ChromeDriver();
     /*  DesiredCapabilities caps = new DesiredCapabilities();
       caps.setCapability("browser", "IE");
       caps.setCapability("browser_version", "6.0");
       caps.setCapability("os", "Windows");
       caps.setCapability("os_version", "XP");
       caps.setCapability("resolution", "1024x768");
       caps.setCapability("name", "Bstack-[Java] Sample Test");*/

      /* DesiredCapabilities caps = new DesiredCapabilities();
       caps.setCapability("browser", "Chrome");
       caps.setCapability("browser_version", "83.0");
       caps.setCapability("os", "Windows");
       caps.setCapability("os_version", "10");
       caps.setCapability("resolution", "1024x768");
       caps.setCapability("name", "Bstack-[Java] Sample Test");*/

    /*   DesiredCapabilities caps = new DesiredCapabilities();
       caps.setCapability("browser", "Safari");
       caps.setCapability("browser_version", "13.0");
       caps.setCapability("os", "OS X");
       caps.setCapability("os_version", "Catalina");
       caps.setCapability("resolution", "1024x768");
       caps.setCapability("name", "Bstack-[Java] Sample Test");*/

       /*DesiredCapabilities caps = new DesiredCapabilities();
       caps.setCapability("os", "OS X");
       caps.setCapability("os_version", "Catalina");
       caps.setCapability("browser", "Chrome");
       caps.setCapability("browser_version", "83.0");
       caps.setCapability("browserstack.local", "false");
       caps.setCapability("browserstack.selenium_version", "3.5.2");*/
       DesiredCapabilities caps = new DesiredCapabilities();
       caps.setCapability("os", "OS X");
       caps.setCapability("os_version", "Catalina");
       caps.setCapability("browser", "Chrome");
       caps.setCapability("browser_version", "84.0 beta");
       caps.setCapability("browserstack.local", "false");
       caps.setCapability("browserstack.selenium_version", "3.5.2");


       try {


    driver = new RemoteWebDriver(new URL(URL), caps);
}catch (MalformedURLException e)
{
e.printStackTrace();

}
       Thread.sleep(10000);
   }
   @AfterClass
    public static void stopBrowser()
   {
       driver.quit();
   }
}
