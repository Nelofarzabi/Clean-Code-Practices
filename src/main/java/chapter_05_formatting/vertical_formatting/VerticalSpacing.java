package chapter_05_formatting.vertical_formatting;

public class VerticalSpacing {
    private String name;

    public VerticalSpacing(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.println("Hello " + name);
    }

    public void farewell() {
        System.out.println("Goodbye " + name);
    }
}
