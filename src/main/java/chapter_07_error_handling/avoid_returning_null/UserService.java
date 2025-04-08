package chapter_07_error_handling.avoid_returning_null;

public class UserService {
    public static void main(String[] args) {
        User user = findUser("nelo@gmail.com");
        System.out.println("User name: " + user.getName());
    }

    public static User findUser(String email) {
        return new User("nelo zabi");
    }

    static class User {
        private final String name;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}

