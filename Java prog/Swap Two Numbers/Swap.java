import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter 2nd number: ");
        int n2 = scanner.nextInt();

        System.out.println("\nBefore swapping:");
        System.out.println("First number: " + n1);
        System.out.println("Second number: " + n2);

        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("\nAfter swapping:");
        System.out.println("First number: " + n1);
        System.out.println("Second number: " + n2);

        scanner.close();
    }
}
