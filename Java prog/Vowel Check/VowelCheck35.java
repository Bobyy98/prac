import java.util.Scanner;

public class VowelCheck35 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        try {
            checkForVowels(inputString);
            System.out.println("The string contains vowels.");
        } catch (NoVowelsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        
        scanner.close();
    }

    public static void checkForVowels(String input) throws NoVowelsException {
        if (!containsVowels(input)) {
            throw new NoVowelsException("The string does not contain any vowels.");
        }
    }

    public static boolean containsVowels(String str) {
        String lowercaseStr = str.toLowerCase();
        return lowercaseStr.contains("a") || lowercaseStr.contains("e")
                || lowercaseStr.contains("i") || lowercaseStr.contains("o")
                || lowercaseStr.contains("u");
    }
}

class NoVowelsException extends Exception {
    public NoVowelsException(String message) {
        super(message);
    }
}
