package HotelDomain;

import Utilities.Constants;

public class BookingDetails {

    private String place;
    private String noOfDays;
    private String roomType;
    private String hotelRating;
    private String checkinDate;
    private String checkoutDate;

    public String getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(String checkinDate) {
        this.checkinDate = checkinDate;
    }

    public String getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(String checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(String noOfDays) {
        this.noOfDays = noOfDays;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getHotelRating() {
        return hotelRating;
    }

    public void setHotelRating(String hotelRating) {
        this.hotelRating = hotelRating;
    }

    @Override
    public String toString() {
        return "BookingDetails{" +
                "place='" + place + '\'' +
                ", noOfDays='" + noOfDays + '\'' +
                ", roomType='" + roomType + '\'' +
                ", hotelRating='" + hotelRating + '\'' +
                ", checkinDate='" + checkinDate + '\'' +
                ", checkoutDate='" + checkoutDate + '\'' +
                '}';
    }
}
