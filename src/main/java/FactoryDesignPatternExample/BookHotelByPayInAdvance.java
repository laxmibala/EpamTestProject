package FactoryDesignPatternExample;

import HotelDomain.BookingDetails;

public class BookHotelByPayInAdvance extends FindBestHotel implements BookHotel {

    @Override
    public void bookHotel() {
        BookingDetails bookingDetails;
        bookingDetails = new BookingDetails();
        searchHotel(bookingDetails);
        selectHighestRatingHotel();
        payForBooking();
        confirmBooking();
    }

    public void payForBooking(){
        //online payment
    }



    public void confirmBooking(){
    //check booking status
    }


    @Override
    public void searchHotel(BookingDetails bookingDetails) {
        selectMoreFeaturesOfHotel();

    }

    public void selectMoreFeaturesOfHotel(){

    }
}
