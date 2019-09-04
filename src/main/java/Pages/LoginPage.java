package Pages;

import SingletonExample.Browsers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.logging.Logger;

public class LoginPage extends AbstractPage  {
    Logger logger =Logger.getLogger(LoginPage.class.getName());

    @FindBy(xpath = "//input[@id='login_email']")
    WebElement emailAddress;

    @FindBy(xpath = "//input[@id='login_password']")
    WebElement password;

    @FindBy(xpath="//button[@id='login_submit']")
    WebElement loginBtn;


    public void loginToApplication(String url,String user,String pass){
        driver.get(url);
        emailAddress.sendKeys(user);
        password.sendKeys(pass);
        loginBtn.submit();
        logger.info("Login Succcesfully done");
    }

}
