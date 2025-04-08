package chapter_03_function.exceptions_to_error_codes;

public class ErrorHandlingGoodExample {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        try {
            processor.processPayment("invalidCardNumber");
        } catch (InvalidCardException e) {
            System.out.println("Payment failed: " + e.getMessage());
        }
    }

    static class PaymentProcessor {
        public void processPayment(String cardNumber) throws InvalidCardException {
            if (cardNumber.equals("invalidCardNumber")) {
                throw new InvalidCardException("Invalid card number: " + cardNumber);
            }
            System.out.println("Payment processed successfully.");
        }
    }

    static class InvalidCardException extends Exception {
        public InvalidCardException(String message) {
            super(message);
        }
    }
}
