package chapter_04_comments.clarification_comment;

public class ClarificationExample {
    public static void main(String[] args) {
        // true = send welcome email
        registerUser("Nelofar", true);
    }

    static void registerUser(String name, boolean sendEmail) {
        System.out.println("User " + name + " registered.");
        if (sendEmail) {
            System.out.println("Sending welcome email...");
        }
    }
}
