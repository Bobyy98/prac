import java.util.*;

public class DuplicateNumberChecker34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of integers (separated by spaces): ");
        
        String input = scanner.nextLine();
        String[] numStrings = input.split("\\s+");
        List<Integer> numbers = new ArrayList<>();

        scanner.close();

        for (String numString : numStrings) {
            try {
                int num = Integer.parseInt(numString);
                numbers.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + numString + " is not a valid integer.");
                return;
            }
        }

        List<Integer> duplicates = findDuplicates(numbers);
        
        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found.");
        } else {
            System.out.println("Duplicate numbers found: " + duplicates);
        }
    }

    public static List<Integer> findDuplicates(List<Integer> numbers) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        for (int num : numbers) {
            if (!seen.add(num) && !duplicates.contains(num)) {
                duplicates.add(num);
            }
        }

        return duplicates;
    }
}
