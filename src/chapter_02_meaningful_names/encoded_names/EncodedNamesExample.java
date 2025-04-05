package chapter_02_meaningful_names.encoded_names;

public class EncodedNamesExample {
    public static void main(String[] args) {
        String strUserName = "Alice";
        int iUserAge = 30;
        final int kMAX_USERS = 100;

        System.out.println("User: " + strUserName + ", Age: " + iUserAge + ", Max Allowed Users: " + kMAX_USERS);
    }
}
