package chapter_04_comments.warning_comment;

public class WarningCommentExample {
    // WARNING: This method deletes user data permanently
    static void deleteUser(String username) {
        System.out.println("Deleting all data for " + username);
    }

    public static void main(String[] args) {
        deleteUser("nelofar");
    }
}