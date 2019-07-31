import Pages.LoginPage;
import SingletonExample.ConfigLoader;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Login extends Hooks{
    WebDriver driver;


    @Test
    public void LoginToTrivago(){
       String username= ConfigLoader.getUsername();
       String  pass= ConfigLoader.getPassword();
       String url= ConfigLoader.getUrl();

        LoginPage login = new LoginPage();
        login.loginToApplication(url,username,pass);


    }

}
