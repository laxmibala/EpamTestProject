package SingletonExample;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browsers {
  private static Browsers browsers=null;
  private WebDriver driver;


   private Browsers(){
       WebDriverManager.chromedriver().setup();
       ChromeOptions options = new ChromeOptions();
       options.addArguments("--no-sandbox"); //Bypass OS security model
       options.addArguments("--disable-web-security");
       options.addArguments("--ignore-urlfetcher-cert-requests");
       //options.addArguments("--disable-renderer-backgrounding");
       options.addArguments("--disable-infobars"); //Disabling infobars
       //options.addArguments("--start-maximized"); //Open Browser in maximized mode
       options.addArguments("--disable-dev-shm-usage"); //Overcome limited resource problem
       options.setExperimentalOption("useAutomationExtension", false);
       options.addArguments("--log-level=3"); // set log level
       options.addArguments("--silent");
       options.addArguments("--disable-gpu");
       options.addArguments("window-size=1920,1080");
       options.addArguments("--remote-debugging-port=9222");
       driver=new ChromeDriver(options);
    }

    public static Browsers getBrowsers(){
        if(browsers==null)
            browsers=new Browsers();
        return browsers;
    }

    public WebDriver getDriver(){
        return driver;
    }




}
