import java.util.Scanner;

public class NumberSum11 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int nn = n * 10 + n;
        int nnn = nn * 10 + n;

        int sum = n + nn + nnn;

        System.out.println("Output: " + n + " + " + nn + " + " + nnn + " = " + sum);

        sc.close();
    }
}
