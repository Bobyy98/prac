class methodns
{
    public int gcd(int a, int b)
    {
        if (b == 0)
        {
            return a;
        }
        return gcd(b, a % b);
    }

    public int lcm(int a, int b)
    {
        return (a * b) / gcd(a, b);
    }
}

public class gcdlcmnsoccmd
{
    public static void main(String[] args)
    {
        methodns calculator = new methodns();

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int gcdRes = calculator.gcd(num1, num2);
        int lcmRes = calculator.lcm(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcdRes);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcmRes);
    }
}
