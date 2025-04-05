package chapter_02_meaningful_names.avoid_disinformation;

public class CorrectNamingExample {

    public static void main(String[] args) {
        int itemPrice = 100;
        int discountPercentage = 20;
        int discountedPrice = itemPrice - (itemPrice * discountPercentage / 100);

        System.out.println("Discounted Price: $" + discountedPrice);
    }
}
