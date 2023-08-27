public class FactRecCmd
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int fact = calcFact(n);
        System.out.println("Factorial of " + n + " is: " +  fact);
    }

    public static int calcFact(int n)
    {
        if (n == 0 || n == 1)
        {
            return 1;
        }
        else
        {
            return n* calcFact(n-1);
        }
    }
}
