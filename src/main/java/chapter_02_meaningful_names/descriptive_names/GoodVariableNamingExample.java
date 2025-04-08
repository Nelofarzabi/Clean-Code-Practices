package chapter_02_meaningful_names.descriptive_names;

public class GoodVariableNamingExample {
    public static void main(String[] args) {
        int daysWorkedPerYear = 365;
        int dailyWage = 200;

        int annualSalary = daysWorkedPerYear * dailyWage;

        System.out.println("Annual Salary: $" + annualSalary);
    }
}

