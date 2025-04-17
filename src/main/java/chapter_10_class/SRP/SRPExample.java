package chapter_10_class.SRP;

class UserService {
    public void register(String user) {
        System.out.println("User registered: " + user);
    }
}

class Logger {
    public void log(String activity) {
        System.out.println("Logging: " + activity);
    }
}

class UI {
    public void display() {
        System.out.println("Displaying UI...");
    }
}

public class SRPExample {
    public static void main(String[] args) {
        UserService service = new UserService();
        Logger logger = new Logger();
        UI ui = new UI();

        service.register("john@example.com");
        logger.log("Login");
        ui.display();
    }
}

