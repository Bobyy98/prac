import java.util.Scanner;

public class Armstrong37 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        

        if (isArmstrongNumber(number)) 
        {
            System.out.println(number + " is an Armstrong number.");
        } 
        else 
        {
            System.out.println(number + " is not an Armstrong number.");
        }
        scanner.close();
    }

    // Function to check if a number is an Armstrong number
    static boolean isArmstrongNumber(int num) {
        int originalNum = num;
        int sum = 0;
        int numDigits = (int) Math.log10(num) + 1; // Calculate the number of digits

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }

        return originalNum == sum;
    }
}
