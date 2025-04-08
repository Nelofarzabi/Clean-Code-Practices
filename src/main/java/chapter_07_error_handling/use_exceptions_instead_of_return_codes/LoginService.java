package chapter_07_error_handling.use_exceptions_instead_of_return_codes;

public class LoginService {
    public static void main(String[] args) {
        try {
            login("admin", "wrongPassword");
            System.out.println("Login successful!");
        } catch (AuthenticationException e) {
            System.out.println("Login failed: " + e.getMessage());
        }
    }

    public static void login(String username, String password) throws AuthenticationException {
        if (!"admin".equals(username) || !"admin123".equals(password)) {
            throw new AuthenticationException("Invalid username or password");
        }
    }

    static class AuthenticationException extends Exception {
        public AuthenticationException(String message) {
            super(message);
        }
    }
}

