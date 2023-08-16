import java.util.Scanner;

public class MathUtilityMaxMin29
{
    public int findMaximum(int[] arr)
    {
        if(arr == null || arr.length == 0)
        {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }

    public int findMinimum(int[] arr)
    {
        if (arr == null || arr.length == 0)
        {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        MathUtilityMaxMin29 mathUtility = new MathUtilityMaxMin29();

        int max = mathUtility.findMaximum(numbers);
        int min = mathUtility.findMinimum(numbers);

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        
        sc.close();
    }
} 
