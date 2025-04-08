package chapter_03_function.avoid_side_effects;

public class SideEffectsBadExample {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 1000.0);

        double discountedPrice = calculateDiscount(product, 0.1);

        System.out.println("Final price: " + discountedPrice);
    }

    public static double calculateDiscount(Product product, double discountRate) {
        double discountedPrice = product.getPrice() * (1 - discountRate);

        System.out.println("Applied " + (discountRate * 100) + "% discount to " + product.getName());

        return discountedPrice;
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
