package TestRunner;

import HotelDomain.BookingDetails;
import Pages.HomePage;
import Pages.LoginPage;
import SingletonExample.ConfigLoader;
import TestRunner.Hooks;
import Utilities.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.time.LocalDate;

public class ApplicationTest extends Hooks {
    WebDriver driver;


    @Test
    public void LoginToTrivago(){
       String username= ConfigLoader.getUsername();
       String  pass= ConfigLoader.getPassword();
       String url= ConfigLoader.getUrl();

        LoginPage login = new LoginPage();
        login.loginToApplication(url,username,pass);

    }

    @Test
    public void searchHotel(){
        BookingDetails bookingDetails =new BookingDetails();
        bookingDetails.setPlace("Pune");
        bookingDetails.setCheckinDate(LocalDate.now().toString());
        bookingDetails.setCheckinDate(LocalDate.now().plusDays(5).toString());
        bookingDetails.setRoomType(Constants.single_room);

        HomePage homePage =new HomePage();
        homePage.searchHotel(bookingDetails);

    }

}
