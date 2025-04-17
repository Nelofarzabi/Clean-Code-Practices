package chapter_10_class.class_should_be_small;

public class ReportManager {

    public void generateReport() {
        System.out.println("Generating report...");
    }

    public void printReport() {
        System.out.println("Printing report...");
    }

    public void saveToDatabase() {
        System.out.println("Saving report to database...");
    }

    public void sendReportByEmail() {
        System.out.println("Sending report by email...");
    }

    public static void main(String[] args) {
        ReportManager rm = new ReportManager();
        rm.generateReport();
        rm.printReport();
        rm.saveToDatabase();
        rm.sendReportByEmail();
    }
}
