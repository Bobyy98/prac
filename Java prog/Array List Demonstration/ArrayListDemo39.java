import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo39 {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        // Print the ArrayList
        System.out.println("ArrayList contains: " + fruits);

        // Get the size of the ArrayList
        int size = fruits.size();
        System.out.println("ArrayList size: " + size);

        // Access elements by index
        System.out.println("Element at index 2: " + fruits.get(2));

        // Modify an element
        fruits.set(1, "Orange");
        System.out.println("Modified ArrayList: " + fruits);

        // Remove an element
        fruits.remove(3);
        System.out.println("ArrayList after removing element at index 3: " + fruits);

        // Check if an element exists
        boolean containsCherry = fruits.contains("Cherry");
        System.out.println("ArrayList contains 'Cherry': " + containsCherry);

        // Iterate over the ArrayList using an iterator
        System.out.print("ArrayList elements (using iterator): ");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Iterate over the ArrayList using a for-each loop
        System.out.print("ArrayList elements (using for-each loop): ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // Clear the ArrayList
        fruits.clear();
        System.out.println("ArrayList after clearing: " + fruits);
    }
}
