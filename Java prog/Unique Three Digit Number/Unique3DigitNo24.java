import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Unique3DigitNo24
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N (between 3 and 10): ");
        int N = sc.nextInt();

        if (N < 3 || N > 10)
        {
            System.out.println("Invalid input. N musst be between 3 and 10.");
        }

        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int i = 1; i <= N; i++)
        {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();

            if (num >= 100 && num <= 999)
            {
                uniqueNumbers.add(num);
            }
            else
            {
                System.out.println("Number must be a 3 digit number.");
                i--;
            }
        }

        sc.close();

        System.out.println("\nUnique 3 digit numbers: ");
        for (int number : uniqueNumbers)
        {
            System.out.println((number));
        }

        System.out.println("\nCount of unique 3 digit numbers: " + uniqueNumbers.size());
    }
}
