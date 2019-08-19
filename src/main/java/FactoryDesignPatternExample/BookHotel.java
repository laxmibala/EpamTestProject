package FactoryDesignPatternExample;


import HotelDomain.BookingDetails;

public interface BookHotel {
    void bookHotel();

    default void searchHotel(BookingDetails bookingDetails) {
        /* search by mandatory fields */
    }
}
