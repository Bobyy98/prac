import java.util.Scanner;

public class AutomorphicNo18
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: "); // 76
        int number = sc.nextInt();  

        if (isAuto(number))
        {
            System.out.println(number + " is an automorphic number.");
        }
        else
        {
            System.out.println(number + " is not an automorphic number.");
        }

        sc.close();
    }

    public static boolean isAuto(int n)
    {
        int square = n * n;

        while (n > 0)
        {
            if (n % 10 != square % 10)
            {
                return false;
            }

            n = n / 10;
            square = square / 10;
        }

        return true;
    }
}
