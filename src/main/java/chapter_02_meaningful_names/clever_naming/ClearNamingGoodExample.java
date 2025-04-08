package chapter_02_meaningful_names.clever_naming;

public class ClearNamingGoodExample {
    public static void main(String[] args) {
        int numberOfEnemiesDefeated = 12;
        int scorePerEnemy = 3;

        int totalScore = numberOfEnemiesDefeated * scorePerEnemy;

        System.out.println("Player Score: " + totalScore);
    }
}
