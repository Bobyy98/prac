import java.util.Scanner;

public class OddishEvenish14
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: "); // 12, 35
        int number = sc.nextInt();

        int sumOfDigits = calcSumOfDigits(number);

        if(sumOfDigits % 2 == 0)
        {
            System.out.println("Evenish");
        }
        else
        {
            System.out.println("Oddish");
        }

        sc.close();
    }

    public static int calcSumOfDigits(int num)
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
