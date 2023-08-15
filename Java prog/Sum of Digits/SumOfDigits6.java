import java.util.Scanner;

public class SumOfDigits6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int sum = calcSum(number);

        System.out.println("Sum of digits: " + sum);

        sc.close();
    }

    public static int calcSum(int num)
    {
        int sum = 0;

        // Take the absolute value to handle negative numbers
        num = Math.abs(num);

        while (num > 0)
        {
            int dig = num % 10; // Get the last digit
            sum = sum + dig; // Add the digit to the sum
            num = num / 10; // Remove the last digit
        }

        return sum;
    }
}
