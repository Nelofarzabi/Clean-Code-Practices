package chapter_03_function.avoid_output_arguments;

public class AvoidOutputArgumentsBadExample {
    public static void main(String[] args) {
        Employee employee = new Employee("Nelofar Zabi", 50000);

        addBonusToSalary(employee, 5000);

        System.out.println("Updated salary: " + employee.getSalary());
    }

    public static void addBonusToSalary(Employee employee, double bonus) {
        double newSalary = employee.getSalary() + bonus;
        employee.setSalary(newSalary);
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
