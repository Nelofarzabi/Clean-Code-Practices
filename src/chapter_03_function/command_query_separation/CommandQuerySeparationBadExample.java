package chapter_03_function.command_query_separation;

public class CommandQuerySeparationBadExample {
    public static void main(String[] args) {
        UserSession userSession = new UserSession();

        boolean isLoggedIn = userSession.isUserLoggedIn("nelofarzabi");

        if (isLoggedIn) {
            System.out.println("User is logged in.");
        } else {
            System.out.println("User is not logged in.");
        }
    }

    static class UserSession {
        private boolean loggedIn = false;

        public boolean isUserLoggedIn(String username) {
            if (!loggedIn) {
                loggedIn = true;
                System.out.println("Logging in user: " + username);
            }
            return loggedIn;
        }
    }
}
