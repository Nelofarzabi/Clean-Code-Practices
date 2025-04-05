package chapter_02_meaningful_names.searchable_names;

public class SearchableNamesExample {
    public static void main(String[] args) {
        final int MONTHS_IN_YEAR = 12;
        final int estimatedMonthlySubscriptions = 7;

        int estimatedAnnualSubscriptions = estimatedMonthlySubscriptions * MONTHS_IN_YEAR;

        System.out.println("Estimated Annual Subscriptions: " + estimatedAnnualSubscriptions);
    }
}
