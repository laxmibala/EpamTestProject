package SingletonExample;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsers {
  private static Browsers browsers=null;
  private WebDriver driver;


   private Browsers(){
       WebDriverManager.chromedriver().setup();
       System.out.println(WebDriverManager.chromedriver().getBinaryPath());
       driver=new ChromeDriver();
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
