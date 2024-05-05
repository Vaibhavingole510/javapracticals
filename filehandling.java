import java.io.*;

public class FileHandlingExample {

    // Function to read from a file
    public static void readFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Contents of " + fileName + ":");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }

    // Function to write to a file
    public static void writeFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            System.out.println("Content successfully written to " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    // Function to open a file
    public static void openFile(String fileName) {
        try {
            File file = new File(fileName);
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(file);
                System.out.println(fileName + " opened successfully");
            } else {
                System.out.println("Opening files is not supported on this platform");
            }
        } catch (IOException e) {
            System.err.println("Error opening file: " + e.getMessage());
        }
    }

    // Function to delete a file
    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println(fileName + " deleted successfully");
            } else {
                System.out.println("Failed to delete " + fileName);
            }
        } else {
            System.out.println(fileName + " does not exist");
        }
    }

    public static void main(String[] args) {
        String fileName = "example.txt";
        String content = "Hello, World!\nThis is a sample text file.";

        // Writing to file
        writeFile(fileName, content);

        // Reading from file
        readFile(fileName);

        // Opening file
        openFile(fileName);

        // Deleting file
        deleteFile(fileName);
    }
}
