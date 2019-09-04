package FactoryDesignPatternExample;

import HotelDomain.BookingDetails;

public class BookHotelAndPayLater extends FindBestHotel implements BookHotel {
    @Override
    public void bookHotel() {
        BookingDetails bookingDetails;
        bookingDetails = new BookingDetails();
        searchHotel(bookingDetails);
        //selectNearestHotel(bookingDetails.getPlace());
        confirmBooking();
    }

    public void confirmBooking(){
        //check booking status
    }
}
