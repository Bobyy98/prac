import java.util.Scanner;

public class gcdlcmssc
{
    public static int gcd(int a, int b)
    {
        if (b == 0)
        {
            return a;
        }
        return gcd(b, a % b);
    }
    public static int lcm(int a, int b)
    {
        return (a * b)/ gcd(a, b);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();

        int gcdres = gcd(num1, num2);
        int lcmres = lcm(num1 ,num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcdres);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcmres);

        sc.close();
    }
}
