package chapter_05_formatting.function_formatting;

public class DependentFunction {
    public void greetUser(String name) {
        String formatted = formatName(name);
        System.out.println("Hello " + formatted);
    }

    private String formatName(String name) {
        return name.trim().toUpperCase();
    }
}
