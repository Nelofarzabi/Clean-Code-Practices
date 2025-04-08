package chapter_03_function.exceptions_to_error_codes;

public class ErrorCodeBadExample {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        int result = processor.processPayment("invalidCardNumber");

        if (result == 0) {
            System.out.println("Payment processed successfully.");
        } else {
            System.out.println("Payment failed with error code: " + result);
        }
    }

    static class PaymentProcessor {

        public int processPayment(String cardNumber) {
            if (cardNumber.equals("invalidCardNumber")) {
                return -1;
            }
            return 0;
        }
    }
}
