package chapter_03_function.avoid_side_effects;

public class SideEffectsGoodExample {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 1000.0);

        double discountRate = 0.1;
        double discountedPrice = calculateDiscount(product.getPrice(), discountRate);

        System.out.println("Applied " + (discountRate * 100) + "% discount to " + product.getName());
        System.out.println("Final price: " + discountedPrice);
    }

    public static double calculateDiscount(double price, double discountRate) {
        return price * (1 - discountRate);
    }

    static class Product {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() { return name; }
        public double getPrice() { return price; }
    }
}
