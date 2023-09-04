import java.util.Scanner;

public class StringContainsTest37 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the input string
        System.out.print("Enter the input string: ");
        String inputString = scanner.nextLine();

        // Prompt the user for the sequence to check
        System.out.print("Enter the sequence to check: ");
        String sequenceToCheck = scanner.nextLine();

        // Check if the input string contains the specified sequence
        boolean containsSequence = inputString.contains(sequenceToCheck);

        // Print the result
        if (containsSequence) {
            System.out.println("The input string contains the sequence: " + sequenceToCheck);
        } else {
            System.out.println("The input string does not contain the sequence: " + sequenceToCheck);
        }

        // Close the Scanner
        scanner.close();
    }
}
