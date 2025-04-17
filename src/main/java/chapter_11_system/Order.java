package chapter_11_system;

public class Order {
    public static void main(String[] args) {
        SimplePaymentService payment = new SimplePaymentService();
        SimpleConfirmationService confirmation = new SimpleConfirmationService();

        JuiceOrderService orderService = new JuiceOrderService(payment, confirmation);

        JuiceOrder order = new JuiceOrder("Mango", 4.99);
        orderService.placeOrder(order);
    }
}

