package chapter_02_meaningful_names.meaningful_concept;

public class InconsistentNamingBadExample {
    public static void main(String[] args) {
        int clientAge = 30;
        String customerName = "John Doe";

        printUserDetails(clientAge, customerName);
    }

    public static void printUserDetails(int age, String userName) {
        System.out.println("User Name: " + userName);
        System.out.println("User Age: " + age);
    }
}
