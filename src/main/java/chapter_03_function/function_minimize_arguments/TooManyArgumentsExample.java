package chapter_03_function.function_minimize_arguments;

public class TooManyArgumentsExample {
    public static void main(String[] args) {
        int userAge = 30;
        String userName = "Nelofar Zabi";
        String userEmail = "nelofar@gmail.com";
        String userPhone = "123-456-7890";

        sendEmailNotification(userName, userEmail, userPhone, userAge);
    }

    public static void sendEmailNotification(String name, String email, String phone, int age) {
        System.out.println("Sending email to " + name + " at " + email);
        System.out.println("Phone number: " + phone);
        System.out.println("User age: " + age);
    }
}
