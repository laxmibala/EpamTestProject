package Pages;

import SingletonExample.Browsers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AbstractPage {
        protected WebDriver driver;

        public AbstractPage(){
            driver= Browsers.getBrowsers().getDriver();
            PageFactory.initElements(driver, this);
        }

}
