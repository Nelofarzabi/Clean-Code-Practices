package chapter_10_class.class_should_be_small;

class Report {
    public void generate() {
        System.out.println("Generating report...");
    }
}

class ReportPrinter {
    public void print() {
        System.out.println("Printing report...");
    }
}

class ReportSaver {
    public void save() {
        System.out.println("Saving report to database...");
    }
}

class EmailSender {
    public void send() {
        System.out.println("Sending report by email...");
    }
}

public class CleanReportApp {
    public static void main(String[] args) {
        Report report = new Report();
        report.generate();

        new ReportPrinter().print();
        new ReportSaver().save();
        new EmailSender().send();
    }
}

