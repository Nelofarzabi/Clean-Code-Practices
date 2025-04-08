package chapter_03_function.keep_function_small;

public class FunctionBadExample {
    public static void main(String[] args) {
        int a = 10, b = 5;
        int c = a * b;
        int d = a + b;
        int e = a - b;

        int result = c + d + e;

        System.out.println("Result: " + result);
    }
}
