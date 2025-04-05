package chapter_03_function.avoid_output_arguments;

public class AvoidOutputArgumentsGoodExample {
    public static void main(String[] args) {
        Employee employee = new Employee("Nelofar Zabi", 50000);

        double updatedSalary = calculateSalaryWithBonus(employee.getSalary(), 5000);

        System.out.println("Updated salary: " + updatedSalary);
    }

    public static double calculateSalaryWithBonus(double currentSalary, double bonus) {
        return currentSalary + bonus;
    }

    static class Employee {
        private String name;
        private double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public String getName() {
            return name;
        }
    }
}
