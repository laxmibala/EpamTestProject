package Pages;

import HotelDomain.BookingDetails;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.LocalDate;
import java.util.logging.Logger;

public class HomePage extends AbstractPage {
    Logger logger = Logger.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//input[@type ='search']")
    WebElement searchTextbox;

    @FindBy(xpath = "//span[text()='Room']")
    WebElement roomDDwn;

    @FindBy(xpath = "//span[contains(text(),'Check in')]//following-sibling::time")
    WebElement checkinDatePicker;

    @FindBy(xpath = "//span[contains(text(),'Check out')]//following-sibling::time")
    WebElement checkoutDatePicker;

    @FindBy(xpath = "//button[@data-qa='search-button']")
    WebElement searchBtn;

    @FindBy(xpath = "//div[@class='ssg-suggestion__info']")
    WebElement suggetionInfoTxt;

    @FindBy(xpath = "//div[@key='df-over']/div/button[1]")
    WebElement closeBtn;

    @FindBy(xpath = "//li[@data-qa='rating-filter']/button")
    WebElement guestRatingBtn;

    @FindBy(xpath = "//div[@role=\"slider\"]")
    WebElement priceSlider;

    @FindBy(xpath = "//div[@class='fl-slider__slide-holder']")
    WebElement priceSliderholder;


    public void searchHotel(BookingDetails bookingDetails) {
        driver.navigate().to("https://www.trivago.in/");
        searchTextbox.sendKeys(bookingDetails.getPlace());
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(suggetionInfoTxt));
        suggetionInfoTxt.click();
        closeBtn.click();
        selectCheckInDate();
        selectCheckOutDate();
       // selectRooms(bookingDetails.getRoomType());
        searchBtn.click();
        logger.info("Hotel search successfully");
        //setHotelPricePerNight();

    }


    public void selectRooms(String roomType) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(roomDDwn));
        Actions actions = new Actions(driver);
        actions.moveToElement(roomDDwn).contextClick().perform();
        actions.moveToElement(driver.findElement(By.xpath("//span[text()='" + roomType + "'" + "]"))).
                click().build().perform();

    }

    public void setHotelPricePerNight() {

        Dimension sliderSize = priceSliderholder.getSize();
        int sliderWidth = sliderSize.getWidth();
        System.out.println("sliderWidth"+sliderWidth);

        int xCoord = priceSliderholder.getLocation().getX();
        System.out.println("xCoord"+xCoord);

        Actions builder = new Actions(driver);
        builder.moveToElement(priceSlider)
                .click()
                .dragAndDropBy
                        (priceSlider, xCoord-202, 0)
                .build()
                .perform();

        String sliderPrice =
                priceSlider.getAttribute("aria-valuenow");
        logger.info("slider price now " + sliderPrice);

    }


    public void selectCheckInDate() {
        String checkInDate = LocalDate.now().plusDays(1).toString();
        Actions actions = new Actions(driver);
        actions.moveToElement(checkinDatePicker).click().perform();
        actions.moveToElement(driver.findElement(By.xpath("//time[@datetime='" + checkInDate + "'" + "]"))).
                click().build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(checkoutDatePicker));
    }
    public void selectCheckOutDate() {
        String checkOutDate = LocalDate.now().plusDays(5).toString();
        Actions actions = new Actions(driver);
        actions.moveToElement(checkoutDatePicker).contextClick().perform();
        actions.moveToElement(driver.findElement(By.xpath("//time[@datetime='" + checkOutDate + "'" + "]"))).
                click().build().perform();
    }
}
