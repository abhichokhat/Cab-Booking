package cab_booking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CabBooking {
    private List<Booking> bookings;
    private int nextBookingId;

    public CabBooking() {
        bookings = new ArrayList<>();
        nextBookingId = 1;
    }

    public int bookCab(String customerName, String pickupLocation, String dropLocation) {
        Booking newBooking = new Booking(nextBookingId, customerName, pickupLocation, dropLocation);
        bookings.add(newBooking);
        return nextBookingId++;
    }

    public Booking getBookingDetails(int bookingId) {
        for (Booking booking : bookings) {
            if (booking.getBookingId() == bookingId) {
                return booking;
            }
        }
        return null;
    }

    public boolean cancelBooking(int bookingId) {
        for (Booking booking : bookings) {
            if (booking.getBookingId() == bookingId) {
                bookings.remove(booking);
                return true;
            }
        }
        return false;
    }
}
