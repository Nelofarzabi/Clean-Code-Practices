package chapter_04_comments.informative_comment;


import java.util.LinkedHashMap;
import java.util.Map;

public class InformativeCommentExample {
    public static void main(String[] args) {
        // Using LinkedHashMap to preserve insertion order
        Map<String, String> products = new LinkedHashMap<>();
        products.put("A", "Apple");
        products.put("B", "Banana");

        System.out.println(products);
    }
}
