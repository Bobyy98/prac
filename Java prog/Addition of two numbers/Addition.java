import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st integer: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter 2nd integer: ");
        int n2 = scanner.nextInt();

        int sum = n1 + n2;

        System.out.print("Sum of " + n1 + " + "+ n2 +" = " + sum);

        scanner.close();
    }
}
