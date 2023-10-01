import java.util.IllegalFormatException;
import java.util.Scanner;

public class StringFormatter38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for the format string
        System.out.print("Enter the format string: ");
        String formatString = scanner.nextLine();

        try {
            // Prompt the user for arguments
            System.out.print("Enter the arguments (separated by spaces): ");
            String[] inputArgs = scanner.nextLine().split("\\s+");

            // Convert input arguments to objects
            Object[] arguments = new Object[inputArgs.length];
            for (int i = 0; i < inputArgs.length; i++) {
                arguments[i] = inputArgs[i];
            }

            // Format the string
            String formattedString = String.format(formatString, arguments);
            System.out.println("Formatted String: " + formattedString);
        } catch (IllegalFormatException e) {
            System.err.println("Error: Invalid format string or arguments.");
        }
        
        scanner.close();
    }
}
