package chapter_07_error_handling.separate_normal_and_exceptional_flow;

public class BookingService {
    public static void main(String[] args) {
        try {
            bookTicket("train");
            System.out.println("Booking successful.");
        } catch (UnsupportedBookingException e) {
            System.out.println("Booking failed: " + e.getMessage());
        }
    }

    public static void bookTicket(String type) throws UnsupportedBookingException {
        if (!"train".equals(type)) {
            throw new UnsupportedBookingException("Only train booking is supported.");
        }
    }

    static class UnsupportedBookingException extends Exception {
        public UnsupportedBookingException(String message) {
            super(message);
        }
    }
}

