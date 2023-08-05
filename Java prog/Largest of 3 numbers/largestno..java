import java.util.Scanner;

public class largestno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (n1): ");
        int n1 = scanner.nextInt();

        System.out.print("Enter the second number (n2): ");
        int n2 = scanner.nextInt();

        System.out.print("Enter the third number (n3): ");
        int n3 = scanner.nextInt();

        int large = n1; // Assume n1 is the largest initially

        // Compare n2 with the current largest
        if (n2 > large) {
            large = n2;
        }

        // Compare n3 with the current largest
        if (n3 > large) {
            large = n3;
        }

        System.out.println("The largest number among " + n1 + ", " + n2 + ", and " + n3 + " is: " + large);

        scanner.close();
    }
}
