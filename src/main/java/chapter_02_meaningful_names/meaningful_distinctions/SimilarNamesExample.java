package chapter_02_meaningful_names.meaningful_distinctions;

public class SimilarNamesExample {
    public static void main(String[] args) {
        int productPrice = 100;
        int productCost = 120;
        int productTotal = 200;

        int productTotalAmount = productPrice + productCost;

        System.out.println("Product Total Amount: $" + productTotalAmount);
    }
}
