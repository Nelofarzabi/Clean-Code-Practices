package chapter_03_function.avoid_repeated_code;

public class DRYGoodExample {
    public static void main(String[] args) {
        String email1 = "nelofar@gmail.com";
        String email2 = "invalid-email";

        printEmailValidation(email1);
        printEmailValidation(email2);
    }

    public static void printEmailValidation(String email) {
        if (validateEmail(email)) {
            System.out.println(email + " is valid.");
        } else {
            System.out.println(email + " is invalid.");
        }
    }

    public static boolean validateEmail(String email) {
        return email.contains("@") && email.endsWith(".com");
    }
}
