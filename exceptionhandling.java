import java.util.Scanner;

public class ExceptionHandlingExample {

    // Method to demonstrate try-catch block
    public static void tryCatchExample() {
        try {
            int result = 10 / 0; // This line will cause ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException caught: " + e.getMessage());
        }
    }

    // Method to demonstrate finally block
    public static void finallyExample() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            int result = 100 / num;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException caught: " + e.getMessage());
        } finally {
            // This block will always execute regardless of whether an exception occurred or not
            scanner.close();
            System.out.println("Scanner closed in finally block.");
        }
    }

    // Method to demonstrate throwing an exception
    public static void throwExceptionExample() throws Exception {
        throw new Exception("This is a custom exception message.");
    }

    public static void main(String[] args) {
        // Demonstrate try-catch block
        System.out.println("Demonstrating try-catch block:");
        tryCatchExample();

        // Demonstrate finally block
        System.out.println("\nDemonstrating finally block:");
        finallyExample();

        // Demonstrate throwing an exception
        System.out.println("\nDemonstrating throwing an exception:");
        try {
            throwExceptionExample();
        } catch (Exception e) {
            System.err.println("Exception caught: " + e.getMessage());
        }
    }
}
