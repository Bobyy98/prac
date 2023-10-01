import java.util.Scanner;

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

public class InputValidator33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int age = getValidAge(scanner);
            System.out.println("Valid age: " + age);

            double score = getValidScore(scanner);
            System.out.println("Valid score: " + score);
        } catch (InvalidInputException e) {
            System.err.println("Invalid input: " + e.getMessage());
        }

        scanner.close();
    }

    private static int getValidAge(Scanner scanner) throws InvalidInputException {
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 0 || age > 120) {
            throw new InvalidInputException("Age must be between 0 and 120.");
        }

        return age;
    }

    private static double getValidScore(Scanner scanner) throws InvalidInputException {
        System.out.print("Enter your score: ");
        double score = scanner.nextDouble();

        if (score < 0 || score > 100) {
            throw new InvalidInputException("Score must be between 0 and 100.");
        }

        return score;
    }
}
