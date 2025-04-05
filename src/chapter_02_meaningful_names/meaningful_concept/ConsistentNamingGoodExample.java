package chapter_02_meaningful_names.meaningful_concept;

public class ConsistentNamingGoodExample {
    public static void main(String[] args) {
        int userAge = 30;
        String userName = "John Doe";

        printUserDetails(userAge, userName);
    }

    public static void printUserDetails(int userAge, String userName) {
        System.out.println("User Name: " + userName);
        System.out.println("User Age: " + userAge);
    }
}
