package ie.atu.oop_inclass_07.service;


import ie.atu.oop_inclass_07.model.Booking;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookingService {

    final private ArrayList<Booking> bookings = new ArrayList<>();

    private long nextId = 1;


    public Booking addBooking(Booking booking) {

        //if(booking.getStartHour()+booking.getDurationHours())

        booking.setBookingId(nextId++);
        bookings.add(booking);
        return booking;
    }

    public List<Booking> getAllBookings() {
        return bookings;
    }

    public Booking getBookingById(long id) {
        Booking selectedBooking = null;

        for (Booking booking : bookings) {
            if (booking.getBookingId() == id) {
                selectedBooking = booking;
            }
        }
        return selectedBooking;
    }


}
