package chapter_11_system;

public class SimplePaymentService {
    void processPayment(JuiceOrder order) {
        System.out.println("Paid $" + order.price + " for " + order.juiceType + " juice.");
    }
}
