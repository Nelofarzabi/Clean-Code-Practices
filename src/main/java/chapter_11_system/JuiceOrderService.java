package chapter_11_system;

public class JuiceOrderService {
    SimplePaymentService paymentService;
    SimpleConfirmationService confirmationService;

    JuiceOrderService(SimplePaymentService paymentService, SimpleConfirmationService confirmationService) {
        this.paymentService = paymentService;
        this.confirmationService = confirmationService;
    }

    void placeOrder(JuiceOrder order) {
        paymentService.processPayment(order);
        confirmationService.sendConfirmation(order);
    }
}
