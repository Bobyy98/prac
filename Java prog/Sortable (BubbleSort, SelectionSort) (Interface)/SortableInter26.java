import java.util.Scanner;

// Define the Sortable interface
interface Sortable {
    void sort(int[] arr);
}

// Implement BubbleSort class
class BubbleSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    // Swap arr[i-1] and arr[i]
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}

// Implement SelectionSort class
class SelectionSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap arr[i] and arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}

public class SortableInter26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Use BubbleSort to sort the array
        Sortable bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);
        System.out.println("Sorted using BubbleSort:");
        printArray(arr);

        // Use SelectionSort to sort the array
        int[] arr2 = new int[n];
        System.arraycopy(arr, 0, arr2, 0, n); // Copy the original array
        Sortable selectionSort = new SelectionSort();
        selectionSort.sort(arr2);
        System.out.println("\nSorted using SelectionSort:");
        printArray(arr2);

        scanner.close();
    }

    // Helper method to print an array
    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
