package chapter_05_formatting.horizontal_formatting;


public class BadFormattingExample {
    public static void main(String[]args){
        int baseSalary=50000;
        int bonus=5000;
        int taxRate=20;
        int totalIncome=calculateTotalIncome(baseSalary,bonus);
        double netIncome=calculateNetIncome(totalIncome,taxRate);
        System.out.println("Total Income:$"+totalIncome);
        System.out.println("Net Income after Tax:$"+netIncome);
    }
    public static int calculateTotalIncome(int baseSalary,int bonus){return baseSalary+bonus;}
    public static double calculateNetIncome(int income,int taxRate){return income-(income*(taxRate/100.0));}
}
