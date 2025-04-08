package chapter_03_function.avoid_repeated_code;

public class DRYBadExample {
    public static void main(String[] args) {
        String email1 = "nelofar@gmail.com";
        String email2 = "invalid-email";

        if (email1.contains("@") && email1.endsWith(".com")) {
            System.out.println(email1 + " is valid.");
        } else {
            System.out.println(email1 + " is invalid.");
        }

        if (email2.contains("@") && email2.endsWith(".com")) {
            System.out.println(email2 + " is valid.");
        } else {
            System.out.println(email2 + " is invalid.");
        }
    }
}
