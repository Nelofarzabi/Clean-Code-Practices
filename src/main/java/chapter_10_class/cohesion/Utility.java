package chapter_10_class.cohesion;

public class Utility {
    public void drawCircle() {
        System.out.println("Drawing circle...");
    }

    public void connectToDB() {
        System.out.println("Connecting to DB...");
    }

    public void playMusic() {
        System.out.println("Playing music...");
    }

    public static void main(String[] args) {
        Utility util = new Utility();
        util.drawCircle();
        util.connectToDB();
        util.playMusic();
    }
}

