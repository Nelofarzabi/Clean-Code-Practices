package chapter_05_formatting.variable_formatting;

public class VariableScope {
    public void calculateTotal() {
        int taxRate = 10;
        int baseAmount = 100;

        int total = baseAmount + taxRate;
        System.out.println("Total: " + total);
    }
}
