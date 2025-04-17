package chapter_10_class.cohesion;

public class ShapeDrawer {
    public void drawCircle() {
        System.out.println("Drawing circle...");
    }

    public void drawSquare() {
        System.out.println("Drawing square...");
    }

    public static void main(String[] args) {
        ShapeDrawer drawer = new ShapeDrawer();
        drawer.drawCircle();
        drawer.drawSquare();
    }
}

