import java.util.Scanner;

public class arm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int og = num;
        int sum = 0;
        
        while (num > 0) {
            int dig = num % 10;
            sum += dig * dig * dig;
            num /= 10;
        }
        
        if (sum == og) {
            System.out.println(og + " is an Armstrong number.");
        } else {
            System.out.println(og + " is not an Armstrong number.");
        }
        scanner.close();
    }
}
