package chapter_02_meaningful_names.avoid_disinformation;

public class MisleadingExample {
    public static void main(String[] args) {
        int totalCost = 100; // This is not the total cost
        int discount = 20;    // This is a percentage, not an amount
        int finalPrice = totalCost - discount;  // Confusing calculation

        System.out.println("Final Price: $" + finalPrice);  // Misleading result
    }
}

