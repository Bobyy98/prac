import java.util.Scanner;

public class compsum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt(); // to store the value of n

        if (n <= 0) {
            System.out.println("Input is not valid. Please enter a positive integer.");// error if n is -ve
        } else {
            int sum = 0; // counter
            for (int i = 0; i < 2 * n; i += 2) {
                if (i % 3 == 0) {
                    sum += i;
                }
            }
            System.out.println("Sum of even numbers divisible by 3 from 0 to " + (2 * n) + ": " + sum);
        }

        scanner.close();
    }
}
