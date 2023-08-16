import java.util.Scanner;

public class DisariumNoCheck13
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: "); // 125
        int number = sc.nextInt();

        boolean isDisarium = isDisariumNo(number);

        if (isDisarium)
        {
            System.out.println("Output: True");
        }
        else
        {
            System.out.println("Output: False");
        }

        sc.close();
    }

    static boolean isDisariumNo(int num)
    {
        String numStr = Integer.toString(num);
        int sum = 0;

        for (int i = 0; i < numStr.length(); i++)
        {
            int dig = Character.getNumericValue(numStr.charAt(i));
            sum += Math.pow(dig, i + 1);
        }

        return sum == num;
    }
}
