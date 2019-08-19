package Pages;

import HotelDomain.BookingDetails;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    @FindBy(xpath = "")
    WebElement searchTextbox;

    @FindBy(xpath = "")
    WebElement roomDDwn;

    @FindBy(xpath = "")
    WebElement checkinDate;

    @FindBy(xpath = "")
    WebElement checkoutDate;

    @FindBy(xpath = "")
    WebElement searchBtn;

    public void searchHotel(BookingDetails bookingDetails){
        searchTextbox.sendKeys(bookingDetails.getPlace());
        checkinDate.sendKeys(bookingDetails.getCheckinDate());
        checkoutDate.sendKeys((bookingDetails.getCheckoutDate()));
        searchBtn.submit();
    }


}
