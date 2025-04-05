package chapter_02_meaningful_names.meaningful_distinctions;

public class ClearDistinctionExample {
    public static void main(String[] args) {

        int productSellingPrice = 100;
        int productManufacturingCost = 70;
        int productShippingCost = 15;
        int productSalesTax = 10;

        int totalProductPrice = productSellingPrice + productShippingCost + productSalesTax;

        System.out.println("Total Product Price (with shipping and tax): $" + totalProductPrice);
    }
}
