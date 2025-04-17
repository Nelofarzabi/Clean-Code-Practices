package chapter_11_system;

public class SimpleConfirmationService {
    void sendConfirmation(JuiceOrder order) {
        System.out.println("Confirmation: Your " + order.juiceType + " juice order is on the way!");
    }
}
