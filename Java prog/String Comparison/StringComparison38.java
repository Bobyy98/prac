import java.util.Scanner;

public class StringComparison38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Using equals() method for case-sensitive comparison
        boolean isEqual1 = str1.equals(str2);

        // Using equalsIgnoreCase() method for case-insensitive comparison
        boolean isEqualIgnoreCase1 = str1.equalsIgnoreCase(str2);

        System.out.println("\nUsing equals() method:");
        System.out.println("str1 equals str2: " + isEqual1);

        System.out.println("\nUsing equalsIgnoreCase() method:");
        System.out.println("str1 equals (ignore case) str2: " + isEqualIgnoreCase1);

        scanner.close();
    }
}
