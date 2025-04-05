package chapter_03_function.function_minimize_arguments;

public class MinimizedArgumentsExample {
    public static void main(String[] args) {
        User user = new User("Nelofar Zabi", 30, "nelofar@gmail.com", "123-456-7890");

        sendEmailNotification(user);
    }

    public static void sendEmailNotification(User user) {
        System.out.println("Sending email to " + user.getName() + " at " + user.getEmail());
        System.out.println("Phone number: " + user.getPhone());
        System.out.println("User age: " + user.getAge());
    }

    static class User {
        private String name;
        private int age;
        private String email;
        private String phone;

        public User(String name, int age, String email, String phone) {
            this.name = name;
            this.age = age;
            this.email = email;
            this.phone = phone;
        }

        public String getName() { return name; }
        public int getAge() { return age; }
        public String getEmail() { return email; }
        public String getPhone() { return phone; }
    }
}

