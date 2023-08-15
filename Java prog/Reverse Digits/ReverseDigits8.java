import java.util.Scanner;

public class ReverseDigits8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int revnum = revDig(number);
        System.out.println("Reversed number: " + revnum);

        sc.close();
    }

    public static int revDig(int num)
    {
        int rev = 0;

        while (num != 0)
        {
            int dig = num % 10; //Extracts the last digit
            rev = rev * 10 + dig; // Add the digit to the reversed number
            num = num / 10; // Remove the last digit from the original number
        }

        return rev;
    }
}
