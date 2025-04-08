package chapter_07_error_handling.provide_context_with_exceptions;

import java.io.File;

public class FileReaderApp {
    public static void main(String[] args) {
        try {
            readFile("/invalid/path/file.txt");
        } catch (FileReadException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void readFile(String filePath) throws FileReadException {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new FileReadException("File not found at: " + filePath);
        }
    }

    static class FileReadException extends Exception {
        public FileReadException(String message) {
            super(message);
        }
    }
}

