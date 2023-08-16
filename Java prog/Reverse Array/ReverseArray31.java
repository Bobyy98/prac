import java.util.Scanner;

public class ReverseArray31
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array: ");
        for (int num : arr)
        {
            System.out.print(num + " ");
        }

        System.out.println("\nArray in reverse order: ");
        for (int i = arr.length - 1; i >= 0; i--)
        {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
} 
