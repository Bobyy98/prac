import java.util.Scanner;

public class MissingExponentCalc12
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter the result (b): ");
        double b = sc.nextDouble();

        // Calculate the logarithm base a of b to find the exponent x
        double x = Math.log(b) / Math.log(a);

        System.out.println("x = " + x);

        sc.close();
    }
}
