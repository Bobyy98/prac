import java.util.Scanner;

public class PerfectNumber16
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: "); // 6, 28
        int number = sc.nextInt();

        if (isPerfectNumber(number))
        {
            System.out.println(number + " is a perfect number.");
        }
        else
        {
            System.out.println(number + " is not a perfect.");
        }

        sc.close();
    }

    public static boolean isPerfectNumber(int num)
    {
        if (num <= 1)
        {
            return false;
        }

        int sumOfFactors = 1; // 1 is always a factor

        for (int i = 2; i <= num / 2; i++)
        {
            if (num % i == 0)
            {
                sumOfFactors = sumOfFactors + i;
            }
        }

        return sumOfFactors == num;
    }
}
