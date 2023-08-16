import java.util.Scanner;

public class FibonacciSeries40 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();
        
        

        System.out.println("Fibonacci Series:");
        int first = 0, second = 1;
        System.out.print(first + ", " + second);

        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }
        
        scanner.close();
    }
}
