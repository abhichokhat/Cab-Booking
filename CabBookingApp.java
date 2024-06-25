package cab_booking;

import java.util.Scanner;

public class CabBookingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CabBooking cabBooking = new CabBooking();

        while (true) {
            System.out.println("\nCab Booking System Menu:");
            System.out.println("1. Book a Cab");
            System.out.println("2. View Booking Details");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    scanner.nextLine(); // Consume newline
                    String customerName = scanner.nextLine();
                    System.out.print("Enter pickup location: ");
                    String pickupLocation = scanner.nextLine();
                    System.out.print("Enter drop location: ");
                    String dropLocation = scanner.nextLine();
                    int bookingId = cabBooking.bookCab(customerName, pickupLocation, dropLocation);
                    System.out.println("Cab booked successfully. Booking ID: " + bookingId);
                    break;
                case 2:
                    System.out.print("Enter booking ID: ");
                    int viewBookingId = scanner.nextInt();
                    Booking booking = cabBooking.getBookingDetails(viewBookingId);
                    if (booking != null) {
                        System.out.println("Booking Details:\n" + booking);
                    } else {
                        System.out.println("Booking not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter booking ID: ");
                    int cancelBookingId = scanner.nextInt();
                    if (cabBooking.cancelBooking(cancelBookingId)) {
                        System.out.println("Booking cancelled successfully.");
                    } else {
                        System.out.println("Cancellation failed. Booking not found.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
