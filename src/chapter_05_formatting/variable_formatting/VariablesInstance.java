package chapter_05_formatting.variable_formatting;

public class VariablesInstance {
    private String productName;
    private int quantity;

    public VariablesInstance(String name, int qty) {
        this.productName = name;
        this.quantity = qty;
    }

    public void printOrder() {
        System.out.println(quantity + " x " + productName);
    }
}
