package chapter_07_error_handling.define_custom_exceptions;

public class BankService {
    public static void main(String[] args) {
        try {
            withdraw(1000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void withdraw(double amount) throws InsufficientBalanceException {
        double balance = 500;
        if (amount > balance) {
            throw new InsufficientBalanceException("Not enough balance. Available: " + balance);
        }
    }

    static class InsufficientBalanceException extends Exception {
        public InsufficientBalanceException(String message) {
            super(message);
        }
    }
}

