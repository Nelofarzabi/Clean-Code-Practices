package chapter_07_error_handling.avoid_passing_null;

public class InvoiceService {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("INV-001", 1000);
        printInvoice(invoice);
    }

    public static void printInvoice(Invoice invoice) {
        if (invoice == null) {
            throw new IllegalArgumentException("Invoice cannot be null");
        }
        System.out.println("Printing invoice: " + invoice.getCode());
    }

    static class Invoice {
        private final String code;
        private final double amount;

        public Invoice(String code, double amount) {
            this.code = code;
            this.amount = amount;
        }

        public String getCode() {
            return code;
        }
    }
}

