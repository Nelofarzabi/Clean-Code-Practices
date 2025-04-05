package chapter_03_function.command_query_separation;

public class CommandQuerySeparationGoodExample {
    public static void main(String[] args) {
        UserSession userSession = new UserSession();

        userSession.loginUser("nelofarzabi");

        boolean isLoggedIn = userSession.isUserLoggedIn();

        if (isLoggedIn) {
            System.out.println("User is logged in.");
        } else {
            System.out.println("User is not logged in.");
        }
    }

    static class UserSession {
        private boolean loggedIn = false;

        public void loginUser(String username) {
            if (!loggedIn) {
                loggedIn = true;
                System.out.println("Logging in user: " + username);
            }
        }

        public boolean isUserLoggedIn() {
            return loggedIn;
        }
    }
}
