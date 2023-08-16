import java.util.Scanner;

public class HarshadNo19
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: "); // 156
        int number = sc.nextInt();

        if (isHarshadNo(number))
        {
            System.out.println(number + " is a Harshad number.");
        }
        else
        {
            System.out.println(number + " is not a Harshad number.");
        }

        sc.close();
    }

    public static boolean isHarshadNo(int num)
    {
        int sumOfDigits = calcSumOfDigits19(num);
        return num % sumOfDigits == 0;
    }

    public static int calcSumOfDigits19(int num)
    {
        int sum = 0;
        while (num > 0)
        {
            sum = sum + num % 10;
            num = num / 10;
        }

        return sum;
    }
}
