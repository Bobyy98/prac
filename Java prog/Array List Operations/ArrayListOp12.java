import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOp12 {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nString Operations Menu:");
            System.out.println("1. Append a string at the end");
            System.out.println("2. Insert a string at a particular index");
            System.out.println("3. List all strings starting with a given letter");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the string to append: ");
                    String appendString = scanner.nextLine();
                    appendString(stringList, appendString);
                    break;
                case 2:
                    System.out.print("Enter the index to insert at: ");
                    int insertIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter the string to insert: ");
                    String insertString = scanner.nextLine();
                    insertString(stringList, insertIndex, insertString);
                    break;
                case 3:
                    System.out.print("Enter the letter to list strings starting with: ");
                    char startLetter = scanner.nextLine().charAt(0);
                    listStringsWithLetter(stringList, startLetter);
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    // Function to append a string to the end of the list
    private static void appendString(ArrayList<String> list, String str) {
        list.add(str);
        System.out.println("String '" + str + "' appended at the end.");
    }

    // Function to insert a string at a particular index in the list
    private static void insertString(ArrayList<String> list, int index, String str) {
        if (index >= 0 && index <= list.size()) {
            list.add(index, str);
            System.out.println("String '" + str + "' inserted at index " + index + ".");
        } else {
            System.out.println("Invalid index. String not inserted.");
        }
    }

    // Function to list all strings starting with a given letter
    private static void listStringsWithLetter(ArrayList<String> list, char letter) {
        System.out.println("Strings starting with '" + letter + "':");
        for (String str : list) {
            if (str.toLowerCase().startsWith(String.valueOf(letter).toLowerCase())) {
                System.out.println(str);
            }
        }
    }
}
