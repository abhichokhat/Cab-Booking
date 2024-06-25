package cab_booking;

public class Booking {
    private int bookingId;
    private String customerName;
    private String pickupLocation;
    private String dropLocation;

    public Booking(int bookingId, String customerName, String pickupLocation, String dropLocation) {
        this.bookingId = bookingId;
        this.customerName = customerName;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
    }

    public int getBookingId() {
        return bookingId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public String getDropLocation() {
        return dropLocation;
    }

    @Override
    public String toString() {
        return "Booking ID: " + bookingId + "\nCustomer Name: " + customerName + 
               "\nPickup Location: " + pickupLocation + "\nDrop Location: " + dropLocation;
    }
}

