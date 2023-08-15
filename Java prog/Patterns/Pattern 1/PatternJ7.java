import java.util.Scanner;

public class PatternJ7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of rows: ");

        int r = sc.nextInt();

        for (int i = 1; i <= r; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i + " ");
            }

            System.out.print("\n");
        }

        sc.close();
    }
}
