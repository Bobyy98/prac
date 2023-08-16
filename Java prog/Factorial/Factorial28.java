import java.util.Scanner;

public class Factorial28
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();
        long fact = calcFact(number);
        System.out.println("Factorial of " + number + " is: " + fact);

        sc.close();
    }

    public static long calcFact(int n)
    {
        if (n == 0 || n == 1)
        {
            return 1;
        }
        else
        {
            return n * calcFact(n-1);
        }
    }
}
