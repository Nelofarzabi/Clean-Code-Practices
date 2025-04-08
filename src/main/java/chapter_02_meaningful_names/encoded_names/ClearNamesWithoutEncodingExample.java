package chapter_02_meaningful_names.encoded_names;

public class ClearNamesWithoutEncodingExample {
    public static void main(String[] args) {
        String userName = "Alice";
        int userAge = 30;
        final int MAX_USERS = 100;

        System.out.println("User: " + userName + ", Age: " + userAge + ", Max Allowed Users: " + MAX_USERS);
    }
}
