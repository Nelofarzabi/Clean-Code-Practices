package chapter_10_class.SRP;

public class UserManager {
    public void register(String user) {
        System.out.println("User registered: " + user);
    }

    public void logActivity(String activity) {
        System.out.println("Logging: " + activity);
    }

    public void displayUI() {
        System.out.println("Displaying UI...");
    }

    public static void main(String[] args) {
        UserManager um = new UserManager();
        um.register("john@example.com");
        um.logActivity("Login");
        um.displayUI();
    }
}

