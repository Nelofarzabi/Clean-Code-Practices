package chapter_04_comments.todo_comment;

public class TodoExample {
    public static void main(String[] args) {
        // TODO: Add user role check before allowing deletion
        deleteUser("nelofar");
    }

    static void deleteUser(String username) {
        System.out.println("Deleted: " + username);
    }
}
