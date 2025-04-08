package chapter_04_comments.explanation_of_Intent;

public class ExplanationOfIntentExample {
    public static void main(String[] args) {
        // Only send notification if the user has opted in
        boolean optedIn = true;
        if (optedIn) {
            System.out.println("Notification sent!");
        }
    }
}
